package com.example.dante_000.sistemadientes;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

//import xyz.hanks.library.SmallBang;
//import xyz.hanks.library.SmallBangListener;

public class iconos extends AppCompatActivity {

    /**EditText P;
    EditText T;
    EditText Lr;

    double edad;
    DecimalFormat decimales = new DecimalFormat("0.00");
    private SmallBang mSmallBang;

    private String Mensaje;
    private String Titulo;
    private String Aceptar;**/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iconos);

        //mSmallBang = SmallBang.attach2Window(this);

    }

    /**public void info(View V) {

        /**mSmallBang.bang(V,new SmallBangListener() {

            public void onAnimationStart() {
            }
            public void onAnimationEnd() {
            }
        });

        Mensaje = "Promedio de error: +/- 10 años \n" +
                "Formula -> Edad = Px0.18 + Tx0.42 + 25.53\n" +
                "Donde:\n" +
                "P = (Longitud de la periodontosis x 100 )/Longitud de la Raiz\n" +
                "T= (Longitud de la transparencia x 100 )/ Longitud de la Raiz\n" +
                "Lr = Longitud de Raíz";
        Titulo = "Método de Lamendin";
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
    }**/
}
