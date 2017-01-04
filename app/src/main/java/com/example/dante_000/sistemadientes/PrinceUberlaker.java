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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


public class PrinceUberlaker extends AppCompatActivity{

    EditText P;
    EditText T;
    EditText Lr;

    TextView sexo;

    ImageView ima;

    Button cal;

    Spinner lista;
    String datos[] = {"Sexo", "Edad Estimada Masculino", "Edad Estimado Femenino"};

    double edad;
    DecimalFormat decimales = new DecimalFormat("0.00");



    private String Mensaje;
    private String Titulo;
    private String Aceptar;

    FloatingActionButton menu, info, portal;
    Animation Fopen, FCloc, FRot, FRotan;
    boolean open = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_princeuberlaker);

        cal = (Button)  findViewById(R.id.cal);

        P = (EditText) findViewById(R.id.P);
        T = (EditText) findViewById(R.id.T);
        Lr = (EditText) findViewById(R.id.Lr);

        ima = (ImageView) findViewById(R.id.ima);

        sexo = new TextView(this);


        lista = (Spinner) findViewById(R.id.lista);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos);
        lista.setAdapter(adaptador);

        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                switch (i)
                {
                    case 0:
                        P.setVisibility(View.INVISIBLE);
                        T.setVisibility(View.INVISIBLE);
                        Lr.setVisibility(View.INVISIBLE);
                        cal.setVisibility(View.INVISIBLE);
                        ima.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        P.setVisibility(View.VISIBLE);
                        T.setVisibility(View.VISIBLE);
                        Lr.setVisibility(View.VISIBLE);
                        cal.setVisibility(View.VISIBLE);
                        ima.setVisibility(View.GONE);
                        P.setText("");
                        T.setText("");
                        Lr.setText("");
                        break;
                    case 2:
                        P.setVisibility(View.VISIBLE);
                        T.setVisibility(View.VISIBLE);
                        Lr.setVisibility(View.VISIBLE);
                        cal.setVisibility(View.VISIBLE);
                        ima.setVisibility(View.GONE);
                        P.setText("");
                        T.setText("");
                        Lr.setText("");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
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

        Titulo = "Método de Prince & Uberlaker";
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


    public void boton (View v) {
        try
        {
            double p = Double.parseDouble(P.getText().toString());
            double t = Double.parseDouble(T.getText().toString());
            double lr = Double.parseDouble(Lr.getText().toString());

            if(lista.getSelectedItemPosition() == 1)
            {

                Bundle op = new Bundle();

                TextView res = new TextView(PrinceUberlaker.this);

                if (p < 100 && t < 100 && lr < 100)
                {
                    edad = ((0.15*lr)+(0.29*((p * 100)/lr))+(0.39*((t*100)/lr)))+23.17;

                    res.setText(""+edad);
                    sexo.setText("Masculino Blanco");

                    op.putString("edad",  res.getText().toString());
                    op.putString("sexo", sexo.getText().toString());
                    Intent i = new Intent(this, DatosPersonaEdadPU.class);
                    i.putExtras(op);
                    startActivity(i);
                    finish();

                }
                else {
                    Mensaje = "La longitud de Entrada no es correcta";
                    Titulo = "Longitud Demaciado Grande";
                    Aceptar = "Regresar";

                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
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
            if(lista.getSelectedItemPosition() == 2)
            {

                Bundle op = new Bundle();

                TextView res = new TextView(PrinceUberlaker.this);

                if (p < 100 && t < 100 && lr < 20)
                {
                    edad = ((1.10*lr)+(0.31*((p * 100)/lr))+(0.39*((t * 100)/lr)))+11.82;

                    res.setText(""+edad);
                    sexo.setText("Femenino Blanca");

                    op.putString("edad",  res.getText().toString());
                    op.putString("sexo", sexo.getText().toString());
                    Intent i = new Intent(this, DatosPersonaEdadPU.class);
                    i.putExtras(op);
                    startActivity(i);
                    finish();
                }
                else {
                    Mensaje = "La lomgitud de Entrada no es correcta";
                    Titulo = "Longitud Demaciado Grande";
                    Aceptar = "Regresar";

                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
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
        }
        catch (Exception e)
        {
            Toast.makeText(this, "Debes de Llenar Todos los Campos",
                    Toast.LENGTH_LONG).show();
        }
    }

}
