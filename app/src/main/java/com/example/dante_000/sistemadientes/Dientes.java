package com.example.dante_000.sistemadientes;

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
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


public class Dientes extends AppCompatActivity {

    //layauts
    LinearLayout uno, dos, tres, cuatro;

    //Canino Superior
    EditText csMD;
    EditText csVL;
    EditText csDVML;
    EditText csDLMV;

    //Primer Molar Superior
    EditText pmsMD;
    EditText pmsVL;
    EditText pmsDVML;
    EditText pmsDLMV;

    //Canino Inferior
    EditText ciMD;
    EditText ciVL;
    EditText ciDVML;
    EditText ciDLMV;

    //Primer Molar Inferior
    EditText pmiMD;
    EditText pmiVL;
    EditText pmiDVML;
    EditText pmiDLMV;


    Button cal;

    double proceso;
    DecimalFormat decimales = new DecimalFormat("0.00");

    private Spinner lista;
    private String Mensaje;
    private String Titulo;
    private String Aceptar;
    String Datos[] = {"Dientes", "CanSup, CanInf, PimMolSup, PimMolInf",

            "CanSup, CanInf, PimMolSup",
            "CanSup, CanInf, PimMolInf",
            "CanSup, PimMolSup, PimMolInf",
            "CanInf, PimMolSup, PimMolInf",

            "CanSup, CanInf",
            "CanSup, PimMolSup",
            "CanSup, PimMolInf",
            "CanInf, PimMolSup",
            "CanInf, PimMolInf",
            "PimMolSup, PimMolInf",

            "CanSup",
            "CanInf",
            "PimMolSup",
            "PimMolInf",
    };

    FloatingActionButton menu, info, portal;
    Animation Fopen, FCloc, FRot, FRotan;
    boolean open = false;


