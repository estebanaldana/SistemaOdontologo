package com.example.dante_000.sistemadientes;

import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Lamendin extends AppCompatActivity {

    EditText P;
    EditText T;
    EditText Lr;
    ImageView Diente;

    double edad;
    DecimalFormat decimales = new DecimalFormat("0.00");

    private String Mensaje;
    private String Titulo;
    private String Aceptar;
    private String Cancelar;

    FloatingActionButton menu, info, portal;
    Animation Fopen, FCloc, FRot, FRotan;
    boolean open = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lamedin);

        P = (EditText) findViewById(R.id.P);
        T = (EditText) findViewById(R.id.T);
        Lr = (EditText) findViewById(R.id.Lr);

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


                if(open)
                {
                    info.startAnimation(FCloc);
                    portal.startAnimation(FCloc);
                    menu.startAnimation(FRotan);
                    info.setClickable(false);
                    portal.setClickable(false);
                    open = false;
                }
                else
                {
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

    public void info(View V) {

        Titulo = "Método de Lamendin";
        Aceptar = "Regresar";

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(R.layout.imagen_lamendin).setTitle(Titulo).setCancelable(false).setNeutralButton(Aceptar, new DialogInterface.OnClickListener() {


            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
        return;
    }

    public void metodo(View V) {

        Uri uriUrl = Uri.parse("http://www.semefo.gob.mx/es/INCIFO/Odontologia_Forense/_rid/17/_wst/minimized");

        Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(intent);
    }

    public void boton(View v) {

        Titulo = "Procedimiento";
        Aceptar = "Aceptar";
        Cancelar = "Cancelar";
        Mensaje = "Deseas estimar el sexo o no";

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(Mensaje).setTitle(Titulo).setCancelable(false)

                .setPositiveButton(Aceptar, new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int id) {
                try {
                    double p = Double.parseDouble(P.getText().toString());
                    double t = Double.parseDouble(T.getText().toString());
                    double lr = Double.parseDouble(Lr.getText().toString());

                    Bundle op = new Bundle();

                    TextView res = new TextView(Lamendin.this);

                    if (p < 100 && t < 100&& lr < 100) {
                        edad = ((0.18 *((p * 100)/lr )) + (0.42 *((t * 100)/lr)) + 25.23);

                        res.setText(""+edad);

                        op.putString("edad",  res.getText().toString());
                        Intent i = new Intent(Lamendin.this, Odontograma.class);
                        i.putExtras(op);
                        startActivity(i);
                        finish();


                    } else {
                        Mensaje = "La longitud de Entrada no es correcta";
                        Titulo = "Longitud Demaciado Grande";
                        Aceptar = "Regresar";

                        final AlertDialog.Builder builder = new AlertDialog.Builder(Lamendin.this);
                        builder.setMessage(Mensaje).setTitle(Titulo).setCancelable(false).setNeutralButton(Aceptar, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                        AlertDialog alert = builder.create();
                        alert.show();
                        return;
                    }
                }
                catch (Exception e)
                {
                    Toast.makeText(Lamendin.this, "Debes de Llenar Todos los Campos", Toast.LENGTH_LONG).show();
                }
            }
        })
        .setNegativeButton(Cancelar, new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id){
                try {
                    double p = Double.parseDouble(P.getText().toString());
                    double t = Double.parseDouble(T.getText().toString());
                    double lr = Double.parseDouble(Lr.getText().toString());

                    Bundle op = new Bundle();

                    TextView res = new TextView(Lamendin.this);

                    if (p < 100 && t < 100&& lr < 100) {
                        edad = ((0.18 *((p * 100)/lr )) + (0.42 *((t * 100)/lr)) + 25.23);

                        res.setText(""+edad);

                        op.putString("edadE",  res.getText().toString());
                        Intent i = new Intent(Lamendin.this, DatosPersonaEdad.class);
                        i.putExtras(op);
                        startActivity(i);
                        finish();


                    } else {
                        Mensaje = "La longitud de Entrada no es correcta";
                        Titulo = "Longitud Demaciado Grande";
                        Aceptar = "Regresar";

                        final AlertDialog.Builder builder = new AlertDialog.Builder(Lamendin.this);
                        builder.setMessage(Mensaje).setTitle(Titulo).setCancelable(false).setNeutralButton(Aceptar, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                        AlertDialog alert = builder.create();
                        alert.show();
                        return;
                    }
                }
                catch (Exception e)
                {
                    Toast.makeText(Lamendin.this, "Debes de Llenar Todos los Campos", Toast.LENGTH_LONG).show();
                }
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
        return;
    }
}
