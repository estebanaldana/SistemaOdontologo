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


public class Ikeda extends AppCompatActivity{

    EditText CH;
    EditText CPCH;

    ImageView ima;

    Button cal;

    Spinner lista;
    String datos[] = {"Cuenta con el TCI(Indice de la Corona Dental)", "SI", "NO"};

    double edad;
    double TCI;
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
        setContentView(R.layout.activity_ikeda);


        cal = (Button)  findViewById(R.id.cal);

        CH = (EditText) findViewById(R.id.ch);
        CPCH = (EditText) findViewById(R.id.cpch);

        ima = (ImageView) findViewById(R.id.ima);

        lista = (Spinner) findViewById(R.id.lista);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos);
        lista.setAdapter(adaptador);

        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                switch (i)
                {
                    case 0:
                        CH.setVisibility(View.INVISIBLE);
                        CPCH.setVisibility(View.INVISIBLE);
                        cal.setVisibility(View.INVISIBLE);
                        ima.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        CH.setVisibility(View.VISIBLE);
                        CH.setHint(R.string.IndiceCorona);
                        CH.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                        CPCH.setVisibility(View.GONE);
                        cal.setVisibility(View.VISIBLE);
                        ima.setVisibility(View.GONE);
                        CH.setText("");
                        CPCH.setText("");
                        break;
                    case 2:
                        CH.setVisibility(View.VISIBLE);
                        CPCH.setVisibility(View.VISIBLE);
                        CH.setHint(R.string.Alturacoronal);
                        CPCH.setHint(R.string.AlturaPulpar);
                        CH.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                        CPCH.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                        cal.setVisibility(View.VISIBLE);
                        ima.setVisibility(View.GONE);
                        CH.setText("");
                        CPCH.setText("");
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
        Titulo = "Metodo Ikeda";
        Aceptar = "Regresar";

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(R.layout.imagen_ikeda).setTitle(Titulo).setCancelable(false).setNeutralButton(Aceptar, new DialogInterface.OnClickListener() {
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

        Uri uriUrl = Uri.parse("http://es.slideshare.net/jorgemanriquechavez/estimacin-de-edad-e-identificacin-forense-en-estomatologa");

        Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(intent);
    }


    public void boton (View v) {

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
                            double ch = Double.parseDouble(CH.getText().toString());
                            if (lista.getSelectedItemPosition() == 1) {

                                Bundle op = new Bundle();

                                TextView res = new TextView(Ikeda.this);

                                if (ch < 100) {
                                    edad = (77.617 - (1.4636 * ch));

                                    res.setText("" + edad);

                                    op.putString("edad", res.getText().toString());
                                    Intent i = new Intent(Ikeda.this, Odontograma.class);
                                    i.putExtras(op);
                                    startActivity(i);
                                    finish();
                                } else {
                                    Mensaje = "La longitud de Entrada no es correcta";
                                    Titulo = "Longitud Demaciado Grande";
                                    Aceptar = "Regresar";

                                    final AlertDialog.Builder builder = new AlertDialog.Builder(Ikeda.this);
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
                        } catch (Exception ei) {
                            Toast.makeText(Ikeda.this, "Debes de Llenar Todos los Campos", Toast.LENGTH_LONG).show();
                        }

                        try {

                            double ch = Double.parseDouble(CH.getText().toString());
                            double cpch = Double.parseDouble(CPCH.getText().toString());
                            if (lista.getSelectedItemPosition() == 2) {
                                Bundle op = new Bundle();

                                TextView res = new TextView(Ikeda.this);
                                if (ch < 100 && cpch < 100) {
                                    TCI = ((cpch * 100) / ch);
                                    edad = (77.617 - (1.4636 * TCI));

                                    res.setText("" + edad);

                                    op.putString("edad", res.getText().toString());
                                    Intent i = new Intent(Ikeda.this, Odontograma.class);
                                    i.putExtras(op);
                                    startActivity(i);
                                    finish();
                                } else {
                                    Mensaje = "La lomgitud de Entrada no es correcta";
                                    Titulo = "Longitud Demaciado Grande";
                                    Aceptar = "Regresar";

                                    final AlertDialog.Builder builder = new AlertDialog.Builder(Ikeda.this);
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
                        } catch (Exception e) {
                            Toast.makeText(Ikeda.this, "Debes de Llenar Todos los Campos", Toast.LENGTH_LONG).show();
                        }
                    }
                    })
                            .setNegativeButton(Cancelar, new DialogInterface.OnClickListener(){
                        @Override
                        public void onClick(DialogInterface dialog, int id){
                            try {
                                double ch = Double.parseDouble(CH.getText().toString());
                                if (lista.getSelectedItemPosition() == 1) {

                                    Bundle op = new Bundle();

                                    TextView res = new TextView(Ikeda.this);

                                    if (ch < 100) {
                                        edad = (77.617 - (1.4636 * ch));

                                        res.setText("" + edad);

                                        op.putString("edadE", res.getText().toString());
                                        Intent i = new Intent(Ikeda.this, DatosPersonaEdadI.class);
                                        i.putExtras(op);
                                        startActivity(i);
                                        finish();
                                    } else {
                                        Mensaje = "La longitud de Entrada no es correcta";
                                        Titulo = "Longitud Demaciado Grande";
                                        Aceptar = "Regresar";

                                        final AlertDialog.Builder builder = new AlertDialog.Builder(Ikeda.this);
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
                            } catch (Exception ei) {
                                Toast.makeText(Ikeda.this, "Debes de Llenar Todos los Campos", Toast.LENGTH_LONG).show();
                            }

                            try {

                                double ch = Double.parseDouble(CH.getText().toString());
                                double cpch = Double.parseDouble(CPCH.getText().toString());
                                if (lista.getSelectedItemPosition() == 2) {
                                    Bundle op = new Bundle();

                                    TextView res = new TextView(Ikeda.this);
                                    if (ch < 100 && cpch < 100) {
                                        TCI = ((cpch * 100) / ch);
                                        edad = (77.617 - (1.4636 * TCI));

                                        res.setText("" + edad);

                                        op.putString("edadE", res.getText().toString());
                                        Intent i = new Intent(Ikeda.this, DatosPersonaEdadI.class);
                                        i.putExtras(op);
                                        startActivity(i);
                                        finish();
                                    } else {
                                        Mensaje = "La lomgitud de Entrada no es correcta";
                                        Titulo = "Longitud Demaciado Grande";
                                        Aceptar = "Regresar";

                                        final AlertDialog.Builder builder = new AlertDialog.Builder(Ikeda.this);
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
                            } catch (Exception e) {
                                Toast.makeText(Ikeda.this, "Debes de Llenar Todos los Campos", Toast.LENGTH_LONG).show();
                            }
                        }
                        });
                        AlertDialog alert = builder.create();
                        alert.show();
                        return;

                        }
}