    Bundle dato = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dientes);
        lista = (Spinner) findViewById(R.id.lista);

        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int p, long id) {
                switch (p) {
                    case 0:

                        uno.setVisibility(View.GONE);

                        dos.setVisibility(View.GONE);

                        tres.setVisibility(View.GONE);

                        cuatro.setVisibility(View.GONE);

                        cal.setVisibility(View.GONE);
                        break;
                    case 1:
                        uno.setVisibility(View.VISIBLE);

                        dos.setVisibility(View.VISIBLE);

                        tres.setVisibility(View.VISIBLE);

                        cuatro.setVisibility(View.VISIBLE);

                        csMD.setText("");
                        csVL.setText("");
                        csDVML.setText("");
                        csDLMV.setText("");

                        pmsMD.setText("");
                        pmsVL.setText("");
                        pmsDVML.setText("");
                        pmsDLMV.setText("");

                        ciMD.setText("");
                        ciVL.setText("");
                        ciDVML.setText("");
                        ciDLMV.setText("");

                        pmiMD.setText("");
                        pmiVL.setText("");
                        pmiDVML.setText("");
                        pmiDLMV.setText("");

                        cal.setVisibility(View.VISIBLE);
                        break;
                    case 2:
                        uno.setVisibility(View.VISIBLE);

                        dos.setVisibility(View.VISIBLE);

                        tres.setVisibility(View.VISIBLE);

                        cuatro.setVisibility(View.GONE);

                        csMD.setText("");
                        csVL.setText("");
                        csDVML.setText("");
                        csDLMV.setText("");

                        pmsMD.setText("");
                        pmsVL.setText("");
                        pmsDVML.setText("");
                        pmsDLMV.setText("");

                        ciMD.setText("");
                        ciVL.setText("");
                        ciDVML.setText("");
                        ciDLMV.setText("");

                        pmiMD.setText("0");
                        pmiVL.setText("0");
                        pmiDVML.setText("0");
                        pmiDLMV.setText("0");

                        cal.setVisibility(View.VISIBLE);
                        break;
                    case 3:
                        uno.setVisibility(View.VISIBLE);

                        dos.setVisibility(View.GONE);

                        tres.setVisibility(View.VISIBLE);

                        cuatro.setVisibility(View.VISIBLE);

                        csMD.setText("");
                        csVL.setText("");
                        csDVML.setText("");
                        csDLMV.setText("");

                        pmsMD.setText("0");
                        pmsVL.setText("0");
                        pmsDVML.setText("0");
                        pmsDLMV.setText("0");

                        ciMD.setText("");
                        ciVL.setText("");
                        ciDVML.setText("");
                        ciDLMV.setText("");

                        pmiMD.setText("");
                        pmiVL.setText("");
                        pmiDVML.setText("");
                        pmiDLMV.setText("");

                        cal.setVisibility(View.VISIBLE);
                        break;
                    case 4:
                        uno.setVisibility(View.VISIBLE);

                        dos.setVisibility(View.VISIBLE);

                        tres.setVisibility(View.GONE);

                        cuatro.setVisibility(View.VISIBLE);

                        csMD.setText("");
                        csVL.setText("");
                        csDVML.setText("");
                        csDLMV.setText("");

                        pmsMD.setText("");
                        pmsVL.setText("");
                        pmsDVML.setText("");
                        pmsDLMV.setText("");

                        ciMD.setText("0");
                        ciVL.setText("0");
                        ciDVML.setText("0");
                        ciDLMV.setText("0");

                        pmiMD.setText("");
                        pmiVL.setText("");
                        pmiDVML.setText("");
                        pmiDLMV.setText("");

                        cal.setVisibility(View.VISIBLE);
                        break;
                    case 5:
                        uno.setVisibility(View.GONE);

                        dos.setVisibility(View.VISIBLE);

                        tres.setVisibility(View.VISIBLE);

                        cuatro.setVisibility(View.VISIBLE);

                        csMD.setText("0");
                        csVL.setText("0");
                        csDVML.setText("0");
                        csDLMV.setText("0");

                        pmsMD.setText("");
                        pmsVL.setText("");
                        pmsDVML.setText("");
                        pmsDLMV.setText("");

                        ciMD.setText("");
                        ciVL.setText("");
                        ciDVML.setText("");
                        ciDLMV.setText("");

                        pmiMD.setText("");
                        pmiVL.setText("");
                        pmiDVML.setText("");
                        pmiDLMV.setText("");

                        cal.setVisibility(View.VISIBLE);
                        break;
                    case 6:
                        uno.setVisibility(View.VISIBLE);

                        dos.setVisibility(View.GONE);

                        tres.setVisibility(View.VISIBLE);

                        cuatro.setVisibility(View.GONE);

                        csMD.setText("");
                        csVL.setText("");
                        csDVML.setText("");
                        csDLMV.setText("");

                        pmsMD.setText("0");
                        pmsVL.setText("0");
                        pmsDVML.setText("0");
                        pmsDLMV.setText("0");

                        ciMD.setText("");
                        ciVL.setText("");
                        ciDVML.setText("");
                        ciDLMV.setText("");

                        pmiMD.setText("0");
                        pmiVL.setText("0");
                        pmiDVML.setText("0");
                        pmiDLMV.setText("0");

                        cal.setVisibility(View.VISIBLE);
                        break;
                    case 7:
                        uno.setVisibility(View.VISIBLE);

                        dos.setVisibility(View.VISIBLE);

                        tres.setVisibility(View.GONE);

                        cuatro.setVisibility(View.GONE);

                        csMD.setText("");
                        csVL.setText("");
                        csDVML.setText("");
                        csDLMV.setText("");

                        pmsMD.setText("");
                        pmsVL.setText("");
                        pmsDVML.setText("");
                        pmsDLMV.setText("");

                        ciMD.setText("0");
                        ciVL.setText("0");
                        ciDVML.setText("0");
                        ciDLMV.setText("0");

                        pmiMD.setText("0");
                        pmiVL.setText("0");
                        pmiDVML.setText("0");
                        pmiDLMV.setText("0");

                        cal.setVisibility(View.VISIBLE);
                        break;
                    case 8:
                        uno.setVisibility(View.VISIBLE);

                        dos.setVisibility(View.GONE);

                        tres.setVisibility(View.GONE);

                        cuatro.setVisibility(View.VISIBLE);

                        csMD.setText("");
                        csVL.setText("");
                        csDVML.setText("");
                        csDLMV.setText("");

                        pmsMD.setText("0");
                        pmsVL.setText("0");
                        pmsDVML.setText("0");
                        pmsDLMV.setText("0");

                        ciMD.setText("0");
                        ciVL.setText("0");
                        ciDVML.setText("0");
                        ciDLMV.setText("0");

                        pmiMD.setText("");
                        pmiVL.setText("");
                        pmiDVML.setText("");
                        pmiDLMV.setText("");

                        cal.setVisibility(View.VISIBLE);
                        break;
                    case 9:
                        uno.setVisibility(View.GONE);

                        dos.setVisibility(View.VISIBLE);

                        tres.setVisibility(View.VISIBLE);

                        cuatro.setVisibility(View.GONE);

                        csMD.setText("0");
                        csVL.setText("0");
                        csDVML.setText("0");
                        csDLMV.setText("0");

                        pmsMD.setText("");
                        pmsVL.setText("");
                        pmsDVML.setText("");
                        pmsDLMV.setText("");

                        ciMD.setText("");
                        ciVL.setText("");
                        ciDVML.setText("");
                        ciDLMV.setText("");

                        pmiMD.setText("0");
                        pmiVL.setText("0");
                        pmiDVML.setText("0");
                        pmiDLMV.setText("0");

                        cal.setVisibility(View.VISIBLE);
                        break;
                    case 10:
                        uno.setVisibility(View.GONE);

                        dos.setVisibility(View.GONE);

                        tres.setVisibility(View.VISIBLE);

                        cuatro.setVisibility(View.VISIBLE);

                        csMD.setText("0");
                        csVL.setText("0");
                        csDVML.setText("0");
                        csDLMV.setText("0");

                        pmsMD.setText("0");
                        pmsVL.setText("0");
                        pmsDVML.setText("0");
                        pmsDLMV.setText("0");

                        ciMD.setText("");
                        ciVL.setText("");
                        ciDVML.setText("");
                        ciDLMV.setText("");

                        pmiMD.setText("");
                        pmiVL.setText("");
                        pmiDVML.setText("");
                        pmiDLMV.setText("");

                        cal.setVisibility(View.VISIBLE);
                        break;
                    case 11:
                        uno.setVisibility(View.GONE);

                        dos.setVisibility(View.VISIBLE);

                        tres.setVisibility(View.GONE);

                        cuatro.setVisibility(View.VISIBLE);

                        csMD.setText("0");
                        csVL.setText("0");
                        csDVML.setText("0");
                        csDLMV.setText("0");

                        pmsMD.setText("");
                        pmsVL.setText("");
                        pmsDVML.setText("");
                        pmsDLMV.setText("");

                        ciMD.setText("0");
                        ciVL.setText("0");
                        ciDVML.setText("0");
                        ciDLMV.setText("0");

                        pmiMD.setText("");
                        pmiVL.setText("");
                        pmiDVML.setText("");
                        pmiDLMV.setText("");

                        cal.setVisibility(View.VISIBLE);
                        break;
                    case 12:
                        uno.setVisibility(View.VISIBLE);

                        dos.setVisibility(View.GONE);

                        tres.setVisibility(View.GONE);

                        cuatro.setVisibility(View.GONE);

                        csMD.setText("");
                        csVL.setText("");
                        csDVML.setText("");
                        csDLMV.setText("");

                        pmsMD.setText("0");
                        pmsVL.setText("0");
                        pmsDVML.setText("0");
                        pmsDLMV.setText("0");

                        ciMD.setText("0");
                        ciVL.setText("0");
                        ciDVML.setText("0");
                        ciDLMV.setText("0");

                        pmiMD.setText("0");
                        pmiVL.setText("0");
                        pmiDVML.setText("0");
                        pmiDLMV.setText("0");

                        cal.setVisibility(View.VISIBLE);
                        break;
                    case 13:
                        uno.setVisibility(View.GONE);

                        dos.setVisibility(View.GONE);

                        tres.setVisibility(View.VISIBLE);

                        cuatro.setVisibility(View.GONE);

                        csMD.setText("0");
                        csVL.setText("0");
                        csDVML.setText("0");
                        csDLMV.setText("0");

                        pmsMD.setText("0");
                        pmsVL.setText("0");
                        pmsDVML.setText("0");
                        pmsDLMV.setText("0");

                        ciMD.setText("");
                        ciVL.setText("");
                        ciDVML.setText("");
                        ciDLMV.setText("");

                        pmiMD.setText("0");
                        pmiVL.setText("0");
                        pmiDVML.setText("0");
                        pmiDLMV.setText("0");

                        cal.setVisibility(View.VISIBLE);
                        break;
                    case 14:
                        uno.setVisibility(View.GONE);

                        dos.setVisibility(View.VISIBLE);

                        tres.setVisibility(View.GONE);

                        cuatro.setVisibility(View.GONE);

                        csMD.setText("0");
                        csVL.setText("0");
                        csDVML.setText("0");
                        csDLMV.setText("0");

                        pmsMD.setText("");
                        pmsVL.setText("");
                        pmsDVML.setText("");
                        pmsDLMV.setText("");

                        ciMD.setText("0");
                        ciVL.setText("0");
                        ciDVML.setText("0");
                        ciDLMV.setText("0");

                        pmiMD.setText("0");
                        pmiVL.setText("0");
                        pmiDVML.setText("0");
                        pmiDLMV.setText("0");

                        cal.setVisibility(View.VISIBLE);
                        break;
                    case 15:
                        uno.setVisibility(View.GONE);

                        dos.setVisibility(View.GONE);

                        tres.setVisibility(View.GONE);

                        cuatro.setVisibility(View.VISIBLE);

                        csMD.setText("0");
                        csVL.setText("0");
                        csDVML.setText("0");
                        csDLMV.setText("0");

                        pmsMD.setText("0");
                        pmsVL.setText("0");
                        pmsDVML.setText("0");
                        pmsDLMV.setText("0");

                        ciMD.setText("0");
                        ciVL.setText("0");
                        ciDVML.setText("0");
                        ciDLMV.setText("0");

                        pmiMD.setText("");
                        pmiVL.setText("");
                        pmiDVML.setText("");
                        pmiDLMV.setText("");

                        cal.setVisibility(View.VISIBLE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Datos);

        lista.setAdapter(adaptador);

        uno = (LinearLayout) findViewById(R.id.dientesuno);
        dos = (LinearLayout) findViewById(R.id.dientesdos);
        tres = (LinearLayout) findViewById(R.id.dientestres);
        cuatro = (LinearLayout) findViewById(R.id.dientescuatro);

        csMD = (EditText) findViewById(R.id.CSMD);
        csVL = (EditText) findViewById(R.id.CSVL);
        csDVML = (EditText) findViewById(R.id.CSDVML);
        csDLMV = (EditText) findViewById(R.id.CSDLMV);

        pmsMD = (EditText) findViewById(R.id.PMSMD);
        pmsVL = (EditText) findViewById(R.id.PMSVL);
        pmsDVML = (EditText) findViewById(R.id.PMSDVML);
        pmsDLMV = (EditText) findViewById(R.id.PMSDLMV);

        ciMD = (EditText) findViewById(R.id.CIMD);
        ciVL = (EditText) findViewById(R.id.CIVL);
        ciDVML = (EditText) findViewById(R.id.CIDVML);
        ciDLMV = (EditText) findViewById(R.id.CIDLMV);

        pmiMD = (EditText) findViewById(R.id.PMIMD);
        pmiVL = (EditText) findViewById(R.id.PMIVL);
        pmiDVML = (EditText) findViewById(R.id.PMIDVML);
        pmiDLMV = (EditText) findViewById(R.id.PMIDLMV);

        cal = (Button) findViewById(R.id.cal);


        try {
            Bundle datoR = this.getIntent().getExtras();
            TextView i = new TextView(Dientes.this);

            i.setText(datoR.getString("edad"));
            dato.putString("edadR", i.getText().toString());

        } catch (Exception e) {
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

    public void procesamiento() {

        String D1 = csMD.getText().toString();
        String D2 = csVL.getText().toString();
        String D3 = csDVML.getText().toString();
        String D4 = csDLMV.getText().toString();
        String D5 = pmsMD.getText().toString();
        String D6 = pmsVL.getText().toString();
        String D7 = pmsDVML.getText().toString();
        String D8 = pmsDLMV.getText().toString();
        String D9 = ciMD.getText().toString();
        String D10 = ciVL.getText().toString();
        String D11 = ciDVML.getText().toString();
        String D12 = ciDLMV.getText().toString();
        String D13 = pmiMD.getText().toString();
        String D14 = pmiVL.getText().toString();
        String D15 = pmiDVML.getText().toString();
        String D16 = pmiDLMV.getText().toString();


        dato.putString("d1", D1);
        dato.putString("d2", D2);
        dato.putString("d3", D3);
        dato.putString("d4", D4);
        dato.putString("d5", D5);
        dato.putString("d6", D6);
        dato.putString("d7", D7);
        dato.putString("d8", D8);
        dato.putString("d9", D9);
        dato.putString("d10", D10);
        dato.putString("d11", D11);
        dato.putString("d12", D12);
        dato.putString("d13", D13);
        dato.putString("d14", D14);
        dato.putString("d15", D15);
        dato.putString("d16", D16);


    }


    public void info(View V) {

        Titulo = "Odontograma";
        Aceptar = "Regresar";

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(R.layout.imagen_odontograma).setTitle(Titulo).setCancelable(false).setNeutralButton(Aceptar, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
        return;
    }

    public void boton(View v) {

             try {
                     procesamiento();
                     Intent in = new Intent(this, DatosPersona.class);
                     in.putExtras(dato);
                     startActivity(in);
                     finish();

             } catch (Exception e) {
                 Toast.makeText(this, "LLena Los Campos", Toast.LENGTH_LONG).show();
             }
    }
}
