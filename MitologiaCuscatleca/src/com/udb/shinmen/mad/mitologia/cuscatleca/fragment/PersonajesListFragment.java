package com.udb.shinmen.mad.mitologia.cuscatleca.fragment;

import java.io.Serializable;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.AdapterContextMenuInfo;

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
	int currentPos=-1;
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
		registerForContextMenu(getListView());
	}
	
	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putInt(CURR_POS, currentPos);
	}
	
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		showItem(position);
	}
	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
	        ContextMenuInfo menuInfo) {
	    super.onCreateContextMenu(menu, v, menuInfo);
	    AdapterView.AdapterContextMenuInfo info 
	                            = (AdapterContextMenuInfo) menuInfo;
	    Cursor c = (Cursor) adapter.getItem(info.position);
	    if(c != null) {
	        //Solo se muestra el menu si el dato es ingresado por el usuario
	        if(c.getInt(DB.Personaje.ingresado_usuario.ordinal())==1) {
	            menu.setHeaderTitle(c.getString(DB.Personaje.nombre.ordinal()));
	            MenuInflater inflater = getActivity().getMenuInflater();
	            inflater.inflate(R.menu.context_personaje_menu, menu);
	        }
	    }
	    
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
	    AdapterView.AdapterContextMenuInfo info 
	            = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
	    switch (item.getItemId()) {
        case R.id.action_personaje_delete:
            Cursor c = (Cursor) adapter.getItem(info.position);
            delete(c.getLong(DB.Personaje._id.ordinal()));
            break;

        default:
            break;
        }
	    return super.onContextItemSelected(item);
	}
	
	public void delete(long key) {
	    personajeSQLiteOpenHelper.delete(key);
	    refresh();
	    currentPos = -1;
	}
	
	public void refresh() {
	    adapter = new SimpleCursorAdapter(getActivity()
                , R.layout.personaje_list_item
                , personajeSQLiteOpenHelper.findAll(DB.Personaje.nombre)
                , FROM, TO, 0);
        setListAdapter(adapter);
        
        // Recargamos el fragment si es dual
        if(dualPane) {
            PersonajeDetailFragment p = 
                    (PersonajeDetailFragment) getFragmentManager()
                                .findFragmentById(R.id.detailPersonaje);
            if (p == null || p.getIndex() != -1) {
                p = PersonajeDetailFragment.newInstance(-1, true);
                FragmentTransaction ft = getFragmentManager()
                        .beginTransaction();
                ft.replace(R.id.detailPersonaje, p);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
            }
        }
	}

	public void save(String nombre, String sipnosis, String linkInteres
	        , String url) {
	    personajeSQLiteOpenHelper.save(nombre, sipnosis, url, linkInteres);
	    refresh();
	    
	}
	
	public void showItem(int currentPos) {
		this.currentPos = currentPos;
		Cursor c = null;
		if (currentPos >= 0) {
            c = (Cursor) adapter.getItem(currentPos);
            long id = c.getLong(DB.Personaje._id.ordinal());
            if (dualPane) {
                //FIXME revisar porque no se muestra como seleccionado el item
                //      cuando es primera vez.
                //getListView().setItemChecked(currentPos, true);
                PersonajeDetailFragment p = 
                        (PersonajeDetailFragment) getFragmentManager()
                                    .findFragmentById(R.id.detailPersonaje);
                if (p == null || p.getIndex() != id) {
                    p = PersonajeDetailFragment.newInstance(id, true);
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
                i.putExtra(PersonajeDetailFragment.DUAL_PANE, false);
                startActivity(i);
            }
        }
	}
}
