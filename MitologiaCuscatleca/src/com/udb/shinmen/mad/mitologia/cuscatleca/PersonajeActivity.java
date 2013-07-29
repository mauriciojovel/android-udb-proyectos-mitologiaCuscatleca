package com.udb.shinmen.mad.mitologia.cuscatleca;

import com.udb.shinmen.mad.mitologia.cuscatleca.dialog.PersonajeFormDialog;
import com.udb.shinmen.mad.mitologia.cuscatleca.dialog.PersonajeFormDialog.OnAcceptDialog;
import com.udb.shinmen.mad.mitologia.cuscatleca.fragment.PersonajesListFragment;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class PersonajeActivity extends FragmentActivity implements OnAcceptDialog{

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
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    boolean r = true;
	    switch (item.getItemId()) {
        case R.id.action_pesonaje_form:
            showPersonajeDialog();
            break;

        default:
            break;
        }
	    return r;
	}

    private void showPersonajeDialog() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Fragment prev = getSupportFragmentManager().findFragmentByTag("dialog");
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);

        // Create and show the dialog.
        DialogFragment newFragment = new PersonajeFormDialog();
        newFragment.show(ft, "dialog");
        
    }

    @Override
    public void onAcceptDialog(String nombre, String sipnosis,
            String linkInteres) {
        PersonajesListFragment p = (PersonajesListFragment) 
                getSupportFragmentManager()
                    .findFragmentById(R.id.listPersonajes);
        p.save(nombre, sipnosis, linkInteres);
        Toast.makeText(this, "Guardado", Toast.LENGTH_SHORT).show();
    }

}
