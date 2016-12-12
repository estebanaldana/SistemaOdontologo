package com.example.dante_000.sistemadientes;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

//import xyz.hanks.library.SmallBang;
//import xyz.hanks.library.SmallBangListener;

public class DatosPersonaEdadPU extends AppCompatActivity {

    TextView edad, sexo;
    double ed;

    DatePicker tiempo;
    TextView fecha;

    DecimalFormat decimales = new DecimalFormat("0.00");
    //private SmallBang mSmallBang;



    private String Mensaje;
    private String Titulo;
    private String Aceptar;

    FloatingActionButton menu, info, portal;
    Animation Fopen, FCloc, FRot, FRotan;
    boolean open = false;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_pu);


        edad = (TextView) findViewById(R.id.Edad);
        sexo = (TextView) findViewById(R.id.sexo);

        tiempo = new DatePicker(this);
        fecha = new TextView(this);
        int dia;
        int mes;
        int anos;

        dia = tiempo.getDayOfMonth();
        mes = tiempo.getMonth();
        anos = tiempo.getYear();

        fecha.setText(dia+"/"+ mes+"/"+anos);

        try {
            Bundle datoR = this.getIntent().getExtras();

            TextView res = new TextView(DatosPersonaEdadPU.this);
            TextView sex = new TextView(DatosPersonaEdadPU.this);

            res.setText(""+ datoR.getString("edad"));
            sex.setText(""+datoR.getString("sexo"));
            ed = Double.parseDouble(res.getText().toString());

            edad.setText("Edad: " + decimales.format(ed));
            sexo.setText(sex.getText().toString());


        } catch (Exception e) {

            Mensaje = "A Ocurrido un Error Porfavor Vuelve a Ingresar los Datos";
            Titulo = "Error";
            Aceptar = "Aceptar";

            final AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setMessage(Mensaje).setTitle(Titulo).setCancelable(false).setNeutralButton(Aceptar, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int id) {
                    finish();
                    dialog.cancel();
                }
            });
            AlertDialog alert1 = builder1.create();
            alert1.show();
            return;
        }

        menu = (FloatingActionButton) findViewById(R.id.menu);
        info = (FloatingActionButton) findViewById(R.id.info);
        portal = (FloatingActionButton) findViewById(R.id.portal);

        Fopen = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.f_open);
        FCloc = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.f_close);
        FRot = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
        FRotan = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotateanti);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /**Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                 .setAction("Action", null).show();**/
                //startActivity(new Intent(Actividad_Principal.this, iconos.class));

                if (open) {
                    info.startAnimation(FCloc);
                    portal.startAnimation(FCloc);
                    menu.startAnimation(FRotan);
                    info.setClickable(false);
                    portal.setClickable(false);
                    open = false;
                } else {
                    info.startAnimation(Fopen);
                    portal.startAnimation(Fopen);
                    menu.startAnimation(FRot);
                    info.setClickable(true);
                    portal.setClickable(true);
                    open = true;
                }
            }
        });
    }




    public void info(View v) {

        Mensaje = "Este hoja de datos proporciona solo la edad / sexo ya establecido";
        Titulo = "Acerca de..";
        Aceptar = "Aceptar";

        final AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage(Mensaje).setTitle(Titulo).setCancelable(false).setNeutralButton(Aceptar, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert1 = builder1.create();
        alert1.show();
        return;
    }

    public void boton(View v) {
        try {
            finish();
        } catch (Exception e) {
            Toast.makeText(this, "Ocurrio un Error",
                    Toast.LENGTH_LONG).show();
            finish();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_datos_pu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_datos) {

            Document Doc3 = new Document(PageSize.LETTER,20,20,200,100);
            String outpatch3 = Environment.getExternalStorageDirectory()+"/DatosOdontologia3.pdf";
            try {
                PdfWriter.getInstance(Doc3, new FileOutputStream(outpatch3));
                PdfWriter writer = PdfWriter.getInstance(Doc3, new FileOutputStream(outpatch3));
                Font fuente = new Font();
                Font fuente1 = new Font();
                Font fuente2 = new Font();
                Font fuente3 = new Font();


                Doc3.open();

                fuente.setSize(10);
                fuente.setStyle(Font.BOLD);
                fuente.setFamily(Font.FontFamily.HELVETICA.toString());
                fuente1.setSize(60);
                fuente1.setStyle(Font.BOLD);
                fuente1.setFamily(Font.FontFamily.TIMES_ROMAN.toString());
                fuente2.setSize(15);
                fuente2.setStyle(Font.ITALIC);
                fuente2.setFamily(Font.FontFamily.TIMES_ROMAN.toString());
                fuente3.setSize(40);
                fuente3.setStyle(Font.ITALIC);
                fuente3.setFamily(Font.FontFamily.TIMES_ROMAN.toString());

                Paragraph parrafo = new Paragraph(" ");

                Doc3.add(parrafo);
                ColumnText.showTextAligned( writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("Univerdad Nacional Autonoma de México",fuente), 150,750,0);
                ColumnText.showTextAligned( writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("Odontología",fuente), 500,750,0);

                ColumnText.showTextAligned( writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase(edad.getText().toString(),fuente1), 300,630,0);

                ColumnText.showTextAligned( writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase(sexo.getText().toString(),fuente3), 300,530,0);

                ColumnText.showTextAligned( writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase(fecha.getText().toString(),fuente2), 100,430,0);

                Doc3.close();

                Toast.makeText(this, "Se genero el Formato PDF con exito su ubicacion es: " +outpatch3, Toast.LENGTH_SHORT).show();
            }
            catch (DocumentException e){
                e.printStackTrace();
            }
            catch (FileNotFoundException e){
                e.printStackTrace();
            }
            catch (IOException e){
                Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
            }
        }

        return super.onOptionsItemSelected(item);
    }

    }
