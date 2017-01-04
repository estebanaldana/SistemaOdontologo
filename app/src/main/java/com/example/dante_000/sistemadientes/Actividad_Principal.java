package com.example.dante_000.sistemadientes;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Actividad_Principal extends AppCompatActivity {


    private String Mensaje;
    private String Titulo;
    private String Aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad__principal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actividad__principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_Portal) {

            Uri uriUrl = Uri.parse("https://www.unam.mx/");

            Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_acerca_de) {

            Mensaje = "Proyecto realizado por Esteban Aldana Hernandez | Isaac Francisco López Martínez \n" +"En Estadía de investigación  en la Facultad de Medicina UNAM \n"
            +"Asesor: Dr. Eduardo Vázquez Santacruz Catédratico CONACYT-UNAM \n" +"Colaboradora: Dra. Ivet Gil Chavarría Catédratico CONACYT-UNAM  ";
            Titulo = "Acerca de...";
            Aceptar = "Regresar";

            final AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setView(R.layout.imagen_acerca).setMessage(Mensaje).setTitle(Titulo).setCancelable(false).setNeutralButton(Aceptar, new DialogInterface.OnClickListener() {


                @Override
                public void onClick(DialogInterface dialog, int id) {
                    dialog.cancel();
                }
            });
            AlertDialog alert = builder.create();
            alert.show();
            return true;
        }
        if (id == R.id.action_sexo){
            Intent i  = new Intent(this, OdontogramaAlone.class);
            startActivity(i);

        }

        return super.onOptionsItemSelected(item);
    }

    public void lamendin(View V)
    {
        Intent i  = new Intent(this, Lamendin.class);
        startActivity(i);
    }

    public void priuber(View V)
    {
        Intent i  = new Intent(this, PrinceUberlaker.class);
        startActivity(i);
    }

    public void ikeda(View V)
    {
        Intent i  = new Intent(this, Ikeda.class);
        startActivity(i);
    }
}
