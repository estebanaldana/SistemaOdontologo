package com.example.dante_000.sistemadientes;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.DecimalFormat;

//import xyz.hanks.library.SmallBang;
//import xyz.hanks.library.SmallBangListener;

public class DatosOdontograma extends AppCompatActivity {

    LinearLayout d11, d12, d13, d14, d15, d16, d17;
    LinearLayout d21, d22, d23, d24, d25, d26, d27;
    LinearLayout d31, d32, d33, d34, d35, d36, d37;
    LinearLayout d41, d42, d43, d44, d45, d46, d47;

    TextView i11, i12, i13, i14, i15, i16, i17;
    TextView i21, i22, i23, i24, i25, i26, i27;
    TextView i31, i32, i33, i34, i35, i36, i37;
    TextView i41, i42, i43, i44, i45, i46, i47;

    /*----------------Cajas de texto Derecha superior-------------------*/

    EditText ET11MD,ET11VL,ET11DVML,ET11DLMV;
    EditText ET12MD,ET12VL,ET12DVML,ET12DLMV;
    EditText ET13MD,ET13VL,ET13DVML,ET13DLMV;
    EditText ET14MD,ET14VL,ET14DVML,ET14DLMV;
    EditText ET15MD,ET15VL,ET15DVML,ET15DLMV;
    EditText ET16MD,ET16VL,ET16DVML,ET16DLMV;
    EditText ET17MD,ET17VL,ET17DVML,ET17DLMV;

     /*----------------Cajas de texto Izquierda superior-------------------*/

    EditText ET21MD,ET21VL,ET21DVML,ET21DLMV;
    EditText ET22MD,ET22VL,ET22DVML,ET22DLMV;
    EditText ET23MD,ET23VL,ET23DVML,ET23DLMV;
    EditText ET24MD,ET24VL,ET24DVML,ET24DLMV;
    EditText ET25MD,ET25VL,ET25DVML,ET25DLMV;
    EditText ET26MD,ET26VL,ET26DVML,ET26DLMV;
    EditText ET27MD,ET27VL,ET27DVML,ET27DLMV;

     /*----------------Cajas de texto Izquierda inferior-------------------*/

    EditText ET31MD,ET31VL,ET31DVML,ET31DLMV;
    EditText ET32MD,ET32VL,ET32DVML,ET32DLMV;
    EditText ET33MD,ET33VL,ET33DVML,ET33DLMV;
    EditText ET34MD,ET34VL,ET34DVML,ET34DLMV;
    EditText ET35MD,ET35VL,ET35DVML,ET35DLMV;
    EditText ET36MD,ET36VL,ET36DVML,ET36DLMV;
    EditText ET37MD,ET37VL,ET37DVML,ET37DLMV;

     /*----------------Cajas de texto Derercha inferior-------------------*/

    EditText ET41MD,ET41VL,ET41DVML,ET41DLMV;
    EditText ET42MD,ET42VL,ET42DVML,ET42DLMV;
    EditText ET43MD,ET43VL,ET43DVML,ET43DLMV;
    EditText ET44MD,ET44VL,ET44DVML,ET44DLMV;
    EditText ET45MD,ET45VL,ET45DVML,ET45DLMV;
    EditText ET46MD,ET46VL,ET46DVML,ET46DLMV;
    EditText ET47MD,ET47VL,ET47DVML,ET47DLMV;


    int ed11, ed12, ed13, ed14, ed15, ed16, ed17;
    int ed21, ed22, ed23, ed24, ed25, ed26, ed27;
    int ed31, ed32, ed33, ed34, ed35, ed36, ed37;
    int ed41, ed42, ed43, ed44, ed45, ed46, ed47;


    DecimalFormat decimales = new DecimalFormat("0.00");
    //private SmallBang mSmallBang;


    private String Mensaje;
    private String Titulo;
    private String Aceptar;

