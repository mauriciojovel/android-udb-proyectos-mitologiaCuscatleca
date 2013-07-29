package com.udb.shinmen.mad.mitologia.cuscatleca.fragment;


import com.udb.shinmen.mad.mitologia.cuscatleca.R;
import com.udb.shinmen.mad.mitologia.cuscatleca.SQLiteHelper.PersonajeSQLiteOpenHelper;
import com.udb.shinmen.mad.mitologia.cuscatleca.constant.DB;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PersonajeDetailFragment extends Fragment{
	
	static final String CURR_POS_DETAIL = "com.udb.shinmen.mad.mitologia"
			+ ".cuscatleca.fragment.PersonajeDetailFragment.CURR_POS_DETAIL";
	static final String DUAL_PANE = "com.udb.shinmen.mad.mitologia"
            + ".cuscatleca.fragment.PersonajeDetailFragment.DUAL_PANE";
	PersonajeSQLiteOpenHelper personajeSQLiteOpenHelper;
	
	public static PersonajeDetailFragment newInstance(long id, boolean dualPane) {
		PersonajeDetailFragment p = new PersonajeDetailFragment();
		Bundle b = new Bundle();
		b.putLong(CURR_POS_DETAIL, id);
		b.putBoolean(DUAL_PANE, dualPane);
		p.setArguments(b);
		return p;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		TextView textView = null;
		View v = inflater.inflate(R.layout.activity_personaje_detail
												, container, false);
		personajeSQLiteOpenHelper = 
				new PersonajeSQLiteOpenHelper(getActivity());
		Cursor data = personajeSQLiteOpenHelper.get(getIndex());
		
		if(data.moveToFirst()) {
			textView = (TextView) v.findViewById(R.id.txvNombre);
			textView.setText(data.getString(DB.Personaje.nombre.ordinal()));
			if(isDualPane()) {
			    textView.setVisibility(View.GONE);
			}
			textView = (TextView) v.findViewById(R.id.txvSipnosis);
			textView.setText(data.getString(DB.Personaje.sipnosis.ordinal()));
		}
		data.close();
		personajeSQLiteOpenHelper.close();
		return v;
	}
	
	public long getIndex() {
		return getArguments().getLong(CURR_POS_DETAIL);
	}
	
	public boolean isDualPane() {
	    return getArguments().getBoolean(DUAL_PANE);
	}
	
}
