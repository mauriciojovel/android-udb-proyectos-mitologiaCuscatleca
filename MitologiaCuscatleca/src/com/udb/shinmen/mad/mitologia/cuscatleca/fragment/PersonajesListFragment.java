package com.udb.shinmen.mad.mitologia.cuscatleca.fragment;

import java.io.Serializable;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.View;
import android.widget.ListView;

import com.udb.shinmen.mad.mitologia.cuscatleca.DetailActivity;
import com.udb.shinmen.mad.mitologia.cuscatleca.R;
import com.udb.shinmen.mad.mitologia.cuscatleca.SQLiteHelper.PersonajeSQLiteOpenHelper;
import com.udb.shinmen.mad.mitologia.cuscatleca.constant.DB;

public class PersonajesListFragment extends ListFragment
			implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final String CURR_POS = "com.udb.shinmen.mad.mitologia"
			+ ".cuscatleca.fragment.PersonajesListFragment.CURR_POS";

	private static final String[] FROM = {
		DB.PersonajeDescribe.NOMBRE
	};

	private static final int[] TO = {
		R.id.ctvTituloPersonaje
	};
	
	SimpleCursorAdapter adapter;
	boolean dualPane;
	int currentPos;
	PersonajeSQLiteOpenHelper personajeSQLiteOpenHelper;
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		View v = null;
		personajeSQLiteOpenHelper = 
				new PersonajeSQLiteOpenHelper(getActivity());
		adapter = new SimpleCursorAdapter(getActivity()
				, R.layout.personaje_list_item
				, personajeSQLiteOpenHelper.findAll(DB.Personaje.nombre)
				, FROM, TO, 0);
		v = getActivity().findViewById(R.id.detailPersonaje);
		dualPane = (v != null && v.getVisibility() == View.VISIBLE);
		if(savedInstanceState != null) {
			currentPos = savedInstanceState.getInt(CURR_POS, -1);
		}
		if(dualPane) {
			getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
			showItem(currentPos);
		}
		setListAdapter(adapter);
	}
	
	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt(CURR_POS, currentPos);
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		//super.onListItemClick(l, v, position, id);
		showItem(position);
	}

	public void showItem(int currentPos) {
		this.currentPos = currentPos;
		Cursor c = (Cursor) adapter.getItem(currentPos);
		long id = c.getLong(DB.Personaje._id.ordinal());
		if(dualPane) {
			getListView().setItemChecked(currentPos, true);
			PersonajeDetailFragment p = 
					(PersonajeDetailFragment)getFragmentManager()
										.findFragmentById(R.id.detailPersonaje);
			if(p == null || p.getIndex() != id) {
				p = PersonajeDetailFragment.newInstance(id);
				FragmentTransaction ft = getFragmentManager()
													.beginTransaction();
				ft.replace(R.id.detailPersonaje, p);
				ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
				ft.commit();
			}
		} else {
			Intent i = new Intent();
			i.setClass(getActivity(), DetailActivity.class);
			i.putExtra(PersonajeDetailFragment.CURR_POS_DETAIL, id);
			startActivity(i);
		}
	}
}
