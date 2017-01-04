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
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.text.DecimalFormat;

//import xyz.hanks.library.SmallBang;
//import xyz.hanks.library.SmallBangListener;

public class DatosFormatoAlone extends AppCompatActivity {

    LinearLayout d11, d12, d13, d14, d15, d16, d17;
    LinearLayout d21, d22, d23, d24, d25, d26, d27;
    LinearLayout d31, d32, d33, d34, d35, d36, d37;
    LinearLayout d41, d42, d43, d44, d45, d46, d47;

    double ed;
    int ed11, ed12, ed13, ed14, ed15, ed16, ed17;
    int ed21, ed22, ed23, ed24, ed25, ed26, ed27;
    int ed31, ed32, ed33, ed34, ed35, ed36, ed37;
    int ed41, ed42, ed43, ed44, ed45, ed46, ed47;

    /*----------------Cajas de texto Derecha superior-------------------*/

    TextView ET11MD,ET11VL,ET11DVML,ET11DLMV;
    TextView ET12MD,ET12VL,ET12DVML,ET12DLMV;
    TextView ET13MD,ET13VL,ET13DVML,ET13DLMV;
    TextView ET14MD,ET14VL,ET14DVML,ET14DLMV;
    TextView ET15MD,ET15VL,ET15DVML,ET15DLMV;
    TextView ET16MD,ET16VL,ET16DVML,ET16DLMV;
    TextView ET17MD,ET17VL,ET17DVML,ET17DLMV;

     /*----------------Cajas de texto Izquierda superior-------------------*/

    TextView ET21MD,ET21VL,ET21DVML,ET21DLMV;
    TextView ET22MD,ET22VL,ET22DVML,ET22DLMV;
    TextView ET23MD,ET23VL,ET23DVML,ET23DLMV;
    TextView ET24MD,ET24VL,ET24DVML,ET24DLMV;
    TextView ET25MD,ET25VL,ET25DVML,ET25DLMV;
    TextView ET26MD,ET26VL,ET26DVML,ET26DLMV;
    TextView ET27MD,ET27VL,ET27DVML,ET27DLMV;

     /*----------------Cajas de texto Izquierda inferior-------------------*/

    TextView ET31MD,ET31VL,ET31DVML,ET31DLMV;
    TextView ET32MD,ET32VL,ET32DVML,ET32DLMV;
    TextView ET33MD,ET33VL,ET33DVML,ET33DLMV;
    TextView ET34MD,ET34VL,ET34DVML,ET34DLMV;
    TextView ET35MD,ET35VL,ET35DVML,ET35DLMV;
    TextView ET36MD,ET36VL,ET36DVML,ET36DLMV;
    TextView ET37MD,ET37VL,ET37DVML,ET37DLMV;

     /*----------------Cajas de texto Derercha inferior-------------------*/

    TextView ET41MD,ET41VL,ET41DVML,ET41DLMV;
    TextView ET42MD,ET42VL,ET42DVML,ET42DLMV;
    TextView ET43MD,ET43VL,ET43DVML,ET43DLMV;
    TextView ET44MD,ET44VL,ET44DVML,ET44DLMV;
    TextView ET45MD,ET45VL,ET45DVML,ET45DLMV;
    TextView ET46MD,ET46VL,ET46DVML,ET46DLMV;
    TextView ET47MD,ET47VL,ET47DVML,ET47DLMV;



    //------------------comparar datos de procedimientos--------------------//
     /*----------------Cajas de texto Derecha superior-------------------*/

    double D11MD,D11VL,D11DVML,D11DLMV;
    double D12MD,D12VL,D12DVML,D12DLMV;
    double D13MD,D13VL,D13DVML,D13DLMV;
    double D14MD,D14VL,D14DVML,D14DLMV;
    double D15MD,D15VL,D15DVML,D15DLMV;
    double D16MD,D16VL,D16DVML,D16DLMV;
    double D17MD,D17VL,D17DVML,D17DLMV;

     /*----------------Cajas de texto Izquierda superior-------------------*/

    double D21MD,D21VL,D21DVML,D21DLMV;
    double D22MD,D22VL,D22DVML,D22DLMV;
    double D23MD,D23VL,D23DVML,D23DLMV;
    double D24MD,D24VL,D24DVML,D24DLMV;
    double D25MD,D25VL,D25DVML,D25DLMV;
    double D26MD,D26VL,D26DVML,D26DLMV;
    double D27MD,D27VL,D27DVML,D27DLMV;

     /*----------------Cajas de texto Izquierda inferior-------------------*/

    double D31MD,D31VL,D31DVML,D31DLMV;
    double D32MD,D32VL,D32DVML,D32DLMV;
    double D33MD,D33VL,D33DVML,D33DLMV;
    double D34MD,D34VL,D34DVML,D34DLMV;
    double D35MD,D35VL,D35DVML,D35DLMV;
    double D36MD,D36VL,D36DVML,D36DLMV;
    double D37MD,D37VL,D37DVML,D37DLMV;

     /*----------------Cajas de texto Derercha inferior-------------------*/

    double D41MD,D41VL,D41DVML,D41DLMV;
    double D42MD,D42VL,D42DVML,D42DLMV;
    double D43MD,D43VL,D43DVML,D43DLMV;
    double D44MD,D44VL,D44DVML,D44DLMV;
    double D45MD,D45VL,D45DVML,D45DLMV;
    double D46MD,D46VL,D46DVML,D46DLMV;
    double D47MD,D47VL,D47DVML,D47DLMV;


    Bundle datoR, datoRT;

    DatePicker tiempo;
    TextView fecha;


    ClaseTablaDatos CD = new ClaseTablaDatos();
    DecimalFormat decimales = new DecimalFormat("0.00");
    //private SmallBang mSmallBang;


    private String Mensaje;
    private String Titulo;
    private String Aceptar;

