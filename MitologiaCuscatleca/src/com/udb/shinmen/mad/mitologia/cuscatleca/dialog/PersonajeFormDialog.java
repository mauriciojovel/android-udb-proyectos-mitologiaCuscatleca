package com.udb.shinmen.mad.mitologia.cuscatleca.dialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.widget.EditText;

import com.udb.shinmen.mad.mitologia.cuscatleca.R;

public class PersonajeFormDialog extends DialogFragment {
    
    EditText textNombre;
    EditText textSipnosis;
    EditText textLinkInteres;
    
    OnAcceptDialog listener;
    
    public interface OnAcceptDialog {
        void onAcceptDialog(String nombre, String sipnosis, String linkInteres);
    }
    
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof OnAcceptDialog) {
            listener = (OnAcceptDialog) activity;
        } else {
            throw new RuntimeException("La actividad debe implementar "
                        + OnAcceptDialog.class.getCanonicalName());
        }
    }
    
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d = null;
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.dialog_personaje_form, null));
        builder.setPositiveButton(
                R.string.aceptar, new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {
                PersonajeFormDialog.this.
                textNombre = (EditText) getDialog()
                                    .findViewById(R.id.textNombre);
                textSipnosis = (EditText) getDialog()
                                    .findViewById(R.id.textSipnosis);
                textLinkInteres = (EditText) getDialog()
                                .findViewById(R.id.textLinksInteres);
                listener.onAcceptDialog(textNombre.getText().toString()
                        , textSipnosis.getText().toString()
                        , textLinkInteres.getText().toString());
            }
            
        })
        .setNegativeButton(R.string.cancelar
                , new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialog, int id) {
                   PersonajeFormDialog.this.getDialog().cancel();
               }
        })
        .setTitle(R.string.nuevo_personaje); 
        d = builder.create();
        return d;
    }
    
}
