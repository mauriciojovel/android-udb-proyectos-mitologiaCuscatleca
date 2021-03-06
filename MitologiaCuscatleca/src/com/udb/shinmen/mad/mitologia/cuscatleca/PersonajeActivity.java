package com.udb.shinmen.mad.mitologia.cuscatleca;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.udb.shinmen.mad.mitologia.cuscatleca.dialog.PersonajeFormDialog;
import com.udb.shinmen.mad.mitologia.cuscatleca.dialog.PersonajeFormDialog.OnAcceptDialog;
import com.udb.shinmen.mad.mitologia.cuscatleca.fragment.PersonajesListFragment;

public class PersonajeActivity extends ActionBarActivity 
                                        implements OnAcceptDialog{
    private int RESULT_LOAD_IMAGE = 10;
    PersonajeFormDialog newFragment;
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
        case R.id.action_orden:
            showNewOrden();
            break;
        case R.id.action_about:
            showAbout();
            break;
        default:
            r = super.onOptionsItemSelected(item);
            break;
        }
	    return r;
	}

    private void showAbout() {
        AlertDialog.Builder builder =
                new AlertDialog.Builder(this);
 
        builder.setMessage(getResources().getString(R.string.acercaDeInfo))
               .setTitle(getResources().getString(R.string.acercaDe))
               .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {
                       dialog.cancel();
                   }
               });
        Dialog d = builder.create();
        d.show();
    }

    private void showNewOrden() {
        PersonajesListFragment p = 
                (PersonajesListFragment) 
                  getSupportFragmentManager()
                    .findFragmentById(R.id.listPersonajes);
        if(p != null) {
            p.orden();
        } else {
            Toast.makeText(this, "Ups algo no esta bien", Toast.LENGTH_SHORT)
                                    .show();
        }
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
        newFragment = new PersonajeFormDialog();
        newFragment.show(ft, "dialog");
        
    }

    @Override
    public void onAcceptDialog(String nombre, String sipnosis,
            String linkInteres, String url) {
        PersonajesListFragment p = (PersonajesListFragment) 
                getSupportFragmentManager()
                    .findFragmentById(R.id.listPersonajes);
        p.save(nombre, sipnosis, linkInteres, url);
    }
    
    public void onClick(View v) {
        
        Intent i = new Intent(Intent.ACTION_PICK
                ,android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                 
                startActivityForResult(i, RESULT_LOAD_IMAGE);
        
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode
            , Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
         
        if (requestCode == RESULT_LOAD_IMAGE 
                && resultCode == RESULT_OK && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = { MediaStore.Images.Media.DATA };
    
            Cursor cursor = getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();
    
            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath = cursor.getString(columnIndex);
            cursor.close();
            try {
                newFragment.loadImage(picturePath);
            } catch(Exception ex) {
                //FIXME por alguna razon al haber hecho clic en nuevo
                // personaje y luego girar la pantalla el picker
                // carga una direccion no valida.
                Log.e("MitologiaCuscatleca", "Error al girar la pantalla" ,ex);
                Toast.makeText(this, getResources()
                        .getString(R.string.error_giro_pantalla)
                        , Toast.LENGTH_SHORT).show();
            }
            
        }
    }

}