    FloatingActionButton menu, portal;
    Animation Fopen, FCloc, FRot, FRotan;
    boolean open = false;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formato_datos_alone);

        /*-----------------------------LinearLayout--------------------------*/

        d11 = (LinearLayout) findViewById(R.id.E11);
        d12 = (LinearLayout) findViewById(R.id.E12);
        d13 = (LinearLayout) findViewById(R.id.E13);
        d14 = (LinearLayout) findViewById(R.id.E14);
        d15 = (LinearLayout) findViewById(R.id.E15);
        d16 = (LinearLayout) findViewById(R.id.E16);
        d17 = (LinearLayout) findViewById(R.id.E17);
        /*----------------------------------------------*/
        d21 = (LinearLayout) findViewById(R.id.E21);
        d22 = (LinearLayout) findViewById(R.id.E22);
        d23 = (LinearLayout) findViewById(R.id.E23);
        d24 = (LinearLayout) findViewById(R.id.E24);
        d25 = (LinearLayout) findViewById(R.id.E25);
        d26 = (LinearLayout) findViewById(R.id.E26);
        d27 = (LinearLayout) findViewById(R.id.E27);
        /*----------------------------------------------*/
        d31 = (LinearLayout) findViewById(R.id.E31);
        d32 = (LinearLayout) findViewById(R.id.E32);
        d33 = (LinearLayout) findViewById(R.id.E33);
        d34 = (LinearLayout) findViewById(R.id.E34);
        d35 = (LinearLayout) findViewById(R.id.E35);
        d36 = (LinearLayout) findViewById(R.id.E36);
        d37 = (LinearLayout) findViewById(R.id.E37);
        /*----------------------------------------------*/
        d41 = (LinearLayout) findViewById(R.id.E41);
        d42 = (LinearLayout) findViewById(R.id.E42);
        d43 = (LinearLayout) findViewById(R.id.E43);
        d44 = (LinearLayout) findViewById(R.id.E44);
        d45 = (LinearLayout) findViewById(R.id.E45);
        d46 = (LinearLayout) findViewById(R.id.E46);
        d47 = (LinearLayout) findViewById(R.id.E47);


        /*--------------------dientes derechos superiores--------------------*/
        /*-----------------diente 11--------------------*/
        ET11MD = (TextView) findViewById(R.id.d11md);
        ET11VL = (TextView) findViewById(R.id.d11vl);
        ET11DVML = (TextView) findViewById(R.id.d11dvml);
        ET11DLMV = (TextView) findViewById(R.id.d11dlmv);
        /*-----------------diente 12--------------------*/
        ET12MD = (TextView) findViewById(R.id.d12md);
        ET12VL = (TextView) findViewById(R.id.d12vl);
        ET12DVML = (TextView) findViewById(R.id.d12dvml);
        ET12DLMV = (TextView) findViewById(R.id.d12dlmv);
        /*-----------------diente 13--------------------*/
        ET13MD = (TextView) findViewById(R.id.d13md);
        ET13VL = (TextView) findViewById(R.id.d13vl);
        ET13DVML = (TextView) findViewById(R.id.d13dvml);
        ET13DLMV = (TextView) findViewById(R.id.d13dlmv);
        /*-----------------diente 14--------------------*/
        ET14MD = (TextView) findViewById(R.id.d14md);
        ET14VL = (TextView) findViewById(R.id.d14vl);
        ET14DVML = (TextView) findViewById(R.id.d14dvml);
        ET14DLMV = (TextView) findViewById(R.id.d14dlmv);
        /*-----------------diente 15--------------------*/
        ET15MD = (TextView) findViewById(R.id.d15md);
        ET15VL = (TextView) findViewById(R.id.d15vl);
        ET15DVML = (TextView) findViewById(R.id.d15dvml);
        ET15DLMV = (TextView) findViewById(R.id.d15dlmv);
        /*-----------------diente 16--------------------*/
        ET16MD = (TextView) findViewById(R.id.d16md);
        ET16VL = (TextView) findViewById(R.id.d16vl);
        ET16DVML = (TextView) findViewById(R.id.d16dvml);
        ET16DLMV = (TextView) findViewById(R.id.d16dlmv);
        /*-----------------diente 17--------------------*/
        ET17MD = (TextView) findViewById(R.id.d17md);
        ET17VL = (TextView) findViewById(R.id.d17vl);
        ET17DVML = (TextView) findViewById(R.id.d17dvml);
        ET17DLMV = (TextView) findViewById(R.id.d17dlmv);

        /*--------------------dientes izquierdos superiores--------------------*/
        /*-----------------diente 21--------------------*/
        ET21MD = (TextView) findViewById(R.id.d21md);
        ET21VL = (TextView) findViewById(R.id.d21vl);
        ET21DVML = (TextView) findViewById(R.id.d21dvml);
        ET21DLMV = (TextView) findViewById(R.id.d21dlmv);
        /*-----------------diente 22--------------------*/
        ET22MD = (TextView) findViewById(R.id.d22md);
        ET22VL = (TextView) findViewById(R.id.d22vl);
        ET22DVML = (TextView) findViewById(R.id.d22dvml);
        ET22DLMV = (TextView) findViewById(R.id.d22dlmv);
        /*-----------------diente 23--------------------*/
        ET23MD = (TextView) findViewById(R.id.d23md);
        ET23VL = (TextView) findViewById(R.id.d23vl);
        ET23DVML = (TextView) findViewById(R.id.d23dvml);
        ET23DLMV = (TextView) findViewById(R.id.d23dlmv);
        /*-----------------diente 24--------------------*/
        ET24MD = (TextView) findViewById(R.id.d24md);
        ET24VL = (TextView) findViewById(R.id.d24vl);
        ET24DVML = (TextView) findViewById(R.id.d24dvml);
        ET24DLMV = (TextView) findViewById(R.id.d24dlmv);
        /*-----------------diente 25--------------------*/
        ET25MD = (TextView) findViewById(R.id.d25md);
        ET25VL = (TextView) findViewById(R.id.d25vl);
        ET25DVML = (TextView) findViewById(R.id.d25dvml);
        ET25DLMV = (TextView) findViewById(R.id.d25dlmv);
        /*-----------------diente 26--------------------*/
        ET26MD = (TextView) findViewById(R.id.d26md);
        ET26VL = (TextView) findViewById(R.id.d26vl);
        ET26DVML = (TextView) findViewById(R.id.d26dvml);
        ET26DLMV = (TextView) findViewById(R.id.d26dlmv);
        /*-----------------diente 27--------------------*/
        ET27MD = (TextView) findViewById(R.id.d27md);
        ET27VL = (TextView) findViewById(R.id.d27vl);
        ET27DVML = (TextView) findViewById(R.id.d27dvml);
        ET27DLMV = (TextView) findViewById(R.id.d27dlmv);

        /*--------------------dientes izquierdos inferiores--------------------*/
        /*-----------------diente 31--------------------*/
        ET31MD = (TextView) findViewById(R.id.d31md);
        ET31VL = (TextView) findViewById(R.id.d31vl);
        ET31DVML = (TextView) findViewById(R.id.d31dvml);
        ET31DLMV = (TextView) findViewById(R.id.d31dlmv);
        /*-----------------diente 32--------------------*/
        ET32MD = (TextView) findViewById(R.id.d32md);
        ET32VL = (TextView) findViewById(R.id.d32vl);
        ET32DVML = (TextView) findViewById(R.id.d32dvml);
        ET32DLMV = (TextView) findViewById(R.id.d32dlmv);
        /*-----------------diente 33--------------------*/
        ET33MD = (TextView) findViewById(R.id.d33md);
        ET33VL = (TextView) findViewById(R.id.d33vl);
        ET33DVML = (TextView) findViewById(R.id.d33dvml);
        ET33DLMV = (TextView) findViewById(R.id.d33dlmv);
        /*-----------------diente 34--------------------*/
        ET34MD = (TextView) findViewById(R.id.d34md);
        ET34VL = (TextView) findViewById(R.id.d34vl);
        ET34DVML = (TextView) findViewById(R.id.d34dvml);
        ET34DLMV = (TextView) findViewById(R.id.d34dlmv);
        /*-----------------diente 35--------------------*/
        ET35MD = (TextView) findViewById(R.id.d35md);
        ET35VL = (TextView) findViewById(R.id.d35vl);
        ET35DVML = (TextView) findViewById(R.id.d35dvml);
        ET35DLMV = (TextView) findViewById(R.id.d35dlmv);
        /*-----------------diente 36--------------------*/
        ET36MD = (TextView) findViewById(R.id.d36md);
        ET36VL = (TextView) findViewById(R.id.d36vl);
        ET36DVML = (TextView) findViewById(R.id.d36dvml);
        ET36DLMV = (TextView) findViewById(R.id.d36dlmv);
        /*-----------------diente 37--------------------*/
        ET37MD = (TextView) findViewById(R.id.d37md);
        ET37VL = (TextView) findViewById(R.id.d37vl);
        ET37DVML = (TextView) findViewById(R.id.d37dvml);
        ET37DLMV = (TextView) findViewById(R.id.d37dlmv);

        /*--------------------dientes derechos inferiores--------------------*/
        /*-----------------diente 41--------------------*/
        ET41MD = (TextView) findViewById(R.id.d41md);
        ET41VL = (TextView) findViewById(R.id.d41vl);
        ET41DVML = (TextView) findViewById(R.id.d41dvml);
        ET41DLMV = (TextView) findViewById(R.id.d41dlmv);
        /*-----------------diente 42--------------------*/
        ET42MD = (TextView) findViewById(R.id.d42md);
        ET42VL = (TextView) findViewById(R.id.d42vl);
        ET42DVML = (TextView) findViewById(R.id.d42dvml);
        ET42DLMV = (TextView) findViewById(R.id.d42dlmv);
        /*-----------------diente 43--------------------*/
        ET43MD = (TextView) findViewById(R.id.d43md);
        ET43VL = (TextView) findViewById(R.id.d43vl);
        ET43DVML = (TextView) findViewById(R.id.d43dvml);
        ET43DLMV = (TextView) findViewById(R.id.d43dlmv);
        /*-----------------diente 44--------------------*/
        ET44MD = (TextView) findViewById(R.id.d44md);
        ET44VL = (TextView) findViewById(R.id.d44vl);
        ET44DVML = (TextView) findViewById(R.id.d44dvml);
        ET44DLMV = (TextView) findViewById(R.id.d44dlmv);
        /*-----------------diente 45--------------------*/
        ET45MD = (TextView) findViewById(R.id.d45md);
        ET45VL = (TextView) findViewById(R.id.d45vl);
        ET45DVML = (TextView) findViewById(R.id.d45dvml);
        ET45DLMV = (TextView) findViewById(R.id.d45dlmv);
        /*-----------------diente 46--------------------*/
        ET46MD = (TextView) findViewById(R.id.d46md);
        ET46VL = (TextView) findViewById(R.id.d46vl);
        ET46DVML = (TextView) findViewById(R.id.d46dvml);
        ET46DLMV = (TextView) findViewById(R.id.d46dlmv);
        /*-----------------diente 47--------------------*/
        ET47MD = (TextView) findViewById(R.id.d47md);
        ET47VL = (TextView) findViewById(R.id.d47vl);
        ET47DVML = (TextView) findViewById(R.id.d47dvml);
        ET47DLMV = (TextView) findViewById(R.id.d47dlmv);




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

            formatovd();
            datos();
            valores();

            comparar(dientesD());

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

                if (open) {
                    portal.startAnimation(FCloc);
                    menu.startAnimation(FRotan);
                    portal.setClickable(false);
                    open = false;
                } else {
                    portal.startAnimation(Fopen);
                    menu.startAnimation(FRot);
                    portal.setClickable(true);
                    open = true;
                }
            }
        });
    }

    public Double[] dientesD() {

        //-----------dientes derechos----------------//



        Double[] datosD = {D11MD, D12MD, D13MD, D14MD, D15MD, D16MD, D17MD, D11VL, D12VL, D13VL, D14VL, D15VL, D16VL, D17VL,
                           D11DVML, D12DVML, D13DVML, D14DVML, D15DVML, D16DVML, D17DVML, D11DLMV, D12DLMV, D13DLMV, D14DLMV, D15DLMV, D16DLMV, D17DLMV,
                           D41MD, D42MD, D43MD, D44MD, D45MD, D46MD, D47MD, D41VL, D42VL, D43VL, D44VL, D45VL, D46VL, D47VL,
                           D41DVML, D42DVML, D43DVML, D44DVML, D45DVML, D46DVML, D47DVML, D41DLMV, D42DLMV, D43DLMV, D44DLMV, D45DLMV, D46DLMV, D47DLMV,
                           D21MD, D22MD, D23MD, D24MD, D25MD, D26MD, D27MD, D21VL, D22VL, D23VL, D24VL, D25VL, D26VL, D27VL,
                           D21DVML, D22DVML, D23DVML, D24DVML, D25DVML, D26DVML, D27DVML, D21DLMV, D22DLMV, D23DLMV, D24DLMV, D25DLMV, D26DLMV, D27DLMV,
                           D31MD, D32MD, D33MD, D34MD, D35MD, D36MD, D37MD, D31VL, D32VL, D33VL, D34VL, D35VL, D36VL, D37VL,
                           D31DVML, D32DVML, D33DVML, D34DVML, D35DVML, D36DVML, D37DVML, D31DLMV, D32DLMV, D33DLMV, D34DLMV, D35DLMV, D36DLMV, D37DLMV};

        return datosD;

    }


    public void comparar(Double[] d) {

        CD.dientes();

        int[] datosentrada = new int[112];
        int H = 0, M = 0;

        for (int i= 0; i < 112; i++) {
            if (d[i] >= CD.H[i][0] && d[i] <= CD.H[i][1]) {
                datosentrada[i] = 1;
            } else {
                datosentrada[i] = 0;
            }
        }

        for (int i = 0; i < 112; i++) {
            if (datosentrada[i] == 0) {
                if (d[i] >= CD.M[i][0] && d[i] <= CD.M[i][1]) {
                    datosentrada[i] = 2;
                }
            }

        }

        for (int i = 0; i < 112; i++) {
            switch (datosentrada[i]) {
                case (1): {
                    Mensaje = "El dato" + i + 1 + " coincide "
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
                    Mensaje = "El dato" + i + 1 + " coincide "
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
                + "Se encontraron " + M + " datos que coinciden con información de una Mujer";
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

            porcentaje = (H * 50) / reales;

            Mensaje = "as aproximaciones estimadas sugieren que es: Hombre";
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

        if (H < M) {

            Mensaje = "no se enontro ninguna probabilidad de que sea mujer o hombre";
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

        else {
            reales = H + M;

            porcentaje = (M * 50) / reales;

            Mensaje = "Las aproximaciones estimadas sugieren que es: Mujer";
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
        comparar(dientesD());
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
    public boolean onOptionsItemSelected(MenuItem item){
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_datos) {

            Document Doc = new Document(PageSize.LETTER,20,20,200,100);
            String outpatch = Environment.getExternalStorageDirectory()+"/DatosOdontologiaEstimaciònSexo.pdf";
            PdfPTable table = new PdfPTable(7);
            PdfPTable table2 = new PdfPTable(7);
            PdfPTable table3 = new PdfPTable(7);
            PdfPTable table4 = new PdfPTable(7);
            try {
                PdfWriter.getInstance(Doc, new FileOutputStream(outpatch));
                PdfWriter writer = PdfWriter.getInstance(Doc, new FileOutputStream(outpatch));
                Font fuente = new Font();
                Font fuente1 = new Font();
                Font fuente2 = new Font();

                Doc.open();

                fuente.setSize(10);
                fuente.setStyle(Font.BOLD);
                fuente.setFamily(Font.FontFamily.HELVETICA.toString());
                fuente1.setSize(40);
                fuente1.setStyle(Font.BOLD);
                fuente1.setFamily(Font.FontFamily.TIMES_ROMAN.toString());
                fuente2.setSize(15);
                fuente2.setStyle(Font.ITALIC);
                fuente2.setFamily(Font.FontFamily.TIMES_ROMAN.toString());


                ColumnText.showTextAligned( writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("Univerdad Nacional Autonoma de México",fuente), 150,750,0);
                ColumnText.showTextAligned( writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("Odontología",fuente), 500,750,0);

                ColumnText.showTextAligned( writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("Estimacion de sexo",fuente1), 300,630,0);
                ColumnText.showTextAligned( writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("Dientes Derechos Superiores",fuente), 320,600,0);
                ColumnText.showTextAligned( writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("Dientes Izquierdos Superiores",fuente), 320,490,0);
                ColumnText.showTextAligned( writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("Dientes Izquierdos Inferiores",fuente), 320,380,0);
                ColumnText.showTextAligned( writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("Dientes Derechos Inferiores",fuente), 320,270,0);


                table.getDefaultCell().setBorder(Rectangle.BOTTOM);


                table.addCell("Diente 11");
                table.addCell("Diente 12");
                table.addCell("Diente 13");
                table.addCell("Diente 14");
                table.addCell("Diente 15");
                table.addCell("Diente 16");
                table.addCell("Diente 17");

                table.addCell(ET11MD.getText().toString());
                table.addCell(ET12MD.getText().toString());
                table.addCell(ET13MD.getText().toString());
                table.addCell(ET14MD.getText().toString());
                table.addCell(ET15MD.getText().toString());
                table.addCell(ET16MD.getText().toString());
                table.addCell(ET17MD.getText().toString());

                table.addCell(ET11VL.getText().toString());
                table.addCell(ET12VL.getText().toString());
                table.addCell(ET13VL.getText().toString());
                table.addCell(ET14VL.getText().toString());
                table.addCell(ET15VL.getText().toString());
                table.addCell(ET16VL.getText().toString());
                table.addCell(ET17VL.getText().toString());

                table.addCell(ET11DVML.getText().toString());
                table.addCell(ET12DVML.getText().toString());
                table.addCell(ET13DVML.getText().toString());
                table.addCell(ET14DVML.getText().toString());
                table.addCell(ET15DVML.getText().toString());
                table.addCell(ET16DVML.getText().toString());
                table.addCell(ET17DVML.getText().toString());

                table.addCell(ET11DLMV.getText().toString());
                table.addCell(ET12DLMV.getText().toString());
                table.addCell(ET13DLMV.getText().toString());
                table.addCell(ET14DLMV.getText().toString());
                table.addCell(ET15DLMV.getText().toString());
                table.addCell(ET16DLMV.getText().toString());
                table.addCell(ET17DLMV.getText().toString());


                table.setHorizontalAlignment(Element.ALIGN_CENTER);

                table2.getDefaultCell().setBorder(Rectangle.BOTTOM);
                table2.setSpacingBefore(30);


                table2.addCell("Diente 21");
                table2.addCell("Diente 22");
                table2.addCell("Diente 23");
                table2.addCell("Diente 24");
                table2.addCell("Diente 25");
                table2.addCell("Diente 26");
                table2.addCell("Diente 27");

                table2.addCell(ET21MD.getText().toString());
                table2.addCell(ET22MD.getText().toString());
                table2.addCell(ET23MD.getText().toString());
                table2.addCell(ET24MD.getText().toString());
                table2.addCell(ET25MD.getText().toString());
                table2.addCell(ET26MD.getText().toString());
                table2.addCell(ET27MD.getText().toString());

                table2.addCell(ET21VL.getText().toString());
                table2.addCell(ET22VL.getText().toString());
                table2.addCell(ET23VL.getText().toString());
                table2.addCell(ET24VL.getText().toString());
                table2.addCell(ET25VL.getText().toString());
                table2.addCell(ET26VL.getText().toString());
                table2.addCell(ET27VL.getText().toString());

                table2.addCell(ET21DVML.getText().toString());
                table2.addCell(ET22DVML.getText().toString());
                table2.addCell(ET23DVML.getText().toString());
                table2.addCell(ET24DVML.getText().toString());
                table2.addCell(ET25DVML.getText().toString());
                table2.addCell(ET26DVML.getText().toString());
                table2.addCell(ET27DVML.getText().toString());

                table2.addCell(ET21DLMV.getText().toString());
                table2.addCell(ET22DLMV.getText().toString());
                table2.addCell(ET23DLMV.getText().toString());
                table2.addCell(ET24DLMV.getText().toString());
                table2.addCell(ET25DLMV.getText().toString());
                table2.addCell(ET26DLMV.getText().toString());
                table2.addCell(ET27DLMV.getText().toString());


                table2.setHorizontalAlignment(Element.ALIGN_CENTER);

                table3.getDefaultCell().setBorder(Rectangle.BOTTOM);
                table3.setSpacingBefore(30);


                table3.addCell("Diente 31");
                table3.addCell("Diente 32");
                table3.addCell("Diente 33");
                table3.addCell("Diente 34");
                table3.addCell("Diente 35");
                table3.addCell("Diente 36");
                table3.addCell("Diente 37");

                table3.addCell(ET31MD.getText().toString());
                table3.addCell(ET32MD.getText().toString());
                table3.addCell(ET33MD.getText().toString());
                table3.addCell(ET34MD.getText().toString());
                table3.addCell(ET35MD.getText().toString());
                table3.addCell(ET36MD.getText().toString());
                table3.addCell(ET37MD.getText().toString());

                table3.addCell(ET31VL.getText().toString());
                table3.addCell(ET32VL.getText().toString());
                table3.addCell(ET33VL.getText().toString());
                table3.addCell(ET34VL.getText().toString());
                table3.addCell(ET35VL.getText().toString());
                table3.addCell(ET36VL.getText().toString());
                table3.addCell(ET37VL.getText().toString());

                table3.addCell(ET31DVML.getText().toString());
                table3.addCell(ET32DVML.getText().toString());
                table3.addCell(ET33DVML.getText().toString());
                table3.addCell(ET34DVML.getText().toString());
                table3.addCell(ET35DVML.getText().toString());
                table3.addCell(ET36DVML.getText().toString());
                table3.addCell(ET37DVML.getText().toString());

                table3.addCell(ET31DLMV.getText().toString());
                table3.addCell(ET32DLMV.getText().toString());
                table3.addCell(ET33DLMV.getText().toString());
                table3.addCell(ET34DLMV.getText().toString());
                table3.addCell(ET35DLMV.getText().toString());
                table3.addCell(ET36DLMV.getText().toString());
                table3.addCell(ET37DLMV.getText().toString());


                table3.setHorizontalAlignment(Element.ALIGN_CENTER);



                table4.getDefaultCell().setBorder(Rectangle.BOTTOM);
                table4.setSpacingBefore(30);


                table4.addCell("Diente 41");
                table4.addCell("Diente 42");
                table4.addCell("Diente 43");
                table4.addCell("Diente 44");
                table4.addCell("Diente 45");
                table4.addCell("Diente 46");
                table4.addCell("Diente 47");

                table4.addCell(ET41MD.getText().toString());
                table4.addCell(ET42MD.getText().toString());
                table4.addCell(ET43MD.getText().toString());
                table4.addCell(ET44MD.getText().toString());
                table4.addCell(ET45MD.getText().toString());
                table4.addCell(ET46MD.getText().toString());
                table4.addCell(ET47MD.getText().toString());

                table4.addCell(ET41VL.getText().toString());
                table4.addCell(ET42VL.getText().toString());
                table4.addCell(ET43VL.getText().toString());
                table4.addCell(ET44VL.getText().toString());
                table4.addCell(ET45VL.getText().toString());
                table4.addCell(ET46VL.getText().toString());
                table4.addCell(ET47VL.getText().toString());

                table4.addCell(ET41DVML.getText().toString());
                table4.addCell(ET42DVML.getText().toString());
                table4.addCell(ET43DVML.getText().toString());
                table4.addCell(ET44DVML.getText().toString());
                table4.addCell(ET45DVML.getText().toString());
                table4.addCell(ET46DVML.getText().toString());
                table4.addCell(ET47DVML.getText().toString());

                table4.addCell(ET41DLMV.getText().toString());
                table4.addCell(ET42DLMV.getText().toString());
                table4.addCell(ET43DLMV.getText().toString());
                table4.addCell(ET44DLMV.getText().toString());
                table4.addCell(ET45DLMV.getText().toString());
                table4.addCell(ET46DLMV.getText().toString());
                table4.addCell(ET47DLMV.getText().toString());


                table4.setHorizontalAlignment(Element.ALIGN_CENTER);


                Doc.add(table);

                Doc.add(table2);

                Doc.add(table3);

                Doc.add(table4);

                ColumnText.showTextAligned( writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase(Mensaje,fuente2), 300,110,0);

                ColumnText.showTextAligned( writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase(fecha.getText().toString(),fuente2), 100,50,0);

                Doc.close();

                Toast.makeText(this, "Se genero el Formato PDF con exito su ubicacion es: " +outpatch, Toast.LENGTH_SHORT).show();
            }
            catch (DocumentException e){
                e.printStackTrace();
            }
            catch (FileNotFoundException e){
                e.printStackTrace();
            }
            /*catch (IOException e){
                Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
            }*/
        }

        return super.onOptionsItemSelected(item);
    }

    /*--------------formato de vista de datos--------------*/
    public void formatovd(){

        datoR = this.getIntent().getExtras();

        TextView D11 = new TextView(this);
        TextView D12 = new TextView(this);
        TextView D13 = new TextView(this);
        TextView D14 = new TextView(this);
        TextView D15 = new TextView(this);
        TextView D16 = new TextView(this);
        TextView D17 = new TextView(this);
            /*---------------------------------------------*/
        TextView D21 = new TextView(this);
        TextView D22 = new TextView(this);
        TextView D23 = new TextView(this);
        TextView D24 = new TextView(this);
        TextView D25 = new TextView(this);
        TextView D26 = new TextView(this);
        TextView D27 = new TextView(this);
            /*---------------------------------------------*/
        TextView D31 = new TextView(this);
        TextView D32 = new TextView(this);
        TextView D33 = new TextView(this);
        TextView D34 = new TextView(this);
        TextView D35 = new TextView(this);
        TextView D36 = new TextView(this);
        TextView D37 = new TextView(this);
            /*---------------------------------------------*/
        TextView D41 = new TextView(this);
        TextView D42 = new TextView(this);
        TextView D43 = new TextView(this);
        TextView D44 = new TextView(this);
        TextView D45 = new TextView(this);
        TextView D46 = new TextView(this);
        TextView D47 = new TextView(this);


        D11.setText("" + datoR.getString("f11"));
        ed11 = Integer.parseInt(D11.getText().toString());
        D12.setText("" + datoR.getString("f12"));
        ed12 = Integer.parseInt(D12.getText().toString());
        D13.setText("" + datoR.getString("f13"));
        ed13 = Integer.parseInt(D13.getText().toString());
        D14.setText("" + datoR.getString("f14"));
        ed14 = Integer.parseInt(D14.getText().toString());
        D15.setText("" + datoR.getString("f15"));
        ed15 = Integer.parseInt(D15.getText().toString());
        D16.setText("" + datoR.getString("f16"));
        ed16 = Integer.parseInt(D16.getText().toString());
        D17.setText("" + datoR.getString("f17"));
        ed17 = Integer.parseInt(D17.getText().toString());
            /*-------------------------------------------------------*/
        D21.setText("" + datoR.getString("f21"));
        ed21 = Integer.parseInt(D21.getText().toString());
        D22.setText("" + datoR.getString("f22"));
        ed22 = Integer.parseInt(D22.getText().toString());
        D23.setText("" + datoR.getString("f23"));
        ed23 = Integer.parseInt(D23.getText().toString());
        D24.setText("" + datoR.getString("f24"));
        ed24 = Integer.parseInt(D24.getText().toString());
        D25.setText("" + datoR.getString("f25"));
        ed25 = Integer.parseInt(D25.getText().toString());
        D26.setText("" + datoR.getString("f26"));
        ed26 = Integer.parseInt(D26.getText().toString());
        D27.setText("" + datoR.getString("f27"));
        ed27 = Integer.parseInt(D27.getText().toString());
            /*-------------------------------------------------------*/
        D31.setText("" + datoR.getString("f31"));
        ed31 = Integer.parseInt(D31.getText().toString());
        D32.setText("" + datoR.getString("f32"));
        ed32 = Integer.parseInt(D32.getText().toString());
        D33.setText("" + datoR.getString("f33"));
        ed33 = Integer.parseInt(D33.getText().toString());
        D34.setText("" + datoR.getString("f34"));
        ed34 = Integer.parseInt(D34.getText().toString());
        D35.setText("" + datoR.getString("f35"));
        ed35 = Integer.parseInt(D35.getText().toString());
        D36.setText("" + datoR.getString("f36"));
        ed36 = Integer.parseInt(D36.getText().toString());
        D37.setText("" + datoR.getString("f37"));
        ed37 = Integer.parseInt(D37.getText().toString());
            /*-------------------------------------------------------*/
        D41.setText("" + datoR.getString("f41"));
        ed41 = Integer.parseInt(D41.getText().toString());
        D42.setText("" + datoR.getString("f42"));
        ed42 = Integer.parseInt(D42.getText().toString());
        D43.setText("" + datoR.getString("f43"));
        ed43 = Integer.parseInt(D43.getText().toString());
        D44.setText("" + datoR.getString("f44"));
        ed44 = Integer.parseInt(D44.getText().toString());
        D45.setText("" + datoR.getString("f45"));
        ed45 = Integer.parseInt(D45.getText().toString());
        D46.setText("" + datoR.getString("f46"));
        ed46 = Integer.parseInt(D46.getText().toString());
        D47.setText("" + datoR.getString("f47"));
        ed47 = Integer.parseInt(D47.getText().toString());


        dientesDS();
        dientesIS();
        dientesII();
        dientesDI();

    }

    public void dientesDS(){
        if(ed11 == 1) {
            d11.setVisibility(View.VISIBLE);
        }
        else{
            d11.setVisibility(View.GONE);
        }
        if(ed12 == 1) {
            d12.setVisibility(View.VISIBLE);
        }
        else{
            d12.setVisibility(View.GONE);
        }
        if(ed13 == 1) {
            d13.setVisibility(View.VISIBLE);
        }
        else{
            d13.setVisibility(View.GONE);
        }

        if(ed14 == 1) {
            d14.setVisibility(View.VISIBLE);
        }
        else{
            d14.setVisibility(View.GONE);
        }
        if(ed15 == 1) {
            d15.setVisibility(View.VISIBLE);
        }
        else{
            d15.setVisibility(View.GONE);
        }
        if(ed16 == 1) {
            d16.setVisibility(View.VISIBLE);
        }
        else{
            d16.setVisibility(View.GONE);
        }
        if(ed17 == 1) {
            d17.setVisibility(View.VISIBLE);
        }
        else{
            d17.setVisibility(View.GONE);
        }
    }

    public void dientesIS(){
        if(ed21 == 1) {
            d21.setVisibility(View.VISIBLE);
        }
        else{
            d21.setVisibility(View.GONE);
        }
        if(ed22 == 1) {
            d22.setVisibility(View.VISIBLE);
        }
        else{
            d22.setVisibility(View.GONE);
        }
        if(ed23 == 1) {
            d23.setVisibility(View.VISIBLE);
        }
        else{
            d23.setVisibility(View.GONE);
        }

        if(ed24 == 1) {
            d24.setVisibility(View.VISIBLE);
        }
        else{
            d24.setVisibility(View.GONE);
        }
        if(ed25 == 1) {
            d25.setVisibility(View.VISIBLE);
        }
        else{
            d25.setVisibility(View.GONE);
        }
        if(ed26 == 1) {
            d26.setVisibility(View.VISIBLE);
        }
        else{
            d26.setVisibility(View.GONE);
        }
        if(ed27 == 1) {
            d27.setVisibility(View.VISIBLE);
        }
        else{
            d27.setVisibility(View.GONE);
        }
    }

    public void dientesII(){
        if(ed31 == 1) {
            d31.setVisibility(View.VISIBLE);
        }
        else{
            d31.setVisibility(View.GONE);
        }
        if(ed32 == 1) {
            d32.setVisibility(View.VISIBLE);
        }
        else{
            d32.setVisibility(View.GONE);
        }
        if(ed33 == 1) {
            d33.setVisibility(View.VISIBLE);
        }
        else{
            d33.setVisibility(View.GONE);
        }

        if(ed34 == 1) {
            d34.setVisibility(View.VISIBLE);
        }
        else{
            d34.setVisibility(View.GONE);
        }
        if(ed35 == 1) {
            d35.setVisibility(View.VISIBLE);
        }
        else{
            d35.setVisibility(View.GONE);
        }
        if(ed36 == 1) {
            d36.setVisibility(View.VISIBLE);
        }
        else{
            d36.setVisibility(View.GONE);
        }
        if(ed37 == 1) {
            d37.setVisibility(View.VISIBLE);
        }
        else{
            d37.setVisibility(View.GONE);
        }
    }

    public void dientesDI(){
        if(ed41 == 1) {
            d41.setVisibility(View.VISIBLE);
        }
        else{
            d41.setVisibility(View.GONE);
        }
        if(ed42 == 1) {
            d42.setVisibility(View.VISIBLE);
        }
        else{
            d42.setVisibility(View.GONE);
        }
        if(ed43 == 1) {
            d43.setVisibility(View.VISIBLE);
        }
        else{
            d43.setVisibility(View.GONE);
        }

        if(ed44 == 1) {
            d44.setVisibility(View.VISIBLE);
        }
        else{
            d44.setVisibility(View.GONE);
        }
        if(ed45 == 1) {
            d45.setVisibility(View.VISIBLE);
        }
        else{
            d45.setVisibility(View.GONE);
        }
        if(ed46 == 1) {
            d46.setVisibility(View.VISIBLE);
        }
        else{
            d46.setVisibility(View.GONE);
        }
        if(ed47 == 1) {
            d47.setVisibility(View.VISIBLE);
        }
        else{
            d47.setVisibility(View.GONE);
        }
    }

    /*------------------------Datos bundle-----------------------*/
    public void datos(){

        datoRT = this.getIntent().getExtras();

        TextView res = new TextView(this);

        /*-----------------dientes derecha superior--------------*/
        /*------------------diente 11------------------*/
        ET11MD.setText("MD: " + datoRT.getString("et11md"));
        ET11VL.setText("VL: " + datoRT.getString("et11vl"));
        ET11DVML.setText("DV-ML: " + datoRT.getString("et11dvml"));
        ET11DLMV.setText("DL-MV: " + datoRT.getString("et11dlmv"));

        /*------------------diente 12------------------*/
        ET12MD.setText("MD: " + datoRT.getString("et12md"));
        ET12VL.setText("VL: " + datoRT.getString("et12vl"));
        ET12DVML.setText("DV-ML: " + datoRT.getString("et12dvml"));
        ET12DLMV.setText("DL-MV: " + datoRT.getString("et12dlmv"));

        /*------------------diente 13------------------*/
        ET13MD.setText("MD: " + datoRT.getString("et13md"));
        ET13VL.setText("VL: " + datoRT.getString("et13vl"));
        ET13DVML.setText("DV-ML: " + datoRT.getString("et13dvml"));
        ET13DLMV.setText("DL-MV: " + datoRT.getString("et13dlmv"));

        /*------------------diente 14------------------*/
        ET14MD.setText("MD: " + datoRT.getString("et14md"));
        ET14VL.setText("VL: " + datoRT.getString("et14vl"));
        ET14DVML.setText("DV-ML: " + datoRT.getString("et14dvml"));
        ET14DLMV.setText("DL-MV: " + datoRT.getString("et14dlmv"));

        /*------------------diente 15------------------*/
        ET15MD.setText("MD: " + datoRT.getString("et15md"));
        ET15VL.setText("VL: " + datoRT.getString("et15vl"));
        ET15DVML.setText("DV-ML: " + datoRT.getString("et15dvml"));
        ET15DLMV.setText("DL-MV: " + datoRT.getString("et15dlmv"));

        /*------------------diente 16------------------*/
        ET16MD.setText("MD: " + datoRT.getString("et16md"));
        ET16VL.setText("VL: " + datoRT.getString("et16vl"));
        ET16DVML.setText("DV-ML: " + datoRT.getString("et16dvml"));
        ET16DLMV.setText("DL-MV: " + datoRT.getString("et16dlmv"));

        /*------------------diente 17------------------*/
        ET17MD.setText("MD: " + datoRT.getString("et17md"));
        ET17VL.setText("VL: " + datoRT.getString("et17vl"));
        ET17DVML.setText("DV-ML: " + datoRT.getString("et17dvml"));
        ET17DLMV.setText("DL-MV: " + datoRT.getString("et17dlmv"));



        /*-----------------dientes izquierda superior--------------*/
        /*------------------diente 21------------------*/
        ET21MD.setText("MD: " + datoRT.getString("et21md"));
        ET21VL.setText("VL: " + datoRT.getString("et21vl"));
        ET21DVML.setText("DV-ML: " + datoRT.getString("et21dvml"));
        ET21DLMV.setText("DL-MV: " + datoRT.getString("et21dlmv"));

        /*------------------diente 22------------------*/
        ET22MD.setText("MD: " + datoRT.getString("et22md"));
        ET22VL.setText("VL: " + datoRT.getString("et22vl"));
        ET22DVML.setText("DV-ML: " + datoRT.getString("et22dvml"));
        ET22DLMV.setText("DL-MV: " + datoRT.getString("et22dlmv"));

        /*------------------diente 23------------------*/
        ET23MD.setText("MD: " + datoRT.getString("et23md"));
        ET23VL.setText("VL: " + datoRT.getString("et23vl"));
        ET23DVML.setText("DV-ML: " + datoRT.getString("et23dvml"));
        ET23DLMV.setText("DL-MV: " + datoRT.getString("et23dlmv"));

        /*------------------diente 24------------------*/
        ET24MD.setText("MD: " + datoRT.getString("et24md"));
        ET24VL.setText("VL: " + datoRT.getString("et24vl"));
        ET24DVML.setText("DV-ML: " + datoRT.getString("et24dvml"));
        ET24DLMV.setText("DL-MV: " + datoRT.getString("et24dlmv"));

        /*------------------diente 25------------------*/
        ET25MD.setText("MD: " + datoRT.getString("et25md"));
        ET25VL.setText("VL: " + datoRT.getString("et25vl"));
        ET25DVML.setText("DV-ML: " + datoRT.getString("et25dvml"));
        ET25DLMV.setText("DL-MV: " + datoRT.getString("et25dlmv"));

        /*------------------diente 26------------------*/
        ET26MD.setText("MD: " + datoRT.getString("et26md"));
        ET26VL.setText("VL: " + datoRT.getString("et26vl"));
        ET26DVML.setText("DV-ML: " + datoRT.getString("et26dvml"));
        ET26DLMV.setText("DL-MV: " + datoRT.getString("et26dlmv"));

        /*------------------diente 27------------------*/
        ET27MD.setText("MD: " + datoRT.getString("et27md"));
        ET27VL.setText("VL: " + datoRT.getString("et27vl"));
        ET27DVML.setText("DV-ML: " + datoRT.getString("et27dvml"));
        ET27DLMV.setText("DL-MV: " + datoRT.getString("et27dlmv"));




        /*-----------------dientes izquierda inferior--------------*/
        /*------------------diente 31------------------*/
        ET31MD.setText("MD: " + datoRT.getString("et31md"));
        ET31VL.setText("VL: " + datoRT.getString("et31vl"));
        ET31DVML.setText("DV-ML: " + datoRT.getString("et31dvml"));
        ET31DLMV.setText("DL-MV: " + datoRT.getString("et31dlmv"));

        /*------------------diente 32------------------*/
        ET32MD.setText("MD: " + datoRT.getString("et32md"));
        ET32VL.setText("VL: " + datoRT.getString("et32vl"));
        ET32DVML.setText("DV-ML: " + datoRT.getString("et32dvml"));
        ET32DLMV.setText("DL-MV: " + datoRT.getString("et32dlmv"));

        /*------------------diente 33------------------*/
        ET33MD.setText("MD: " + datoRT.getString("et33md"));
        ET33VL.setText("VL: " + datoRT.getString("et33vl"));
        ET33DVML.setText("DV-ML: " + datoRT.getString("et33dvml"));
        ET33DLMV.setText("DL-MV: " + datoRT.getString("et33dlmv"));

        /*------------------diente 34------------------*/
        ET34MD.setText("MD: " + datoRT.getString("et34md"));
        ET34VL.setText("VL: " + datoRT.getString("et34vl"));
        ET34DVML.setText("DV-ML: " + datoRT.getString("et34dvml"));
        ET34DLMV.setText("DL-MV: " + datoRT.getString("et34dlmv"));

        /*------------------diente 35------------------*/
        ET35MD.setText("MD: " + datoRT.getString("et35md"));
        ET35VL.setText("VL: " + datoRT.getString("et35vl"));
        ET35DVML.setText("DV-ML: " + datoR.getString("et35dvml"));
        ET35DLMV.setText("DL-MV: " + datoR.getString("et35dlmv"));

        /*------------------diente 36------------------*/
        ET36MD.setText("MD: " + datoRT.getString("et36md"));
        ET36VL.setText("VL: " + datoRT.getString("et36vl"));
        ET36DVML.setText("DV-ML: " + datoRT.getString("et36dvml"));
        ET36DLMV.setText("DL-MV: " + datoRT.getString("et36dlmv"));

        /*------------------diente 37------------------*/
        ET37MD.setText("MD: " + datoRT.getString("et37md"));
        ET37VL.setText("VL: " + datoRT.getString("et37vl"));
        ET37DVML.setText("DV-ML: " + datoRT.getString("et37dvml"));
        ET37DLMV.setText("DL-MV: " + datoRT.getString("et37dlmv"));


        /*-----------------dientes derecha inferior--------------*/
        /*------------------diente 41------------------*/
        ET41MD.setText("MD: " + datoRT.getString("et41md"));
        ET41VL.setText("VL: " + datoRT.getString("et41vl"));
        ET41DVML.setText("DV-ML: " + datoRT.getString("et41dvml"));
        ET41DLMV.setText("DL-MV: " + datoRT.getString("et41dlmv"));

        /*------------------diente 42------------------*/
        ET42MD.setText("MD: " + datoRT.getString("et42md"));
        ET42VL.setText("VL: " + datoRT.getString("et42vl"));
        ET42DVML.setText("DV-ML: " + datoRT.getString("et42dvml"));
        ET42DLMV.setText("DL-MV: " + datoRT.getString("et42dlmv"));

        /*------------------diente 43------------------*/
        ET43MD.setText("MD: " + datoRT.getString("et43md"));
        ET43VL.setText("VL: " + datoRT.getString("et43vl"));
        ET43DVML.setText("DV-ML: " + datoRT.getString("et43dvml"));
        ET43DLMV.setText("DL-MV: " + datoRT.getString("et43dlmv"));

        /*------------------diente 44------------------*/
        ET44MD.setText("MD: " + datoRT.getString("et44md"));
        ET44VL.setText("VL: " + datoRT.getString("et44vl"));
        ET44DVML.setText("DV-ML: " + datoRT.getString("et44dvml"));
        ET44DLMV.setText("DL-MV: " + datoRT.getString("et44dlmv"));

        /*------------------diente 45------------------*/
        ET45MD.setText("MD: " + datoRT.getString("et45md"));
        ET45VL.setText("VL: " + datoRT.getString("et45vl"));
        ET45DVML.setText("DV-ML: " + datoRT.getString("et45dvml"));
        ET45DLMV.setText("DL-MV: " + datoRT.getString("et45dlmv"));

        /*------------------diente 26------------------*/
        ET46MD.setText("MD: " + datoRT.getString("et46md"));
        ET46VL.setText("VL: " + datoRT.getString("et46vl"));
        ET46DVML.setText("DV-ML: " + datoRT.getString("et46dvml"));
        ET46DLMV.setText("DL-MV: " + datoRT.getString("et46dlmv"));

        /*------------------diente 27------------------*/
        ET47MD.setText("MD: " + datoRT.getString("et47md"));
        ET47VL.setText("VL: " + datoRT.getString("et47vl"));
        ET47DVML.setText("DV-ML: " + datoRT.getString("et47dvml"));
        ET47DLMV.setText("DL-MV: " + datoRT.getString("et47dlmv"));


    }

    /*-------------------valores para la clase tablas de datos----------------------*/

    public void valores(){
        datoRT = this.getIntent().getExtras();

        /*-------dientes derechos superiores------*/
        TextView d11md = new TextView(this);
        TextView d11vl = new TextView(this);
        TextView d11dvml = new TextView(this);
        TextView d11dlmv = new TextView(this);

        TextView d12md = new TextView(this);
        TextView d12vl = new TextView(this);
        TextView d12dvml = new TextView(this);
        TextView d12dlmv = new TextView(this);

        TextView d13md = new TextView(this);
        TextView d13vl = new TextView(this);
        TextView d13dvml = new TextView(this);
        TextView d13dlmv = new TextView(this);

        TextView d14md = new TextView(this);
        TextView d14vl = new TextView(this);
        TextView d14dvml = new TextView(this);
        TextView d14dlmv = new TextView(this);

        TextView d15md = new TextView(this);
        TextView d15vl = new TextView(this);
        TextView d15dvml = new TextView(this);
        TextView d15dlmv = new TextView(this);

        TextView d16md = new TextView(this);
        TextView d16vl = new TextView(this);
        TextView d16dvml = new TextView(this);
        TextView d16dlmv = new TextView(this);

        TextView d17md = new TextView(this);
        TextView d17vl = new TextView(this);
        TextView d17dvml = new TextView(this);
        TextView d17dlmv = new TextView(this);

         /*-------dientes izquierda superiores------*/
        TextView d21md = new TextView(this);
        TextView d21vl = new TextView(this);
        TextView d21dvml = new TextView(this);
        TextView d21dlmv = new TextView(this);

        TextView d22md = new TextView(this);
        TextView d22vl = new TextView(this);
        TextView d22dvml = new TextView(this);
        TextView d22dlmv = new TextView(this);

        TextView d23md = new TextView(this);
        TextView d23vl = new TextView(this);
        TextView d23dvml = new TextView(this);
        TextView d23dlmv = new TextView(this);

        TextView d24md = new TextView(this);
        TextView d24vl = new TextView(this);
        TextView d24dvml = new TextView(this);
        TextView d24dlmv = new TextView(this);

        TextView d25md = new TextView(this);
        TextView d25vl = new TextView(this);
        TextView d25dvml = new TextView(this);
        TextView d25dlmv = new TextView(this);

        TextView d26md = new TextView(this);
        TextView d26vl = new TextView(this);
        TextView d26dvml = new TextView(this);
        TextView d26dlmv = new TextView(this);

        TextView d27md = new TextView(this);
        TextView d27vl = new TextView(this);
        TextView d27dvml = new TextView(this);
        TextView d27dlmv = new TextView(this);

        /*-------dientes izquierda inferiores------*/
        TextView d31md = new TextView(this);
        TextView d31vl = new TextView(this);
        TextView d31dvml = new TextView(this);
        TextView d31dlmv = new TextView(this);

        TextView d32md = new TextView(this);
        TextView d32vl = new TextView(this);
        TextView d32dvml = new TextView(this);
        TextView d32dlmv = new TextView(this);

        TextView d33md = new TextView(this);
        TextView d33vl = new TextView(this);
        TextView d33dvml = new TextView(this);
        TextView d33dlmv = new TextView(this);

        TextView d34md = new TextView(this);
        TextView d34vl = new TextView(this);
        TextView d34dvml = new TextView(this);
        TextView d34dlmv = new TextView(this);

        TextView d35md = new TextView(this);
        TextView d35vl = new TextView(this);
        TextView d35dvml = new TextView(this);
        TextView d35dlmv = new TextView(this);

        TextView d36md = new TextView(this);
        TextView d36vl = new TextView(this);
        TextView d36dvml = new TextView(this);
        TextView d36dlmv = new TextView(this);

        TextView d37md = new TextView(this);
        TextView d37vl = new TextView(this);
        TextView d37dvml = new TextView(this);
        TextView d37dlmv = new TextView(this);

        /*-------dientes derecha inferiores------*/
        TextView d41md = new TextView(this);
        TextView d41vl = new TextView(this);
        TextView d41dvml = new TextView(this);
        TextView d41dlmv = new TextView(this);

        TextView d42md = new TextView(this);
        TextView d42vl = new TextView(this);
        TextView d42dvml = new TextView(this);
        TextView d42dlmv = new TextView(this);

        TextView d43md = new TextView(this);
        TextView d43vl = new TextView(this);
        TextView d43dvml = new TextView(this);
        TextView d43dlmv = new TextView(this);

        TextView d44md = new TextView(this);
        TextView d44vl = new TextView(this);
        TextView d44dvml = new TextView(this);
        TextView d44dlmv = new TextView(this);

        TextView d45md = new TextView(this);
        TextView d45vl = new TextView(this);
        TextView d45dvml = new TextView(this);
        TextView d45dlmv = new TextView(this);

        TextView d46md = new TextView(this);
        TextView d46vl = new TextView(this);
        TextView d46dvml = new TextView(this);
        TextView d46dlmv = new TextView(this);

        TextView d47md = new TextView(this);
        TextView d47vl = new TextView(this);
        TextView d47dvml = new TextView(this);
        TextView d47dlmv = new TextView(this);

        /*---------dientes derechos superiores--------*/

        d11md.setText(datoRT.getString("et11md"));
        d11vl.setText(datoRT.getString("et11vl"));
        d11dvml.setText(datoRT.getString("et11dvml"));
        d11dlmv.setText(datoRT.getString("et11dlmv"));
        D11MD = Double.parseDouble(d11md.getText().toString());
        D11VL = Double.parseDouble(d11vl.getText().toString());
        D11DVML = Double.parseDouble(d11dvml.getText().toString());
        D11DLMV = Double.parseDouble(d11dlmv.getText().toString());

        d12md.setText(datoRT.getString("et12md"));
        d12vl.setText(datoRT.getString("et12vl"));
        d12dvml.setText(datoRT.getString("et12dvml"));
        d12dlmv.setText(datoRT.getString("et12dlmv"));
        D12MD = Double.parseDouble(d12md.getText().toString());
        D12VL = Double.parseDouble(d12vl.getText().toString());
        D12DVML = Double.parseDouble(d12dvml.getText().toString());
        D12DLMV = Double.parseDouble(d12dlmv.getText().toString());

        d13md.setText(datoRT.getString("et13md"));
        d13vl.setText(datoRT.getString("et13vl"));
        d13dvml.setText(datoRT.getString("et13dvml"));
        d13dlmv.setText(datoRT.getString("et13dlmv"));
        D13MD = Double.parseDouble(d13md.getText().toString());
        D13VL = Double.parseDouble(d13vl.getText().toString());
        D13DVML = Double.parseDouble(d13dvml.getText().toString());
        D13DLMV = Double.parseDouble(d13dlmv.getText().toString());

        d13md.setText(datoRT.getString("et13md"));
        d13vl.setText(datoRT.getString("et13vl"));
        d13dvml.setText(datoRT.getString("et13dvml"));
        d13dlmv.setText(datoRT.getString("et13dlmv"));
        D13MD = Double.parseDouble(d13md.getText().toString());
        D13VL = Double.parseDouble(d13vl.getText().toString());
        D13DVML = Double.parseDouble(d13dvml.getText().toString());
        D13DLMV = Double.parseDouble(d13dlmv.getText().toString());

        d14md.setText(datoRT.getString("et14md"));
        d14vl.setText(datoRT.getString("et14vl"));
        d14dvml.setText(datoRT.getString("et14dvml"));
        d14dlmv.setText(datoRT.getString("et14dlmv"));
        D14MD = Double.parseDouble(d14md.getText().toString());
        D14VL = Double.parseDouble(d14vl.getText().toString());
        D14DVML = Double.parseDouble(d14dvml.getText().toString());
        D14DLMV = Double.parseDouble(d14dlmv.getText().toString());

        d15md.setText(datoRT.getString("et15md"));
        d15vl.setText(datoRT.getString("et15vl"));
        d15dvml.setText(datoRT.getString("et15dvml"));
        d15dlmv.setText(datoRT.getString("et15dlmv"));
        D15MD = Double.parseDouble(d15md.getText().toString());
        D15VL = Double.parseDouble(d15vl.getText().toString());
        D15DVML = Double.parseDouble(d15dvml.getText().toString());
        D15DLMV = Double.parseDouble(d15dlmv.getText().toString());

        d16md.setText(datoRT.getString("et16md"));
        d16vl.setText(datoRT.getString("et16vl"));
        d16dvml.setText(datoRT.getString("et16dvml"));
        d16dlmv.setText(datoRT.getString("et16dlmv"));
        D16MD = Double.parseDouble(d16md.getText().toString());
        D16VL = Double.parseDouble(d16vl.getText().toString());
        D16DVML = Double.parseDouble(d16dvml.getText().toString());
        D16DLMV = Double.parseDouble(d16dlmv.getText().toString());

        d17md.setText(datoRT.getString("et17md"));
        d17vl.setText(datoRT.getString("et17vl"));
        d17dvml.setText(datoRT.getString("et17dvml"));
        d17dlmv.setText(datoRT.getString("et17dlmv"));
        D17MD = Double.parseDouble(d17md.getText().toString());
        D17VL = Double.parseDouble(d17vl.getText().toString());
        D17DVML = Double.parseDouble(d17dvml.getText().toString());
        D17DLMV = Double.parseDouble(d17dlmv.getText().toString());

        /*---------dientes izquierdos superiores--------*/

        d21md.setText(datoRT.getString("et21md"));
        d21vl.setText(datoRT.getString("et21vl"));
        d21dvml.setText(datoRT.getString("et21dvml"));
        d21dlmv.setText(datoRT.getString("et21dlmv"));
        D21MD = Double.parseDouble(d21md.getText().toString());
        D21VL = Double.parseDouble(d21vl.getText().toString());
        D21DVML = Double.parseDouble(d21dvml.getText().toString());
        D21DLMV = Double.parseDouble(d21dlmv.getText().toString());

        d22md.setText(datoRT.getString("et22md"));
        d22vl.setText(datoRT.getString("et22vl"));
        d22dvml.setText(datoRT.getString("et22dvml"));
        d22dlmv.setText(datoRT.getString("et22dlmv"));
        D22MD = Double.parseDouble(d22md.getText().toString());
        D22VL = Double.parseDouble(d22vl.getText().toString());
        D22DVML = Double.parseDouble(d22dvml.getText().toString());
        D22DLMV = Double.parseDouble(d22dlmv.getText().toString());

        d23md.setText(datoRT.getString("et23md"));
        d23vl.setText(datoRT.getString("et23vl"));
        d23dvml.setText(datoRT.getString("et23dvml"));
        d23dlmv.setText(datoRT.getString("et23dlmv"));
        D23MD = Double.parseDouble(d23md.getText().toString());
        D23VL = Double.parseDouble(d23vl.getText().toString());
        D23DVML = Double.parseDouble(d23dvml.getText().toString());
        D23DLMV = Double.parseDouble(d23dlmv.getText().toString());

        d24md.setText(datoRT.getString("et24md"));
        d24vl.setText(datoRT.getString("et24vl"));
        d24dvml.setText(datoRT.getString("et24dvml"));
        d24dlmv.setText(datoRT.getString("et24dlmv"));
        D24MD = Double.parseDouble(d24md.getText().toString());
        D24VL = Double.parseDouble(d24vl.getText().toString());
        D24DVML = Double.parseDouble(d24dvml.getText().toString());
        D24DLMV = Double.parseDouble(d24dlmv.getText().toString());

        d25md.setText(datoRT.getString("et25md"));
        d25vl.setText(datoRT.getString("et25vl"));
        d25dvml.setText(datoRT.getString("et25dvml"));
        d25dlmv.setText(datoRT.getString("et25dlmv"));
        D25MD = Double.parseDouble(d25md.getText().toString());
        D25VL = Double.parseDouble(d25vl.getText().toString());
        D25DVML = Double.parseDouble(d25dvml.getText().toString());
        D25DLMV = Double.parseDouble(d25dlmv.getText().toString());

        d26md.setText(datoRT.getString("et26md"));
        d26vl.setText(datoRT.getString("et26vl"));
        d26dvml.setText(datoRT.getString("et26dvml"));
        d26dlmv.setText(datoRT.getString("et26dlmv"));
        D26MD = Double.parseDouble(d26md.getText().toString());
        D26VL = Double.parseDouble(d26vl.getText().toString());
        D26DVML = Double.parseDouble(d26dvml.getText().toString());
        D26DLMV = Double.parseDouble(d26dlmv.getText().toString());

        d27md.setText(datoRT.getString("et27md"));
        d27vl.setText(datoRT.getString("et27vl"));
        d27dvml.setText(datoRT.getString("et27dvml"));
        d27dlmv.setText(datoRT.getString("et27dlmv"));
        D27MD = Double.parseDouble(d27md.getText().toString());
        D27VL = Double.parseDouble(d27vl.getText().toString());
        D27DVML = Double.parseDouble(d27dvml.getText().toString());
        D27DLMV = Double.parseDouble(d27dlmv.getText().toString());

        /*---------dientes izquierdos inferiores--------*/

        d31md.setText(datoRT.getString("et31md"));
        d31vl.setText(datoRT.getString("et31vl"));
        d31dvml.setText(datoRT.getString("et31dvml"));
        d31dlmv.setText(datoRT.getString("et31dlmv"));
        D31MD = Double.parseDouble(d31md.getText().toString());
        D31VL = Double.parseDouble(d31vl.getText().toString());
        D31DVML = Double.parseDouble(d31dvml.getText().toString());
        D31DLMV = Double.parseDouble(d31dlmv.getText().toString());

        d32md.setText(datoRT.getString("et32md"));
        d32vl.setText(datoRT.getString("et32vl"));
        d32dvml.setText(datoRT.getString("et32dvml"));
        d32dlmv.setText(datoRT.getString("et32dlmv"));
        D32MD = Double.parseDouble(d32md.getText().toString());
        D32VL = Double.parseDouble(d32vl.getText().toString());
        D32DVML = Double.parseDouble(d32dvml.getText().toString());
        D32DLMV = Double.parseDouble(d32dlmv.getText().toString());

        d33md.setText(datoRT.getString("et33md"));
        d33vl.setText(datoRT.getString("et33vl"));
        d33dvml.setText(datoRT.getString("et33dvml"));
        d33dlmv.setText(datoRT.getString("et33dlmv"));
        D33MD = Double.parseDouble(d33md.getText().toString());
        D33VL = Double.parseDouble(d33vl.getText().toString());
        D33DVML = Double.parseDouble(d33dvml.getText().toString());
        D33DLMV = Double.parseDouble(d33dlmv.getText().toString());

        d34md.setText(datoRT.getString("et34md"));
        d34vl.setText(datoRT.getString("et34vl"));
        d34dvml.setText(datoRT.getString("et34dvml"));
        d34dlmv.setText(datoRT.getString("et34dlmv"));
        D34MD = Double.parseDouble(d34md.getText().toString());
        D34VL = Double.parseDouble(d34vl.getText().toString());
        D34DVML = Double.parseDouble(d34dvml.getText().toString());
        D34DLMV = Double.parseDouble(d34dlmv.getText().toString());

        d35md.setText(datoRT.getString("et35md"));
        d35vl.setText(datoRT.getString("et35vl"));
        d35dvml.setText(datoRT.getString("et35dvml"));
        d35dlmv.setText(datoRT.getString("et35dlmv"));
        D35MD = Double.parseDouble(d35md.getText().toString());
        D35VL = Double.parseDouble(d35vl.getText().toString());
        D35DVML = Double.parseDouble(d35dvml.getText().toString());
        D35DLMV = Double.parseDouble(d35dlmv.getText().toString());

        d36md.setText(datoRT.getString("et36md"));
        d36vl.setText(datoRT.getString("et36vl"));
        d36dvml.setText(datoRT.getString("et36dvml"));
        d36dlmv.setText(datoRT.getString("et36dlmv"));
        D36MD = Double.parseDouble(d36md.getText().toString());
        D36VL = Double.parseDouble(d36vl.getText().toString());
        D36DVML = Double.parseDouble(d36dvml.getText().toString());
        D36DLMV = Double.parseDouble(d36dlmv.getText().toString());

        d37md.setText(datoRT.getString("et37md"));
        d37vl.setText(datoRT.getString("et37vl"));
        d37dvml.setText(datoRT.getString("et37dvml"));
        d37dlmv.setText(datoRT.getString("et37dlmv"));
        D37MD = Double.parseDouble(d37md.getText().toString());
        D37VL = Double.parseDouble(d37vl.getText().toString());
        D37DVML = Double.parseDouble(d37dvml.getText().toString());
        D37DLMV = Double.parseDouble(d37dlmv.getText().toString());

         /*---------dientes derechos inferiores--------*/

        d41md.setText(datoRT.getString("et41md"));
        d41vl.setText(datoRT.getString("et41vl"));
        d41dvml.setText(datoRT.getString("et41dvml"));
        d41dlmv.setText(datoRT.getString("et41dlmv"));
        D41MD = Double.parseDouble(d41md.getText().toString());
        D41VL = Double.parseDouble(d41vl.getText().toString());
        D41DVML = Double.parseDouble(d41dvml.getText().toString());
        D41DLMV = Double.parseDouble(d41dlmv.getText().toString());

        d42md.setText(datoRT.getString("et42md"));
        d42vl.setText(datoRT.getString("et42vl"));
        d42dvml.setText(datoRT.getString("et42dvml"));
        d42dlmv.setText(datoRT.getString("et42dlmv"));
        D42MD = Double.parseDouble(d42md.getText().toString());
        D42VL = Double.parseDouble(d42vl.getText().toString());
        D42DVML = Double.parseDouble(d42dvml.getText().toString());
        D42DLMV = Double.parseDouble(d42dlmv.getText().toString());

        d43md.setText(datoRT.getString("et43md"));
        d43vl.setText(datoRT.getString("et43vl"));
        d43dvml.setText(datoRT.getString("et43dvml"));
        d43dlmv.setText(datoRT.getString("et43dlmv"));
        D43MD = Double.parseDouble(d43md.getText().toString());
        D43VL = Double.parseDouble(d43vl.getText().toString());
        D43DVML = Double.parseDouble(d43dvml.getText().toString());
        D43DLMV = Double.parseDouble(d43dlmv.getText().toString());

        d44md.setText(datoRT.getString("et44md"));
        d44vl.setText(datoRT.getString("et44vl"));
        d44dvml.setText(datoRT.getString("et44dvml"));
        d44dlmv.setText(datoRT.getString("et44dlmv"));
        D44MD = Double.parseDouble(d44md.getText().toString());
        D44VL = Double.parseDouble(d44vl.getText().toString());
        D44DVML = Double.parseDouble(d44dvml.getText().toString());
        D44DLMV = Double.parseDouble(d44dlmv.getText().toString());

        d45md.setText(datoRT.getString("et45md"));
        d45vl.setText(datoRT.getString("et45vl"));
        d45dvml.setText(datoRT.getString("et45dvml"));
        d45dlmv.setText(datoRT.getString("et45dlmv"));
        D45MD = Double.parseDouble(d45md.getText().toString());
        D45VL = Double.parseDouble(d45vl.getText().toString());
        D45DVML = Double.parseDouble(d45dvml.getText().toString());
        D45DLMV = Double.parseDouble(d45dlmv.getText().toString());

        d46md.setText(datoRT.getString("et46md"));
        d46vl.setText(datoRT.getString("et46vl"));
        d46dvml.setText(datoRT.getString("et46dvml"));
        d46dlmv.setText(datoRT.getString("et46dlmv"));
        D46MD = Double.parseDouble(d46md.getText().toString());
        D46VL = Double.parseDouble(d46vl.getText().toString());
        D46DVML = Double.parseDouble(d46dvml.getText().toString());
        D46DLMV = Double.parseDouble(d46dlmv.getText().toString());

        d47md.setText(datoRT.getString("et47md"));
        d47vl.setText(datoRT.getString("et47vl"));
        d47dvml.setText(datoRT.getString("et47dvml"));
        d47dlmv.setText(datoRT.getString("et47dlmv"));
        D47MD = Double.parseDouble(d47md.getText().toString());
        D47VL = Double.parseDouble(d47vl.getText().toString());
        D47DVML = Double.parseDouble(d47dvml.getText().toString());
        D47DLMV = Double.parseDouble(d47dlmv.getText().toString());

    }

    /*----------------------------------------------------------------------*/

    }
