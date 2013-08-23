package com.udb.shinmen.mad.mitologia.cuscatleca;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.udb.shinmen.mad.mitologia.cuscatleca.SQLiteHelper.PersonajeSQLiteOpenHelper;
import com.udb.shinmen.mad.mitologia.cuscatleca.constant.DB;
import com.udb.shinmen.mad.mitologia.cuscatleca.provider.CuentoProvider;

import fi.harism.curl.CurlView;

public class BookDetailActivity extends ActionBarActivity 
                implements CurlView.SizeChangedObserver {
    public static final String EXTRA_HISTORY = "EXTRA_HISTORY";
    public static final String SAVED_CURRENT_PAGE = "currentPage";
    private CurlView pageView;
    private PersonajeSQLiteOpenHelper personajeSQLiteOpenHelper;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_page_activity);
        String[] history = getHistory();
        pageView = (CurlView) findViewById(R.id.page);
        pageView.setPageProvider(new CuentoProvider(history[0]
                                                , this, history[1]));
        pageView.setSizeChangedObserver(this);
        if(savedInstanceState != null) {
            pageView.setCurrentIndex(savedInstanceState
                                    .getInt(SAVED_CURRENT_PAGE, 0));
        } else {
            pageView.setCurrentIndex(0);
        }
        pageView.setBackgroundColor(0xFF202830);
        getSupportActionBar().setHomeButtonEnabled(true);
    }
    
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.context_share_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    
    public void callShare(String nombrePersonaje, String sipnosis) {
        if(getPos() > 0) {
            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT
                    ,getResources()
                    .getString(R.string.title_activity_personaje)
                    + ": "
                    +nombrePersonaje);
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT
                    , sipnosis.replaceAll("<br/>"
                            , System.getProperty("line.separator"))
                            +System.getProperty("line.separator")
                            +System.getProperty("line.separator")
                            +getResources().getString(R.string.mensajeCompartir)
            );
            startActivity(Intent.createChooser(sharingIntent, getResources()
                    .getString(R.string.compartir)));
        } else {
            Toast.makeText(this
                    , getResources().getString(R.string.errorNoSeleccion)
                    , Toast.LENGTH_SHORT).show();
        }
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        pageView.onPause();
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        pageView.onResume();
    }
    
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(SAVED_CURRENT_PAGE, pageView.getCurrentIndex());
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean r = true;
        switch (item.getItemId()) {
        case android.R.id.home:
            NavUtils.navigateUpFromSameTask(this);
            break;
        case R.id.action_personaje_share:
            personajeSQLiteOpenHelper = new PersonajeSQLiteOpenHelper(
                    this);
            Cursor data = personajeSQLiteOpenHelper.get(getPos());
            String nombre = "-Ups-";
            String sipnosis = "Esto no debio de haber pasado";
            if (data.moveToFirst()) {
                nombre = data.getString(DB.Personaje.nombre.ordinal());
                sipnosis = data.getString(DB.Personaje.sipnosis.ordinal());
            }
            data.close();
            callShare(nombre, sipnosis);
            break;
        default:
            r = super.onOptionsItemSelected(item);
            break;
        }
        return r;
    }
    
    public long getPos() {
        return getIntent().getExtras().getLong(EXTRA_HISTORY);
    }
    
    private String[] getHistory() {
        String[] p = new String[2];
        long pos = getPos();
        personajeSQLiteOpenHelper = new PersonajeSQLiteOpenHelper(this);
        Cursor data = personajeSQLiteOpenHelper.get(pos);
        if (data.moveToFirst()) {
            p[0] = data.getString(DB.Personaje.sipnosis.ordinal());
            p[1] = data.getString(DB.Personaje.ruta_imagen.ordinal());
        }
        return p;
    }

    @Override
    public void onSizeChanged(int width, int height) {
        /*if (width > height) {
            pageView.setViewMode(CurlView.SHOW_TWO_PAGES);
            pageView.setMargins(.01f, .05f, .01f, .05f);
        } else {
            pageView.setViewMode(CurlView.SHOW_ONE_PAGE);
            pageView.setMargins(.01f, .01f, .01f, .01f);
        }
        */
        pageView.setViewMode(CurlView.SHOW_ONE_PAGE);
        pageView.setMargins(.01f, .01f, .01f, .01f);
    }

}
