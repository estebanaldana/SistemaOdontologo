package com.example.dante_000.sistemadientes;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;



import java.text.DecimalFormat;

//import xyz.hanks.library.SmallBang;
//import xyz.hanks.library.SmallBangListener;

public class DatosPersona extends AppCompatActivity {

    TextView edad, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16;
    double ed, ed1, ed2, ed3, ed4, ed5, ed6, ed7, ed8, ed9, ed10, ed11, ed12, ed13, ed14, ed15, ed16;

    ClassDientes CD = new ClassDientes();
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
        setContentView(R.layout.activity_datos);


        edad = (TextView) findViewById(R.id.Edad);
        d1 = (TextView) findViewById(R.id.D1);
        d2 = (TextView) findViewById(R.id.D2);
        d3 = (TextView) findViewById(R.id.D3);
        d4 = (TextView) findViewById(R.id.D4);
        d5 = (TextView) findViewById(R.id.D5);
        d6 = (TextView) findViewById(R.id.D6);
        d7 = (TextView) findViewById(R.id.D7);
        d8 = (TextView) findViewById(R.id.D8);
        d9 = (TextView) findViewById(R.id.D9);
        d10 = (TextView) findViewById(R.id.D10);
        d11 = (TextView) findViewById(R.id.D11);
        d12 = (TextView) findViewById(R.id.D12);
        d13 = (TextView) findViewById(R.id.D13);
        d14 = (TextView) findViewById(R.id.D14);
        d15 = (TextView) findViewById(R.id.D15);
        d16 = (TextView) findViewById(R.id.D16);

