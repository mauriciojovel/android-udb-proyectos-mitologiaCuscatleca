package com.udb.shinmen.mad.mitologia.cuscatleca.fragment;

import java.io.Serializable;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.View;
import android.widget.ListView;

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
		android.R.id.text1
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
				, android.R.layout.simple_list_item_1
				, personajeSQLiteOpenHelper.findAll(DB.Personaje.nombre)
				, FROM, TO, 0);
		v = getActivity().findViewById(-1);//FIXME poner un id valido
		dualPane = (v != null && v.getVisibility() == View.VISIBLE);
		if(savedInstanceState != null) {
			currentPos = savedInstanceState.getInt(CURR_POS, -1);
		}
		if(dualPane) {
			getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		}
		setListAdapter(adapter);
		
		showItem(currentPos);
	}
	
	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt(CURR_POS, currentPos);
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		showItem(position);
	}

	public void showItem(int currentPos) {
		
	}
}
