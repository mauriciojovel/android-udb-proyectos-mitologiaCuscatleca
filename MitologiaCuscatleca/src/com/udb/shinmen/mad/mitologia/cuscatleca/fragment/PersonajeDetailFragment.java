package com.udb.shinmen.mad.mitologia.cuscatleca.fragment;


import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.udb.shinmen.mad.mitologia.cuscatleca.R;
import com.udb.shinmen.mad.mitologia.cuscatleca.SQLiteHelper.PersonajeSQLiteOpenHelper;
import com.udb.shinmen.mad.mitologia.cuscatleca.constant.DB;

public class PersonajeDetailFragment extends Fragment implements OnClickListener{
	
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
		BitmapFactory.Options options = new BitmapFactory.Options();
		Bitmap bm;
		ImageView img;
		String pathImg;
		
        options.inSampleSize = 2;
        
        
		if(data.moveToFirst()) {
		    //Nombre personaje
			textView = (TextView) v.findViewById(R.id.txvNombre);
			textView.setText(data.getString(DB.Personaje.nombre.ordinal()));
			if(isDualPane()) {
			    textView.setVisibility(View.GONE);
			}
			//Sipnosis
			textView = (TextView) v.findViewById(R.id.txvSipnosis);
			textView.setText(data.getString(DB.Personaje.sipnosis.ordinal()));
			//Imagen
			img = (ImageView) v.findViewById(R.id.imageView1);
			pathImg = data.getString(DB.Personaje.ruta_imagen.ordinal());
			if(pathImg != null && !pathImg.trim().equals("")) {
    	        bm = BitmapFactory.decodeFile(pathImg, options);
    	        img.setImageBitmap(bm);
			}
			//Link interes
			textView = (TextView) v.findViewById(R.id.txvLinkInteres);
            textView.setText(data.getString(DB.Personaje
                                                    .link_interes.ordinal()));
            textView.setOnClickListener(this);
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
	
	public void callWebBrowser(String url) {
	    if(url != null && !url.trim().equals("")) {
            Intent callIntent = new Intent(Intent.ACTION_VIEW);
            if(url.startsWith("http")) {
                callIntent.setData(Uri.parse(url));
            } else {
                callIntent.setData(Uri.parse("http://"+url));
            }
            startActivity(callIntent);
	    }

	}

    @Override
    public void onClick(View v) {
        if (v instanceof TextView) {
            TextView t = (TextView) v;
            callWebBrowser(t.getText().toString());
        }        
    }
	
}