        try {
            Bundle datoR = this.getIntent().getExtras();

            TextView res = new TextView(DatosPersona.this);
            TextView D1 = new TextView(DatosPersona.this);
            TextView D2 = new TextView(DatosPersona.this);
            TextView D3 = new TextView(DatosPersona.this);
            TextView D4 = new TextView(DatosPersona.this);
            TextView D5 = new TextView(DatosPersona.this);
            TextView D6 = new TextView(DatosPersona.this);
            TextView D7 = new TextView(DatosPersona.this);
            TextView D8 = new TextView(DatosPersona.this);
            TextView D9 = new TextView(DatosPersona.this);
            TextView D10 = new TextView(DatosPersona.this);
            TextView D11 = new TextView(DatosPersona.this);
            TextView D12 = new TextView(DatosPersona.this);
            TextView D13 = new TextView(DatosPersona.this);
            TextView D14 = new TextView(DatosPersona.this);
            TextView D15 = new TextView(DatosPersona.this);
            TextView D16 = new TextView(DatosPersona.this);

            res.setText("" + datoR.getString("edadR"));
            ed = Double.parseDouble(res.getText().toString());
            D1.setText("" + datoR.getString("d1"));
            ed1 = Double.parseDouble(D1.getText().toString());
            D2.setText("" + datoR.getString("d2"));
            ed2 = Double.parseDouble(D2.getText().toString());
            D3.setText("" + datoR.getString("d3"));
            ed3 = Double.parseDouble(D3.getText().toString());
            D4.setText("" + datoR.getString("d4"));
            ed4 = Double.parseDouble(D4.getText().toString());
            D5.setText("" + datoR.getString("d5"));
            ed5 = Double.parseDouble(D5.getText().toString());
            D6.setText("" + datoR.getString("d6"));
            ed6 = Double.parseDouble(D6.getText().toString());
            D7.setText("" + datoR.getString("d7"));
            ed7 = Double.parseDouble(D7.getText().toString());
            D8.setText("" + datoR.getString("d8"));
            ed8 = Double.parseDouble(D8.getText().toString());
            D9.setText("" + datoR.getString("d9"));
            ed9 = Double.parseDouble(D9.getText().toString());
            D10.setText("" + datoR.getString("d10"));
            ed10 = Double.parseDouble(D10.getText().toString());
            D11.setText("" + datoR.getString("d11"));
            ed11 = Double.parseDouble(D11.getText().toString());
            D12.setText("" + datoR.getString("d12"));
            ed12 = Double.parseDouble(D12.getText().toString());
            D13.setText("" + datoR.getString("d13"));
            ed13 = Double.parseDouble(D13.getText().toString());
            D14.setText("" + datoR.getString("d14"));
            ed14 = Double.parseDouble(D14.getText().toString());
            D15.setText("" + datoR.getString("d15"));
            ed15 = Double.parseDouble(D15.getText().toString());
            D16.setText("" + datoR.getString("d16"));
            ed16 = Double.parseDouble(D16.getText().toString());


            edad.setText("Edad: " + decimales.format(ed));

            d1.setText("M-D: " + ed1);
            d2.setText("V-L: " + ed2);
            d3.setText("DV-ML: " + ed3);
            d4.setText("DL-MV: " + ed4);
            d5.setText("M-D: " + ed5);
            d6.setText("V-L: " + ed6);
            d7.setText("DV-ML: " + ed7);
            d8.setText("DL-MV: " + ed8);
            d9.setText("M-D: " + ed9);
            d10.setText("V-L: " + ed10);
            d11.setText("DV-ML: " + ed11);
            d12.setText("DL-MV: " + ed12);
            d13.setText("M-D: " + ed13);
            d14.setText("V-L: " + ed14);
            d15.setText("DV-ML: " + ed15);
            d16.setText("DL-MV: " + ed16);


            comparar(proceso());

        } catch (Exception e) {

            Intent i = new Intent(this, Actividad_Principal.class);
            startActivity(i);
            finish();

            Mensaje = "A Ocurrido un Error Porfavor Vuelve a Ingresar los Datos";
            Titulo = "Error";
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

    public Double[] proceso() {

        Double[] datos = {ed1, ed2, ed3, ed4, ed5, ed6, ed7, ed8, ed9, ed10, ed11, ed12, ed13, ed14, ed15, ed16};

        return datos;
    }

    public void comparar(Double[] d) {

        CD.iniciar();

        int[] parentesco = new int[16];
        int H = 0, M = 0;

        for (int i = 0; i < 16; i++) {
            if (d[i] >= CD.H[i][0] && d[i] <= CD.H[i][1]) {
                parentesco[i] = 1;
            } else {
                parentesco[i] = 0;
            }
        }

        for (int i = 0; i < 16; i++) {
            if (parentesco[i] == 0) {
                if (d[i] >= CD.M[i][0] && d[i] <= CD.M[i][1]) {
                    parentesco[i] = 2;
                }
            }

        }

        for (int i = 0; i < 16; i++) {
            switch (parentesco[i]) {
                case (1): {
                    Mensaje = "El dato" + decimales.format(i + 1) + " coincide "
                            + "con la información de un Hombre";
                    Titulo = "Dato";
                    Aceptar = "Regresar";
                    H++;
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(Mensaje).setTitle(Titulo).setCancelable(false).setNeutralButton(Aceptar, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
                    AlertDialog alert = builder.create();
                    alert.show();
                    break;
                }
                case (2): {
                    Mensaje = "El dato" + decimales.format(i + 1) + " coincide "
                            + "con la información con una Mujer";
                    Titulo = "Dato";
                    Aceptar = "Regresar";
                    M++;
                    final AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage(Mensaje).setTitle(Titulo).setCancelable(false).setNeutralButton(Aceptar, new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
                    AlertDialog alert = builder.create();
                    alert.show();
                    break;
                }
                case (0):
                    System.out.println("No se encontro coincidencia en "
                            + "el dato " + (i + 1));
                    break;
            }
        }

        Mensaje = "Se encontraron " + H + " datos que coinciden con información de un Hombre\n"
                + "Se encontraron " + M + " datos que coinciden con información de una Mujer\n"
                + "Se encontraron " + (16 - (M + H)) + "datos que no coinciden";
        Titulo = "Dato";
        Aceptar = "Regresar";
        M++;
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(Mensaje).setTitle(Titulo).setCancelable(false).setNeutralButton(Aceptar, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();

        double porcentaje;
        int reales;

        if (H > M) {

            reales = H + M;

            porcentaje = (H * 100) / reales;

            Mensaje = "Hay un" + decimales.format(porcentaje) + "% de probabilidad de que seas un HOMBRE";
            Titulo = "Dato";
            Aceptar = "Regresar";

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
        } else {

            reales = H + M;

            porcentaje = (M * 100) / reales;

            Mensaje = "Hay un" + decimales.format(porcentaje) + "% de probabilidad de que seas una Mujer";
            Titulo = "Dato";
            Aceptar = "Regresar";

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

    }

    public void info(View v) {
        comparar(proceso());
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
        getMenuInflater().inflate(R.menu.menu_datos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_datos) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void PDF(View v) {
        try {
            Toast.makeText(this, "Aun en Mantenimiento Crear Documento PDF",
                    Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(this, "Aun en Mantenimiento",
                    Toast.LENGTH_LONG).show();
        }
    }
}
