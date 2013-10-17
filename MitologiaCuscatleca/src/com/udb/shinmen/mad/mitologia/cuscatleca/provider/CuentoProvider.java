package com.udb.shinmen.mad.mitologia.cuscatleca.provider;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;

import com.udb.shinmen.mad.mitologia.cuscatleca.R;
import com.udb.shinmen.mad.mitologia.cuscatleca.util.TextDrawable;

import fi.harism.curl.CurlPage;
import fi.harism.curl.CurlView;

public class CuentoProvider implements CurlView.PageProvider {

    private String originalText;
    private List<Drawable> pages;
    private Context context;
    private String nombreImagen;
    
    
    
    public CuentoProvider(String originalText, Context context
            , String nombreImagen) {
        super();
        this.originalText = originalText;
        this.context = context;
        this.nombreImagen = nombreImagen;
    }
    
    public CuentoProvider(String originalText, Context context) {
        this(originalText, context, null);
    }
    
    private void initPages(String history,int width,int height) {
        TextDrawable textPage = new TextDrawable(context);
        List<String> lines = new ArrayList<String>();
        String[] words = history.split(" ");
        float widthPaint = 0;
        float wordSize = 0;
        String temp = "";
        float heightText = 0;
        TextDrawable currentPage = null;
        pages = new ArrayList<Drawable>();
        
        // cargamos la imagen de portada
        cargarPordata();
        
        for (String word : words) {
            widthPaint = textPage.widthText(temp);
            wordSize = textPage.widthText(word+" ");
            if( widthPaint+wordSize < width) {
                temp += word+" ";
            } else {
                lines.add(temp.trim());
                temp = word + " ";
            }
        }
        //Agregamos la ultima linea
        lines.add(temp.trim());
        
        //Creacion de las paginas
        StringBuilder buffer = new StringBuilder();
        StringBuilder tempBuffer = new StringBuilder();
        for (String line : lines) {
            tempBuffer.append(line).append(System.getProperty("line.separator"));
            heightText = textPage.heightText(tempBuffer.toString());
            if(heightText < height) {
                buffer.append(line).append(System.getProperty("line.separator"));
            } else {
                // Construccion de la pagina
                currentPage = new TextDrawable(context);
                currentPage.setText(buffer.toString());
                currentPage.setTextAlign(Layout.Alignment.ALIGN_NORMAL);
                currentPage.setTextColor(Color.BLACK);
                pages.add(currentPage);
                
                //Reiniciamos las variables
                buffer = new StringBuilder(line);
                tempBuffer = new StringBuilder(line);
                buffer.append(System.getProperty("line.separator"));
                tempBuffer.append(System.getProperty("line.separator"));
            }
        }
        
        //Agregamos la ultima pagina (o primera)
        currentPage = new TextDrawable(context);
        currentPage.setText(buffer.toString());
        currentPage.setTextAlign(Layout.Alignment.ALIGN_NORMAL);
        currentPage.setTextColor(Color.BLACK);
        pages.add(currentPage);
    }

    private void cargarPordata() {
        if(nombreImagen != null) {
            int draw = 0;
            if(nombreImagen.indexOf("cipitio")>= 0) {
                draw = R.drawable.cipitio;
            } else if(nombreImagen.indexOf("cadejo")>= 0) {
                draw = R.drawable.el_cadejo;
            } else if(nombreImagen.indexOf("pancha")>= 0) {
                draw = R.drawable.el_cerro_de_la_juana_pancha;
            } else if(nombreImagen.indexOf("duende")>= 0) {
                draw = R.drawable.el_duende;
            } else if(nombreImagen.indexOf("brujo")>= 0) {
                draw = R.drawable.el_mico_brujo;
            } else if(nombreImagen.indexOf("tabudo")>= 0) {
                draw = R.drawable.el_tabudo;
            } else if(nombreImagen.indexOf("gallo")>= 0) {
                draw = R.drawable.gallo;
            } else if(nombreImagen.indexOf("cuyancuat")>= 0) {
                draw = R.drawable.la_cuyancuat_1;
            } else if(nombreImagen.indexOf("descarnada")>= 0) {
                draw = R.drawable.la_descarnada;
            } else if(nombreImagen.indexOf("iglesia")>= 0) {
                draw = R.drawable.la_iglesia_vieja;
            } else if(nombreImagen.indexOf("llorona")>= 0) {
                draw = R.drawable.la_llorona;
            } else if(nombreImagen.indexOf("bululu")>= 0) {
                draw = R.drawable.la_poza_del_bululu;
            } else if(nombreImagen.indexOf("anillos")>= 0) {
                draw = R.drawable.la_senora_de_los_anillos;
            } else if(nombreImagen.indexOf("sihuanaba")>= 0) {
                draw = R.drawable.la_sihuanaba_1;
            } else if(nombreImagen.indexOf("botijas")>= 0) {
                draw = R.drawable.las_botijas;
            } else if(nombreImagen.indexOf("santa_ana")>= 0) {
                draw = R.drawable.nuestra_senora_de_santa_ana;
            } else if(nombreImagen.indexOf("amate")>= 0) {
                draw = R.drawable.amate;
            } else if(nombreImagen.indexOf("carreta")>= 0) {
                draw = R.drawable.carreta;
            } else {
                draw = R.drawable.ic_launcher;
            }
            
            pages.add(context.getResources().getDrawable(draw));
        }
    }

    @Override
    public int getPageCount() {
        return (pages==null?1:pages.size());
    }

    @Override
    public void updatePage(CurlPage page, int width, int height, int index) {
        Bitmap front = loadPage(width, height, index);
        page.setTexture(front, CurlPage.SIDE_BOTH);
        page.setColor(Color.rgb(180, 180, 180), CurlPage.SIDE_BACK);
    }

    private Bitmap loadPage(int width, int height, int index) {
        Bitmap b = null;
        Canvas c = null;
        Drawable textPage = null;
        
        b = Bitmap.createBitmap(width, height,
                Bitmap.Config.ARGB_8888);
        b.eraseColor(0xFFFFFFFF);
        c = new Canvas(b);
        
        if(pages == null) {
            // Primera vez que se cargan las paginas
            initPages(originalText, width, height);
        }

        textPage = pages.get(index);

        if (textPage instanceof BitmapDrawable) {
            int margin = 7;
            int border = 3;
            Rect r = new Rect(margin, margin, width - margin, height - margin);

            int imageWidth = r.width() - (border * 2);
            int imageHeight = imageWidth * textPage.getIntrinsicHeight()
                    / textPage.getIntrinsicWidth();
            if (imageHeight > r.height() - (border * 2)) {
                imageHeight = r.height() - (border * 2);
                imageWidth = imageHeight * textPage.getIntrinsicWidth()
                        / textPage.getIntrinsicHeight();
            }

            r.left += ((r.width() - imageWidth) / 2) - border;
            r.right = r.left + imageWidth + border + border;
            r.top += ((r.height() - imageHeight) / 2) - border;
            r.bottom = r.top + imageHeight + border + border;

            Paint p = new Paint();
            p.setColor(0xFFC0C0C0);
            c.drawRect(r, p);
            r.left += border;
            r.right -= border;
            r.top += border;
            r.bottom -= border;

            textPage.setBounds(r);
        }
        
        textPage.draw(c);
        return b;
    }
}