    FloatingActionButton menu, info, portal;
    Animation Fopen, FCloc, FRot, FRotan;
    boolean open = false;
    Bundle dato = new Bundle();
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_odontograma);

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


        /*----------------------------------EditText------------------------------*/

        EditTextDS();
        EditTextIS();
        EditTextII();
        EditTextDI();



        try {
            Bundle datoR = this.getIntent().getExtras();

            TextView res = new TextView(DatosOdontograma.this);
            TextView D11 = new TextView(DatosOdontograma.this);
            TextView D12 = new TextView(DatosOdontograma.this);
            TextView D13 = new TextView(DatosOdontograma.this);
            TextView D14 = new TextView(DatosOdontograma.this);
            TextView D15 = new TextView(DatosOdontograma.this);
            TextView D16 = new TextView(DatosOdontograma.this);
            TextView D17 = new TextView(DatosOdontograma.this);
            /*---------------------------------------------*/
            TextView D21 = new TextView(DatosOdontograma.this);
            TextView D22 = new TextView(DatosOdontograma.this);
            TextView D23 = new TextView(DatosOdontograma.this);
            TextView D24 = new TextView(DatosOdontograma.this);
            TextView D25 = new TextView(DatosOdontograma.this);
            TextView D26 = new TextView(DatosOdontograma.this);
            TextView D27 = new TextView(DatosOdontograma.this);
            /*---------------------------------------------*/
            TextView D31 = new TextView(DatosOdontograma.this);
            TextView D32 = new TextView(DatosOdontograma.this);
            TextView D33 = new TextView(DatosOdontograma.this);
            TextView D34 = new TextView(DatosOdontograma.this);
            TextView D35 = new TextView(DatosOdontograma.this);
            TextView D36 = new TextView(DatosOdontograma.this);
            TextView D37 = new TextView(DatosOdontograma.this);
            /*---------------------------------------------*/
            TextView D41 = new TextView(DatosOdontograma.this);
            TextView D42 = new TextView(DatosOdontograma.this);
            TextView D43 = new TextView(DatosOdontograma.this);
            TextView D44 = new TextView(DatosOdontograma.this);
            TextView D45 = new TextView(DatosOdontograma.this);
            TextView D46 = new TextView(DatosOdontograma.this);
            TextView D47 = new TextView(DatosOdontograma.this);




            res.setText("" + datoR.getString("edadR"));
            dato.putString("edadR", res.getText().toString());



            D11.setText("" + datoR.getString("d11"));
            ed11 = Integer.parseInt(D11.getText().toString());
            D12.setText("" + datoR.getString("d12"));
            ed12 = Integer.parseInt(D12.getText().toString());
            D13.setText("" + datoR.getString("d13"));
            ed13 = Integer.parseInt(D13.getText().toString());
            D14.setText("" + datoR.getString("d14"));
            ed14 = Integer.parseInt(D14.getText().toString());
            D15.setText("" + datoR.getString("d15"));
            ed15 = Integer.parseInt(D15.getText().toString());
            D16.setText("" + datoR.getString("d16"));
            ed16 = Integer.parseInt(D16.getText().toString());
            D17.setText("" + datoR.getString("d17"));
            ed17 = Integer.parseInt(D17.getText().toString());
            /*-------------------------------------------------------*/
            D21.setText("" + datoR.getString("d21"));
            ed21 = Integer.parseInt(D21.getText().toString());
            D22.setText("" + datoR.getString("d22"));
            ed22 = Integer.parseInt(D22.getText().toString());
            D23.setText("" + datoR.getString("d23"));
            ed23 = Integer.parseInt(D23.getText().toString());
            D24.setText("" + datoR.getString("d24"));
            ed24 = Integer.parseInt(D24.getText().toString());
            D25.setText("" + datoR.getString("d25"));
            ed25 = Integer.parseInt(D25.getText().toString());
            D26.setText("" + datoR.getString("d26"));
            ed26 = Integer.parseInt(D26.getText().toString());
            D27.setText("" + datoR.getString("d27"));
            ed27 = Integer.parseInt(D27.getText().toString());
            /*-------------------------------------------------------*/
            D31.setText("" + datoR.getString("d31"));
            ed31 = Integer.parseInt(D31.getText().toString());
            D32.setText("" + datoR.getString("d32"));
            ed32 = Integer.parseInt(D32.getText().toString());
            D33.setText("" + datoR.getString("d33"));
            ed33 = Integer.parseInt(D33.getText().toString());
            D34.setText("" + datoR.getString("d34"));
            ed34 = Integer.parseInt(D34.getText().toString());
            D35.setText("" + datoR.getString("d35"));
            ed35 = Integer.parseInt(D35.getText().toString());
            D36.setText("" + datoR.getString("d36"));
            ed36 = Integer.parseInt(D36.getText().toString());
            D37.setText("" + datoR.getString("d37"));
            ed37 = Integer.parseInt(D37.getText().toString());
            /*-------------------------------------------------------*/
            D41.setText("" + datoR.getString("d41"));
            ed41 = Integer.parseInt(D41.getText().toString());
            D42.setText("" + datoR.getString("d42"));
            ed42 = Integer.parseInt(D42.getText().toString());
            D43.setText("" + datoR.getString("d43"));
            ed43 = Integer.parseInt(D43.getText().toString());
            D44.setText("" + datoR.getString("d44"));
            ed44 = Integer.parseInt(D44.getText().toString());
            D45.setText("" + datoR.getString("d45"));
            ed45 = Integer.parseInt(D45.getText().toString());
            D46.setText("" + datoR.getString("d46"));
            ed46 = Integer.parseInt(D46.getText().toString());
            D47.setText("" + datoR.getString("d47"));
            ed47 = Integer.parseInt(D47.getText().toString());


            dientesDS();
            dientesIS();
            dientesDI();
            dientesII();


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

    /*--------------------------------clases EditText------------------------*/

    public void EditTextDS (){
        ET11MD = (EditText) findViewById(R.id.d11md);
        ET11VL = (EditText) findViewById(R.id.d11vl);
        ET11DVML = (EditText) findViewById(R.id.d11dvml);
        ET11DLMV = (EditText) findViewById(R.id.d11dlmv);
        /*-----------------------------------------------*/
        ET12MD = (EditText) findViewById(R.id.d12md);
        ET12VL = (EditText) findViewById(R.id.d12vl);
        ET12DVML = (EditText) findViewById(R.id.d12dvml);
        ET12DLMV = (EditText) findViewById(R.id.d12dlmv);
        /*-----------------------------------------------*/
        ET13MD = (EditText) findViewById(R.id.d13md);
        ET13VL = (EditText) findViewById(R.id.d13vl);
        ET13DVML = (EditText) findViewById(R.id.d13dvml);
        ET13DLMV = (EditText) findViewById(R.id.d13dlmv);
        /*-----------------------------------------------*/
        ET14MD = (EditText) findViewById(R.id.d14md);
        ET14VL = (EditText) findViewById(R.id.d14vl);
        ET14DVML = (EditText) findViewById(R.id.d14dvml);
        ET14DLMV = (EditText) findViewById(R.id.d14dlmv);
        /*-----------------------------------------------*/
        ET15MD = (EditText) findViewById(R.id.d15md);
        ET15VL = (EditText) findViewById(R.id.d15vl);
        ET15DVML = (EditText) findViewById(R.id.d15dvml);
        ET15DLMV = (EditText) findViewById(R.id.d15dlmv);
        /*-----------------------------------------------*/
        ET16MD = (EditText) findViewById(R.id.d16md);
        ET16VL = (EditText) findViewById(R.id.d16vl);
        ET16DVML = (EditText) findViewById(R.id.d16dvml);
        ET16DLMV = (EditText) findViewById(R.id.d16dlmv);
        /*-----------------------------------------------*/
        ET17MD = (EditText) findViewById(R.id.d17md);
        ET17VL = (EditText) findViewById(R.id.d17vl);
        ET17DVML = (EditText) findViewById(R.id.d17dvml);
        ET17DLMV = (EditText) findViewById(R.id.d17dlmv);
    }

    public void EditTextIS (){
        ET21MD = (EditText) findViewById(R.id.d21md);
        ET21VL = (EditText) findViewById(R.id.d21vl);
        ET21DVML = (EditText) findViewById(R.id.d21dvml);
        ET21DLMV = (EditText) findViewById(R.id.d21dlmv);
        /*-----------------------------------------------*/
        ET22MD = (EditText) findViewById(R.id.d22md);
        ET22VL = (EditText) findViewById(R.id.d22vl);
        ET22DVML = (EditText) findViewById(R.id.d22dvml);
        ET22DLMV = (EditText) findViewById(R.id.d22dlmv);
        /*-----------------------------------------------*/
        ET23MD = (EditText) findViewById(R.id.d23md);
        ET23VL = (EditText) findViewById(R.id.d23vl);
        ET23DVML = (EditText) findViewById(R.id.d23dvml);
        ET23DLMV = (EditText) findViewById(R.id.d23dlmv);
        /*-----------------------------------------------*/
        ET24MD = (EditText) findViewById(R.id.d24md);
        ET24VL = (EditText) findViewById(R.id.d24vl);
        ET24DVML = (EditText) findViewById(R.id.d24dvml);
        ET24DLMV = (EditText) findViewById(R.id.d24dlmv);
        /*-----------------------------------------------*/
        ET25MD = (EditText) findViewById(R.id.d25md);
        ET25VL = (EditText) findViewById(R.id.d25vl);
        ET25DVML = (EditText) findViewById(R.id.d25dvml);
        ET25DLMV = (EditText) findViewById(R.id.d25dlmv);
        /*-----------------------------------------------*/
        ET26MD = (EditText) findViewById(R.id.d26md);
        ET26VL = (EditText) findViewById(R.id.d26vl);
        ET26DVML = (EditText) findViewById(R.id.d26dvml);
        ET26DLMV = (EditText) findViewById(R.id.d26dlmv);
        /*-----------------------------------------------*/
        ET27MD = (EditText) findViewById(R.id.d27md);
        ET27VL = (EditText) findViewById(R.id.d27vl);
        ET27DVML = (EditText) findViewById(R.id.d27dvml);
        ET27DLMV = (EditText) findViewById(R.id.d27dlmv);
    }

    public void EditTextII (){
        ET31MD = (EditText) findViewById(R.id.d31md);
        ET31VL = (EditText) findViewById(R.id.d31vl);
        ET31DVML = (EditText) findViewById(R.id.d31dvml);
        ET31DLMV = (EditText) findViewById(R.id.d31dlmv);
        /*-----------------------------------------------*/
        ET32MD = (EditText) findViewById(R.id.d32md);
        ET32VL = (EditText) findViewById(R.id.d32vl);
        ET32DVML = (EditText) findViewById(R.id.d32dvml);
        ET32DLMV = (EditText) findViewById(R.id.d32dlmv);
        /*-----------------------------------------------*/
        ET33MD = (EditText) findViewById(R.id.d33md);
        ET33VL = (EditText) findViewById(R.id.d33vl);
        ET33DVML = (EditText) findViewById(R.id.d33dvml);
        ET33DLMV = (EditText) findViewById(R.id.d33dlmv);
        /*-----------------------------------------------*/
        ET34MD = (EditText) findViewById(R.id.d34md);
        ET34VL = (EditText) findViewById(R.id.d34vl);
        ET34DVML = (EditText) findViewById(R.id.d34dvml);
        ET34DLMV = (EditText) findViewById(R.id.d34dlmv);
        /*-----------------------------------------------*/
        ET35MD = (EditText) findViewById(R.id.d35md);
        ET35VL = (EditText) findViewById(R.id.d35vl);
        ET35DVML = (EditText) findViewById(R.id.d35dvml);
        ET35DLMV = (EditText) findViewById(R.id.d35dlmv);
        /*----------------------------------------------*/
        ET36MD = (EditText) findViewById(R.id.d36md);
        ET36VL = (EditText) findViewById(R.id.d36vl);
        ET36DVML = (EditText) findViewById(R.id.d36dvml);
        ET36DLMV = (EditText) findViewById(R.id.d36dlmv);
        /*-----------------------------------------------*/
        ET37MD = (EditText) findViewById(R.id.d37md);
        ET37VL = (EditText) findViewById(R.id.d37vl);
        ET37DVML = (EditText) findViewById(R.id.d37dvml);
        ET37DLMV = (EditText) findViewById(R.id.d37dlmv);
    }

    public void EditTextDI (){
        ET41MD = (EditText) findViewById(R.id.d41md);
        ET41VL = (EditText) findViewById(R.id.d41vl);
        ET41DVML = (EditText) findViewById(R.id.d41dvml);
        ET41DLMV = (EditText) findViewById(R.id.d41dlmv);
        /*-----------------------------------------------*/
        ET42MD = (EditText) findViewById(R.id.d42md);
        ET42VL = (EditText) findViewById(R.id.d42vl);
        ET42DVML = (EditText) findViewById(R.id.d42dvml);
        ET42DLMV = (EditText) findViewById(R.id.d42dlmv);
        /*-----------------------------------------------*/
        ET43MD = (EditText) findViewById(R.id.d43md);
        ET43VL = (EditText) findViewById(R.id.d43vl);
        ET43DVML = (EditText) findViewById(R.id.d43dvml);
        ET43DLMV = (EditText) findViewById(R.id.d43dlmv);
        /*-----------------------------------------------*/
        ET44MD = (EditText) findViewById(R.id.d44md);
        ET44VL = (EditText) findViewById(R.id.d44vl);
        ET44DVML = (EditText) findViewById(R.id.d44dvml);
        ET44DLMV = (EditText) findViewById(R.id.d44dlmv);
        /*-----------------------------------------------*/
        ET45MD = (EditText) findViewById(R.id.d45md);
        ET45VL = (EditText) findViewById(R.id.d45vl);
        ET45DVML = (EditText) findViewById(R.id.d45dvml);
        ET45DLMV = (EditText) findViewById(R.id.d45dlmv);
        /*----------------------------------------------*/
        ET46MD = (EditText) findViewById(R.id.d46md);
        ET46VL = (EditText) findViewById(R.id.d46vl);
        ET46DVML = (EditText) findViewById(R.id.d46dvml);
        ET46DLMV = (EditText) findViewById(R.id.d46dlmv);
        /*-----------------------------------------------*/
        ET47MD = (EditText) findViewById(R.id.d47md);
        ET47VL = (EditText) findViewById(R.id.d47vl);
        ET47DVML = (EditText) findViewById(R.id.d47dvml);
        ET47DLMV = (EditText) findViewById(R.id.d47dlmv);
    }


    /*-----------------------------Procesos de Entradas de Datos-----------------------------*/

    public void procesoDS(){

        i11 = new TextView(this);
        i12 = new TextView(this);
        i13 = new TextView(this);
        i14 = new TextView(this);
        i15 = new TextView(this);
        i16 = new TextView(this);
        i17 = new TextView(this);

        if(d11.getVisibility() == View.VISIBLE){
            i11.setText("1");
            dato.putString("f11", i11.getText().toString());
            dato.putString("et11md", ET11MD.getText().toString());
            dato.putString("et11vl", ET11VL.getText().toString());
            dato.putString("et11dvml", ET11DVML.getText().toString());
            dato.putString("et11dlmv", ET11DLMV.getText().toString());
        }
        else{
            ET11MD.setText("0");
            ET11VL.setText("0");
            ET11DVML.setText("0");
            ET11DLMV.setText("0");
            i11.setText("0");
            dato.putString("f11", i11.getText().toString());
            dato.putString("et11md", ET11MD.getText().toString());
            dato.putString("et11vl", ET11VL.getText().toString());
            dato.putString("et11dvml", ET11DVML.getText().toString());
            dato.putString("et11dlmv", ET11DLMV.getText().toString());
        }

        if(d12.getVisibility() == View.VISIBLE){
            i12.setText("1");
            dato.putString("f12", i12.getText().toString());
            dato.putString("et12md", ET12MD.getText().toString());
            dato.putString("et12vl", ET12VL.getText().toString());
            dato.putString("et12dvml", ET12DVML.getText().toString());
            dato.putString("et12dlmv", ET12DLMV.getText().toString());
        }
        else{
            ET12MD.setText("0");
            ET12VL.setText("0");
            ET12DVML.setText("0");
            ET12DLMV.setText("0");
            i12.setText("0");
            dato.putString("f12", i12.getText().toString());
            dato.putString("et12md", ET12MD.getText().toString());
            dato.putString("et12vl", ET12VL.getText().toString());
            dato.putString("et12dvml", ET12DVML.getText().toString());
            dato.putString("et12dlmv", ET12DLMV.getText().toString());
        }

        if(d13.getVisibility() == View.VISIBLE){
            i13.setText("1");
            dato.putString("f13", i13.getText().toString());
            dato.putString("et13md", ET13MD.getText().toString());
            dato.putString("et13vl", ET13VL.getText().toString());
            dato.putString("et13dvml", ET13DVML.getText().toString());
            dato.putString("et13dlmv", ET13DLMV.getText().toString());
        }
        else{
            ET13MD.setText("0");
            ET13VL.setText("0");
            ET13DVML.setText("0");
            ET13DLMV.setText("0");
            i13.setText("0");
            dato.putString("f13", i13.getText().toString());
            dato.putString("et13md", ET13MD.getText().toString());
            dato.putString("et13vl", ET13VL.getText().toString());
            dato.putString("et13dvml", ET13DVML.getText().toString());
            dato.putString("et13dlmv", ET13DLMV.getText().toString());
        }

        if(d14.getVisibility() == View.VISIBLE){
            i14.setText("1");
            dato.putString("f14", i14.getText().toString());
            dato.putString("et14md", ET14MD.getText().toString());
            dato.putString("et14vl", ET14VL.getText().toString());
            dato.putString("et14dvml", ET14DVML.getText().toString());
            dato.putString("et14dlmv", ET14DLMV.getText().toString());
        }
        else{
            ET14MD.setText("0");
            ET14VL.setText("0");
            ET14DVML.setText("0");
            ET14DLMV.setText("0");
            i14.setText("0");
            dato.putString("f14", i14.getText().toString());
            dato.putString("et14md", ET14MD.getText().toString());
            dato.putString("et14vl", ET14VL.getText().toString());
            dato.putString("et14dvml", ET14DVML.getText().toString());
            dato.putString("et14dlmv", ET14DLMV.getText().toString());
        }

        if(d15.getVisibility() == View.VISIBLE){
            i15.setText("1");
            dato.putString("f15", i15.getText().toString());
            dato.putString("et15md", ET15MD.getText().toString());
            dato.putString("et15vl", ET15VL.getText().toString());
            dato.putString("et15dvml", ET15DVML.getText().toString());
            dato.putString("et15dlmv", ET15DLMV.getText().toString());
        }
        else{
            ET15MD.setText("0");
            ET15VL.setText("0");
            ET15DVML.setText("0");
            ET15DLMV.setText("0");
            i15.setText("0");
            dato.putString("f15", i15.getText().toString());
            dato.putString("et15md", ET15MD.getText().toString());
            dato.putString("et15vl", ET15VL.getText().toString());
            dato.putString("et15dvml", ET15DVML.getText().toString());
            dato.putString("et15dlmv", ET15DLMV.getText().toString());
        }

        if(d16.getVisibility() == View.VISIBLE){
            i16.setText("1");
            dato.putString("f16", i16.getText().toString());
            dato.putString("et16md", ET16MD.getText().toString());
            dato.putString("et16vl", ET16VL.getText().toString());
            dato.putString("et16dvml", ET16DVML.getText().toString());
            dato.putString("et16dlmv", ET16DLMV.getText().toString());
        }
        else{
            ET16MD.setText("0");
            ET16VL.setText("0");
            ET16DVML.setText("0");
            ET16DLMV.setText("0");
            i16.setText("0");
            dato.putString("f16", i16.getText().toString());
            dato.putString("et16md", ET16MD.getText().toString());
            dato.putString("et16vl", ET16VL.getText().toString());
            dato.putString("et16dvml", ET16DVML.getText().toString());
            dato.putString("et16dlmv", ET16DLMV.getText().toString());
        }

        if(d17.getVisibility() == View.VISIBLE){
            i17.setText("1");
            dato.putString("f17", i17.getText().toString());
            dato.putString("et17md", ET17MD.getText().toString());
            dato.putString("et17vl", ET17VL.getText().toString());
            dato.putString("et17dvml", ET17DVML.getText().toString());
            dato.putString("et17dlmv", ET17DLMV.getText().toString());
        }
        else{
            ET17MD.setText("0");
            ET17VL.setText("0");
            ET17DVML.setText("0");
            ET17DLMV.setText("0");
            i17.setText("0");
            dato.putString("f17", i17.getText().toString());
            dato.putString("et17md", ET17MD.getText().toString());
            dato.putString("et17vl", ET17VL.getText().toString());
            dato.putString("et17dvml", ET17DVML.getText().toString());
            dato.putString("et17dlmv", ET17DLMV.getText().toString());
        }
    }

    public void procesoIS(){

        i21 = new TextView(this);
        i22 = new TextView(this);
        i23 = new TextView(this);
        i24 = new TextView(this);
        i25 = new TextView(this);
        i26 = new TextView(this);
        i27 = new TextView(this);


        if(d21.getVisibility() == View.VISIBLE){
            i21.setText("1");
            dato.putString("f21", i21.getText().toString());
            dato.putString("et21md", ET21MD.getText().toString());
            dato.putString("et21vl", ET21VL.getText().toString());
            dato.putString("et21dvml", ET21DVML.getText().toString());
            dato.putString("et21dlmv", ET21DLMV.getText().toString());
        }
        else{
            ET21MD.setText("0");
            ET21VL.setText("0");
            ET21DVML.setText("0");
            ET21DLMV.setText("0");
            i21.setText("0");
            dato.putString("f21", i21.getText().toString());
            dato.putString("et21md", ET21MD.getText().toString());
            dato.putString("et21vl", ET21VL.getText().toString());
            dato.putString("et21dvml", ET21DVML.getText().toString());
            dato.putString("et21dlmv", ET21DLMV.getText().toString());
        }

        if(d22.getVisibility() == View.VISIBLE){
            i22.setText("1");
            dato.putString("f22", i22.getText().toString());
            dato.putString("et22md", ET22MD.getText().toString());
            dato.putString("et22vl", ET22VL.getText().toString());
            dato.putString("et22dvml", ET22DVML.getText().toString());
            dato.putString("et22dlmv", ET22DLMV.getText().toString());
        }
        else{
            ET22MD.setText("0");
            ET22VL.setText("0");
            ET22DVML.setText("0");
            ET22DLMV.setText("0");
            i22.setText("0");
            dato.putString("f22", i22.getText().toString());
            dato.putString("et22md", ET22MD.getText().toString());
            dato.putString("et22vl", ET22VL.getText().toString());
            dato.putString("et22dvml", ET22DVML.getText().toString());
            dato.putString("et22dlmv", ET22DLMV.getText().toString());
        }

        if(d23.getVisibility() == View.VISIBLE){
            i23.setText("1");
            dato.putString("f23", i23.getText().toString());
            dato.putString("et23md", ET23MD.getText().toString());
            dato.putString("et23vl", ET23VL.getText().toString());
            dato.putString("et23dvml", ET23DVML.getText().toString());
            dato.putString("et23dlmv", ET23DLMV.getText().toString());
        }
        else{
            ET23MD.setText("0");
            ET23VL.setText("0");
            ET23DVML.setText("0");
            ET23DLMV.setText("0");
            i23.setText("0");
            dato.putString("f23", i23.getText().toString());
            dato.putString("et23md", ET23MD.getText().toString());
            dato.putString("et23vl", ET23VL.getText().toString());
            dato.putString("et23dvml", ET23DVML.getText().toString());
            dato.putString("et23dlmv", ET23DLMV.getText().toString());
        }

        if(d24.getVisibility() == View.VISIBLE){
            i24.setText("1");
            dato.putString("f24", i24.getText().toString());
            dato.putString("et24md", ET24MD.getText().toString());
            dato.putString("et24vl", ET24VL.getText().toString());
            dato.putString("et24dvml", ET24DVML.getText().toString());
            dato.putString("et24dlmv", ET24DLMV.getText().toString());
        }
        else{
            ET24MD.setText("0");
            ET24VL.setText("0");
            ET24DVML.setText("0");
            ET24DLMV.setText("0");
            i24.setText("0");
            dato.putString("f24", i24.getText().toString());
            dato.putString("et24md", ET24MD.getText().toString());
            dato.putString("et24vl", ET24VL.getText().toString());
            dato.putString("et24dvml", ET24DVML.getText().toString());
            dato.putString("et24dlmv", ET24DLMV.getText().toString());
        }

        if(d25.getVisibility() == View.VISIBLE){
            i25.setText("1");
            dato.putString("f25", i25.getText().toString());
            dato.putString("et25md", ET25MD.getText().toString());
            dato.putString("et25vl", ET25VL.getText().toString());
            dato.putString("et25dvml", ET25DVML.getText().toString());
            dato.putString("et25dlmv", ET25DLMV.getText().toString());
        }
        else{
            ET25MD.setText("0");
            ET25VL.setText("0");
            ET25DVML.setText("0");
            ET25DLMV.setText("0");
            i25.setText("0");
            dato.putString("f25", i25.getText().toString());
            dato.putString("et25md", ET25MD.getText().toString());
            dato.putString("et25vl", ET25VL.getText().toString());
            dato.putString("et25dvml", ET25DVML.getText().toString());
            dato.putString("et25dlmv", ET25DLMV.getText().toString());
        }

        if(d26.getVisibility() == View.VISIBLE){
            i26.setText("1");
            dato.putString("f26", i26.getText().toString());
            dato.putString("et26md", ET26MD.getText().toString());
            dato.putString("et26vl", ET26VL.getText().toString());
            dato.putString("et26dvml", ET26DVML.getText().toString());
            dato.putString("et26dlmv", ET26DLMV.getText().toString());
        }
        else{
            ET26MD.setText("0");
            ET26VL.setText("0");
            ET26DVML.setText("0");
            ET26DLMV.setText("0");
            i26.setText("0");
            dato.putString("f26", i26.getText().toString());
            dato.putString("et26md", ET26MD.getText().toString());
            dato.putString("et26vl", ET26VL.getText().toString());
            dato.putString("et26dvml", ET26DVML.getText().toString());
            dato.putString("et26dlmv", ET26DLMV.getText().toString());
        }

        if(d27.getVisibility() == View.VISIBLE){
            i27.setText("1");
            dato.putString("f27", i27.getText().toString());
            dato.putString("et27md", ET27MD.getText().toString());
            dato.putString("et27vl", ET27VL.getText().toString());
            dato.putString("et27dvml", ET27DVML.getText().toString());
            dato.putString("et27dlmv", ET27DLMV.getText().toString());
        }
        else{
            ET27MD.setText("0");
            ET27VL.setText("0");
            ET27DVML.setText("0");
            ET27DLMV.setText("0");
            i27.setText("0");
            dato.putString("f27", i27.getText().toString());
            dato.putString("et27md", ET27MD.getText().toString());
            dato.putString("et27vl", ET27VL.getText().toString());
            dato.putString("et27dvml", ET27DVML.getText().toString());
            dato.putString("et27dlmv", ET27DLMV.getText().toString());
        }
    }

    public void procesoII(){

        i31 = new TextView(this);
        i32 = new TextView(this);
        i33 = new TextView(this);
        i34 = new TextView(this);
        i35 = new TextView(this);
        i36 = new TextView(this);
        i37 = new TextView(this);

        if(d31.getVisibility() == View.VISIBLE){
            i31.setText("1");
            dato.putString("f31", i31.getText().toString());
            dato.putString("et31md", ET31MD.getText().toString());
            dato.putString("et31vl", ET31VL.getText().toString());
            dato.putString("et31dvml", ET31DVML.getText().toString());
            dato.putString("et31dlmv", ET31DLMV.getText().toString());
        }
        else{
            ET31MD.setText("0");
            ET31VL.setText("0");
            ET31DVML.setText("0");
            ET31DLMV.setText("0");
            i31.setText("0");
            dato.putString("f31", i31.getText().toString());
            dato.putString("et31md", ET31MD.getText().toString());
            dato.putString("et31vl", ET31VL.getText().toString());
            dato.putString("et31dvml", ET31DVML.getText().toString());
            dato.putString("et31dlmv", ET31DLMV.getText().toString());
        }

        if(d32.getVisibility() == View.VISIBLE){
            i32.setText("1");
            dato.putString("f32", i32.getText().toString());
            dato.putString("et32md", ET32MD.getText().toString());
            dato.putString("et32vl", ET32VL.getText().toString());
            dato.putString("et32dvml", ET32DVML.getText().toString());
            dato.putString("et32dlmv", ET32DLMV.getText().toString());
        }
        else{
            ET32MD.setText("0");
            ET32VL.setText("0");
            ET32DVML.setText("0");
            ET32DLMV.setText("0");
            i32.setText("0");
            dato.putString("f32", i32.getText().toString());
            dato.putString("et32md", ET32MD.getText().toString());
            dato.putString("et32vl", ET32VL.getText().toString());
            dato.putString("et32dvml", ET32DVML.getText().toString());
            dato.putString("et32dlmv", ET32DLMV.getText().toString());
        }

        if(d33.getVisibility() == View.VISIBLE){
            i33.setText("1");
            dato.putString("f33", i33.getText().toString());
            dato.putString("et33md", ET33MD.getText().toString());
            dato.putString("et33vl", ET33VL.getText().toString());
            dato.putString("et33dvml", ET33DVML.getText().toString());
            dato.putString("et33dlmv", ET33DLMV.getText().toString());
        }
        else{
            ET33MD.setText("0");
            ET33VL.setText("0");
            ET33DVML.setText("0");
            ET33DLMV.setText("0");
            i33.setText("0");
            dato.putString("f33", i33.getText().toString());
            dato.putString("et33md", ET33MD.getText().toString());
            dato.putString("et33vl", ET33VL.getText().toString());
            dato.putString("et33dvml", ET33DVML.getText().toString());
            dato.putString("et33dlmv", ET33DLMV.getText().toString());
        }

        if(d34.getVisibility() == View.VISIBLE){
            i34.setText("1");
            dato.putString("f34", i34.getText().toString());
            dato.putString("et34md", ET34MD.getText().toString());
            dato.putString("et34vl", ET34VL.getText().toString());
            dato.putString("et34dvml", ET34DVML.getText().toString());
            dato.putString("et34dlmv", ET34DLMV.getText().toString());
        }
        else{
            ET34MD.setText("0");
            ET34VL.setText("0");
            ET34DVML.setText("0");
            ET34DLMV.setText("0");
            i34.setText("0");
            dato.putString("f34", i34.getText().toString());
            dato.putString("et34md", ET34MD.getText().toString());
            dato.putString("et34vl", ET34VL.getText().toString());
            dato.putString("et34dvml", ET34DVML.getText().toString());
            dato.putString("et34dlmv", ET34DLMV.getText().toString());
        }

        if(d35.getVisibility() == View.VISIBLE){
            i35.setText("1");
            dato.putString("f35", i35.getText().toString());
            dato.putString("et35md", ET35MD.getText().toString());
            dato.putString("et35vl", ET35VL.getText().toString());
            dato.putString("et35dvml", ET35DVML.getText().toString());
            dato.putString("et35dlmv", ET35DLMV.getText().toString());
        }
        else{
            ET35MD.setText("0");
            ET35VL.setText("0");
            ET35DVML.setText("0");
            ET35DLMV.setText("0");
            i35.setText("0");
            dato.putString("f35", i35.getText().toString());
            dato.putString("et35md", ET35MD.getText().toString());
            dato.putString("et35vl", ET35VL.getText().toString());
            dato.putString("et35dvml", ET35DVML.getText().toString());
            dato.putString("et35dlmv", ET35DLMV.getText().toString());
        }

        if(d36.getVisibility() == View.VISIBLE){
            i36.setText("1");
            dato.putString("f36", i36.getText().toString());
            dato.putString("et36md", ET36MD.getText().toString());
            dato.putString("et36vl", ET36VL.getText().toString());
            dato.putString("et36dvml", ET36DVML.getText().toString());
            dato.putString("et36dlmv", ET36DLMV.getText().toString());
        }
        else{
            ET36MD.setText("0");
            ET36VL.setText("0");
            ET36DVML.setText("0");
            ET36DLMV.setText("0");
            i36.setText("0");
            dato.putString("f36", i36.getText().toString());
            dato.putString("et36md", ET36MD.getText().toString());
            dato.putString("et36vl", ET36VL.getText().toString());
            dato.putString("et36dvml", ET36DVML.getText().toString());
            dato.putString("et36dlmv", ET36DLMV.getText().toString());
        }

        if(d37.getVisibility() == View.VISIBLE){
            i37.setText("1");
            dato.putString("f37", i37.getText().toString());
            dato.putString("et37md", ET37MD.getText().toString());
            dato.putString("et37vl", ET37VL.getText().toString());
            dato.putString("et37dvml", ET37DVML.getText().toString());
            dato.putString("et37dlmv", ET37DLMV.getText().toString());
        }
        else{
            ET37MD.setText("0");
            ET37VL.setText("0");
            ET37DVML.setText("0");
            ET37DLMV.setText("0");
            i37.setText("0");
            dato.putString("f37", i37.getText().toString());
            dato.putString("et37md", ET37MD.getText().toString());
            dato.putString("et37vl", ET37VL.getText().toString());
            dato.putString("et37dvml", ET37DVML.getText().toString());
            dato.putString("et37dlmv", ET37DLMV.getText().toString());
        }
    }

    public void procesoDI(){

        i41 = new TextView(this);
        i42 = new TextView(this);
        i43 = new TextView(this);
        i44 = new TextView(this);
        i45 = new TextView(this);
        i46 = new TextView(this);
        i47 = new TextView(this);

        if(d41.getVisibility() == View.VISIBLE){
            i41.setText("1");
            dato.putString("f41", i41.getText().toString());
            dato.putString("et41md", ET41MD.getText().toString());
            dato.putString("et41vl", ET41VL.getText().toString());
            dato.putString("et41dvml", ET41DVML.getText().toString());
            dato.putString("et41dlmv", ET41DLMV.getText().toString());
        }
        else{
            ET41MD.setText("0");
            ET41VL.setText("0");
            ET41DVML.setText("0");
            ET41DLMV.setText("0");
            i41.setText("0");
            dato.putString("f41", i41.getText().toString());
            dato.putString("et41md", ET41MD.getText().toString());
            dato.putString("et41vl", ET41VL.getText().toString());
            dato.putString("et41dvml", ET41DVML.getText().toString());
            dato.putString("et41dlmv", ET41DLMV.getText().toString());
        }

        if(d42.getVisibility() == View.VISIBLE){
            i42.setText("1");
            dato.putString("f42", i42.getText().toString());
            dato.putString("et42md", ET42MD.getText().toString());
            dato.putString("et42vl", ET42VL.getText().toString());
            dato.putString("et42dvml", ET42DVML.getText().toString());
            dato.putString("et42dlmv", ET42DLMV.getText().toString());
        }
        else{
            ET42MD.setText("0");
            ET42VL.setText("0");
            ET42DVML.setText("0");
            ET42DLMV.setText("0");
            i42.setText("0");
            dato.putString("f42", i42.getText().toString());
            dato.putString("et42md", ET42MD.getText().toString());
            dato.putString("et42vl", ET42VL.getText().toString());
            dato.putString("et42dvml", ET42DVML.getText().toString());
            dato.putString("et42dlmv", ET42DLMV.getText().toString());
        }

        if(d43.getVisibility() == View.VISIBLE){
            i43.setText("1");
            dato.putString("f43", i43.getText().toString());
            dato.putString("et43md", ET43MD.getText().toString());
            dato.putString("et43vl", ET43VL.getText().toString());
            dato.putString("et43dvml", ET43DVML.getText().toString());
            dato.putString("et43dlmv", ET43DLMV.getText().toString());
        }
        else{
            ET43MD.setText("0");
            ET43VL.setText("0");
            ET43DVML.setText("0");
            ET43DLMV.setText("0");
            i43.setText("0");
            dato.putString("f43", i43.getText().toString());
            dato.putString("et43md", ET43MD.getText().toString());
            dato.putString("et43vl", ET43VL.getText().toString());
            dato.putString("et43dvml", ET43DVML.getText().toString());
            dato.putString("et43dlmv", ET43DLMV.getText().toString());
        }

        if(d44.getVisibility() == View.VISIBLE){
            i44.setText("1");
            dato.putString("f44", i44.getText().toString());
            dato.putString("et44md", ET44MD.getText().toString());
            dato.putString("et44vl", ET44VL.getText().toString());
            dato.putString("et44dvml", ET44DVML.getText().toString());
            dato.putString("et44dlmv", ET44DLMV.getText().toString());
        }
        else{
            ET44MD.setText("0");
            ET44VL.setText("0");
            ET44DVML.setText("0");
            ET44DLMV.setText("0");
            i44.setText("0");
            dato.putString("f44", i44.getText().toString());
            dato.putString("et44md", ET44MD.getText().toString());
            dato.putString("et44vl", ET44VL.getText().toString());
            dato.putString("et44dvml", ET44DVML.getText().toString());
            dato.putString("et44dlmv", ET44DLMV.getText().toString());
        }

        if(d45.getVisibility() == View.VISIBLE){
            i45.setText("1");
            dato.putString("f45", i45.getText().toString());
            dato.putString("et45md", ET45MD.getText().toString());
            dato.putString("et45vl", ET45VL.getText().toString());
            dato.putString("et45dvml", ET45DVML.getText().toString());
            dato.putString("et45dlmv", ET45DLMV.getText().toString());
        }
        else{
            ET45MD.setText("0");
            ET45VL.setText("0");
            ET45DVML.setText("0");
            ET45DLMV.setText("0");
            i45.setText("0");
            dato.putString("f45", i45.getText().toString());
            dato.putString("et45md", ET45MD.getText().toString());
            dato.putString("et45vl", ET45VL.getText().toString());
            dato.putString("et45dvml", ET45DVML.getText().toString());
            dato.putString("et45dlmv", ET45DLMV.getText().toString());
        }

        if(d46.getVisibility() == View.VISIBLE){
            i46.setText("1");
            dato.putString("f46", i46.getText().toString());
            dato.putString("et46md", ET46MD.getText().toString());
            dato.putString("et46vl", ET46VL.getText().toString());
            dato.putString("et46dvml", ET46DVML.getText().toString());
            dato.putString("et46dlmv", ET46DLMV.getText().toString());
        }
        else{
            ET46MD.setText("0");
            ET46VL.setText("0");
            ET46DVML.setText("0");
            ET46DLMV.setText("0");
            i46.setText("0");
            dato.putString("f46", i46.getText().toString());
            dato.putString("et46md", ET46MD.getText().toString());
            dato.putString("et46vl", ET46VL.getText().toString());
            dato.putString("et46dvml", ET46DVML.getText().toString());
            dato.putString("et46dlmv", ET46DLMV.getText().toString());
        }

        if(d47.getVisibility() == View.VISIBLE){
            i47.setText("1");
            dato.putString("f47", i47.getText().toString());
            dato.putString("et47md", ET47MD.getText().toString());
            dato.putString("et47vl", ET47VL.getText().toString());
            dato.putString("et47dvml", ET47DVML.getText().toString());
            dato.putString("et47dlmv", ET47DLMV.getText().toString());
        }
        else{
            ET47MD.setText("0");
            ET47VL.setText("0");
            ET47DVML.setText("0");
            ET47DLMV.setText("0");
            i47.setText("0");
            dato.putString("f47", i47.getText().toString());
            dato.putString("et47md", ET47MD.getText().toString());
            dato.putString("et47vl", ET47VL.getText().toString());
            dato.putString("et47dvml", ET47DVML.getText().toString());
            dato.putString("et47dlmv", ET47DLMV.getText().toString());
        }
    }



    /*----------------------------Boton------------------------------*/


    public void aceptar(View view){


        procesoDS();
        procesoIS();
        procesoII();
        procesoDI();

        Intent in = new Intent(this, DatosFormato.class);
        in.putExtras(dato);
        startActivity(in);
        finish();
    }

}
