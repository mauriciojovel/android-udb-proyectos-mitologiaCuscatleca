package com.udb.shinmen.mad.mitologia.cuscatleca;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

public class PersonajeActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_personaje);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.personaje, menu);
		return true;
	}

}
