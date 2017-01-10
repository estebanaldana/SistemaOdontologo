package com.example.dante_000.sistemadientes;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


public class Odontograma extends AppCompatActivity {

    CheckBox d11, d12, d13, d14, d15, d16, d17;
    CheckBox d21, d22, d23, d24, d25, d26, d27;
    CheckBox d31, d32, d33, d34, d35, d36, d37;
    CheckBox d41, d42, d43, d44, d45, d46, d47;

    TextView i11, i12, i13, i14, i15, i16, i17;
    TextView i21, i22, i23, i24, i25, i26, i27;
    TextView i31, i32, i33, i34, i35, i36, i37;
    TextView i41, i42, i43, i44, i45, i46, i47;


    private String Mensaje;
    private String Titulo;
    private String Aceptar;

    Bundle dato = new Bundle();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odontograma);

        d11 = (CheckBox) findViewById(R.id.d11);
        d12 = (CheckBox) findViewById(R.id.d12);
        d13 = (CheckBox) findViewById(R.id.d13);
        d14 = (CheckBox) findViewById(R.id.d14);
        d15 = (CheckBox) findViewById(R.id.d15);
        d16 = (CheckBox) findViewById(R.id.d16);
        d17 = (CheckBox) findViewById(R.id.d17);

        d21 = (CheckBox) findViewById(R.id.d21);
        d22 = (CheckBox) findViewById(R.id.d22);
        d23 = (CheckBox) findViewById(R.id.d23);
        d24 = (CheckBox) findViewById(R.id.d24);
        d25 = (CheckBox) findViewById(R.id.d25);
        d26 = (CheckBox) findViewById(R.id.d26);
        d27 = (CheckBox) findViewById(R.id.d27);

        d31 = (CheckBox) findViewById(R.id.d31);
        d32 = (CheckBox) findViewById(R.id.d32);
        d33 = (CheckBox) findViewById(R.id.d33);
        d34 = (CheckBox) findViewById(R.id.d34);
        d35 = (CheckBox) findViewById(R.id.d35);
        d36 = (CheckBox) findViewById(R.id.d36);
        d37 = (CheckBox) findViewById(R.id.d37);

        d41 = (CheckBox) findViewById(R.id.d41);
        d42 = (CheckBox) findViewById(R.id.d42);
        d43 = (CheckBox) findViewById(R.id.d43);
        d44 = (CheckBox) findViewById(R.id.d44);
        d45 = (CheckBox) findViewById(R.id.d45);
        d46 = (CheckBox) findViewById(R.id.d46);
        d47 = (CheckBox) findViewById(R.id.d47);



        try {
            Bundle datoR = this.getIntent().getExtras();
            TextView i = new TextView(this);

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
                    finish();
                    dialog.cancel();
                }
            });
            AlertDialog alert1 = builder1.create();
            alert1.show();
            return;
        }

        Mensaje = "Este es un Odontrograma para que selecciones los dientes que necesitas";
        Titulo = "Odontograma";
        Aceptar = "Aceptar";

        final AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage(Mensaje).setTitle(Titulo).setCancelable(false)
                .setNeutralButton(Aceptar, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                i11 = new TextView(Odontograma.this);
                i12 = new TextView(Odontograma.this);
                i13 = new TextView(Odontograma.this);
                i14 = new TextView(Odontograma.this);
                i15 = new TextView(Odontograma.this);
                i16 = new TextView(Odontograma.this);
                i17 = new TextView(Odontograma.this);
                /*---------------------------------------*/
                i21 = new TextView(Odontograma.this);
                i22 = new TextView(Odontograma.this);
                i23 = new TextView(Odontograma.this);
                i24 = new TextView(Odontograma.this);
                i25 = new TextView(Odontograma.this);
                i26 = new TextView(Odontograma.this);
                i27 = new TextView(Odontograma.this);
                /*---------------------------------------*/
                i31 = new TextView(Odontograma.this);
                i32 = new TextView(Odontograma.this);
                i33 = new TextView(Odontograma.this);
                i34 = new TextView(Odontograma.this);
                i35 = new TextView(Odontograma.this);
                i36 = new TextView(Odontograma.this);
                i37 = new TextView(Odontograma.this);
                /*---------------------------------------*/
                i41 = new TextView(Odontograma.this);
                i42 = new TextView(Odontograma.this);
                i43 = new TextView(Odontograma.this);
                i44 = new TextView(Odontograma.this);
                i45 = new TextView(Odontograma.this);
                i46 = new TextView(Odontograma.this);
                i47 = new TextView(Odontograma.this);
                /*---------------------------------------*/

                i11.setText("0");
                i12.setText("0");
                i13.setText("0");
                i14.setText("0");
                i15.setText("0");
                i16.setText("0");
                i17.setText("0");
                /*------------------------*/
                i21.setText("0");
                i22.setText("0");
                i23.setText("0");
                i24.setText("0");
                i25.setText("0");
                i26.setText("0");
                i27.setText("0");
                /*------------------------*/
                i31.setText("0");
                i32.setText("0");
                i33.setText("0");
                i34.setText("0");
                i35.setText("0");
                i36.setText("0");
                i37.setText("0");
                /*------------------------*/
                i41.setText("0");
                i42.setText("0");
                i43.setText("0");
                i44.setText("0");
                i45.setText("0");
                i46.setText("0");
                i47.setText("0");
                /*------------------------*/

                dato.putString("d11", i11.getText().toString());
                dato.putString("d12", i12.getText().toString());
                dato.putString("d13", i13.getText().toString());
                dato.putString("d14", i14.getText().toString());
                dato.putString("d15", i15.getText().toString());
                dato.putString("d16", i16.getText().toString());
                dato.putString("d17", i17.getText().toString());
                /*---------------------------------------------------*/
                dato.putString("d21", i21.getText().toString());
                dato.putString("d22", i22.getText().toString());
                dato.putString("d23", i23.getText().toString());
                dato.putString("d24", i24.getText().toString());
                dato.putString("d25", i25.getText().toString());
                dato.putString("d26", i26.getText().toString());
                dato.putString("d27", i27.getText().toString());
                /*---------------------------------------------------*/
                dato.putString("d31", i31.getText().toString());
                dato.putString("d32", i32.getText().toString());
                dato.putString("d33", i33.getText().toString());
                dato.putString("d34", i34.getText().toString());
                dato.putString("d35", i35.getText().toString());
                dato.putString("d36", i36.getText().toString());
                dato.putString("d37", i37.getText().toString());
                /*---------------------------------------------------*/
                dato.putString("d41", i41.getText().toString());
                dato.putString("d42", i42.getText().toString());
                dato.putString("d43", i43.getText().toString());
                dato.putString("d44", i44.getText().toString());
                dato.putString("d45", i45.getText().toString());
                dato.putString("d46", i46.getText().toString());
                dato.putString("d47", i47.getText().toString());
                /*---------------------------------------------------*/
            }
        });
        AlertDialog alert1 = builder1.create();
        alert1.show();


        return;

    }


    public void dientes(View view){

        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()){
            case R.id.d11:
                if (checked){
                    i11.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 11", Toast.LENGTH_SHORT).show();
                    dato.putString("d11", i11.getText().toString());
                }
                else {
                    i11.setText("0");
                    dato.putString("d11", i11.getText().toString());
                }
                break;
            case R.id.d12:
                if(checked){
                    i12.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 12", Toast.LENGTH_SHORT).show();
                    dato.putString("d12", i12.getText().toString());
                }
                else {
                    i12.setText("0");
                    dato.putString("d12", i12.getText().toString());
                }
                break;
            case R.id.d13:
                if(checked){
                    i13.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 13", Toast.LENGTH_SHORT).show();
                    dato.putString("d13", i13.getText().toString());
                }
                else {
                    i13.setText("0");
                    dato.putString("d13", i13.getText().toString());
                }
                break;
            case R.id.d14:
                if(checked){
                    i14.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 14", Toast.LENGTH_SHORT).show();
                    dato.putString("d14", i14.getText().toString());
                }
                else{
                    i14.setText("0");
                    dato.putString("d14", i14.getText().toString());
                }
                break;
            case R.id.d15:
                if(checked){
                    i15.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 15", Toast.LENGTH_SHORT).show();
                    dato.putString("d15", i15.getText().toString());
                }
                else{
                    i15.setText("0");
                    dato.putString("d15", i15.getText().toString());
                }
                break;
            case R.id.d16:
                if(checked){
                    i16.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 16", Toast.LENGTH_SHORT).show();
                    dato.putString("d16", i16.getText().toString());
                }
                else{
                    i16.setText("0");
                    dato.putString("d16", i16.getText().toString());
                }
                break;
            case R.id.d17:
                if(checked){
                    i17.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 17", Toast.LENGTH_SHORT).show();
                    dato.putString("d17", i17.getText().toString());
                }
                else{
                    i17.setText("0");
                    dato.putString("d17", i17.getText().toString());
                }
                break;
                /*----------------------------------------------------------------------------------------------*/


            case R.id.d21:
                if (checked){
                    i21.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 21", Toast.LENGTH_SHORT).show();
                    dato.putString("d21", i21.getText().toString());
                }
                else {
                    i21.setText("0");
                    dato.putString("d21", i21.getText().toString());
                }
                break;
            case R.id.d22:
                if(checked){
                    i22.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 22", Toast.LENGTH_SHORT).show();
                    dato.putString("d22", i22.getText().toString());
                }
                else {
                    i22.setText("0");
                    dato.putString("d22", i22.getText().toString());
                }
                break;
            case R.id.d23:
                if(checked){
                    i23.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 23", Toast.LENGTH_SHORT).show();
                    dato.putString("d23", i23.getText().toString());
                }
                else {
                    i23.setText("0");
                    dato.putString("d23", i23.getText().toString());
                }
                break;
            case R.id.d24:
                if(checked){
                    i24.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 24", Toast.LENGTH_SHORT).show();
                    dato.putString("d24", i24.getText().toString());
                }
                else{
                    i24.setText("0");
                    dato.putString("d24", i24.getText().toString());
                }
                break;
            case R.id.d25:
                if(checked){
                    i25.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 25", Toast.LENGTH_SHORT).show();
                    dato.putString("d25", i25.getText().toString());
                }
                else{
                    i25.setText("0");
                    dato.putString("d25", i25.getText().toString());
                }
                break;
            case R.id.d26:
                if(checked){
                    i26.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 26", Toast.LENGTH_SHORT).show();
                    dato.putString("d26", i26.getText().toString());
                }
                else{
                    i26.setText("0");
                    dato.putString("d26", i26.getText().toString());
                }
                break;
            case R.id.d27:
                if(checked){
                    i27.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 27", Toast.LENGTH_SHORT).show();
                    dato.putString("d27", i27.getText().toString());
                }
                else{
                    i27.setText("0");
                    dato.putString("d27", i27.getText().toString());
                }
                break;

                /*----------------------------------------------------------------------------------------------*/


            case R.id.d31:
                if (checked){
                    i31.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 31", Toast.LENGTH_SHORT).show();
                    dato.putString("d31", i31.getText().toString());
                }
                else {
                    i31.setText("0");
                    dato.putString("d31", i31.getText().toString());
                }
                break;
            case R.id.d32:
                if(checked){
                    i32.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 32", Toast.LENGTH_SHORT).show();
                    dato.putString("d32", i32.getText().toString());
                }
                else {
                    i32.setText("0");
                    dato.putString("d32", i32.getText().toString());
                }
                break;
            case R.id.d33:
                if(checked){
                    i33.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 33", Toast.LENGTH_SHORT).show();
                    dato.putString("d33", i33.getText().toString());
                }
                else {
                    i33.setText("0");
                    dato.putString("d33", i33.getText().toString());
                }
                break;
            case R.id.d34:
                if(checked){
                    i34.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 34", Toast.LENGTH_SHORT).show();
                    dato.putString("d34", i34.getText().toString());
                }
                else{
                    i34.setText("0");
                    dato.putString("d34", i34.getText().toString());
                }
                break;
            case R.id.d35:
                if(checked){
                    i35.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 35", Toast.LENGTH_SHORT).show();
                    dato.putString("d35", i35.getText().toString());
                }
                else{
                    i35.setText("0");
                    dato.putString("d35", i35.getText().toString());
                }
                break;
            case R.id.d36:
                if(checked){
                    i36.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 36", Toast.LENGTH_SHORT).show();
                    dato.putString("d36", i36.getText().toString());
                }
                else{
                    i36.setText("0");
                    dato.putString("d36", i36.getText().toString());
                }
                break;
            case R.id.d37:
                if(checked){
                    i37.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 37", Toast.LENGTH_SHORT).show();
                    dato.putString("d37", i37.getText().toString());
                }
                else{
                    i37.setText("0");
                    dato.putString("d37", i37.getText().toString());
                }
                break;

                /*----------------------------------------------------------------------------------------------*/



            case R.id.d41:
                if (checked){
                    i41.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 41", Toast.LENGTH_SHORT).show();
                    dato.putString("d41", i41.getText().toString());
                }
                else {
                    i41.setText("0");
                    dato.putString("d41", i41.getText().toString());
                }
                break;
            case R.id.d42:
                if(checked){
                    i42.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 42", Toast.LENGTH_SHORT).show();
                    dato.putString("d42", i42.getText().toString());
                }
                else {
                    i42.setText("0");
                    dato.putString("d42", i42.getText().toString());
                }
                break;
            case R.id.d43:
                if(checked){
                    i43.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 43", Toast.LENGTH_SHORT).show();
                    dato.putString("d43", i43.getText().toString());
                }
                else {
                    i43.setText("0");
                    dato.putString("d43", i43.getText().toString());
                }
                break;
            case R.id.d44:
                if(checked){
                    i44.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 44", Toast.LENGTH_SHORT).show();
                    dato.putString("d44", i44.getText().toString());
                }
                else{
                    i44.setText("0");
                    dato.putString("d44", i44.getText().toString());
                }
                break;
            case R.id.d45:
                if(checked){
                    i45.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 45", Toast.LENGTH_SHORT).show();
                    dato.putString("d45", i45.getText().toString());
                }
                else{
                    i45.setText("0");
                    dato.putString("d45", i45.getText().toString());
                }
                break;
            case R.id.d46:
                if(checked){
                    i46.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 46", Toast.LENGTH_SHORT).show();
                    dato.putString("d46", i46.getText().toString());
                }
                else{
                    i46.setText("0");
                    dato.putString("d46", i46.getText().toString());
                }
                break;
            case R.id.d47:
                if(checked){
                    i47.setText("1");
                    Toast.makeText(this, "Seleccionaste el diente 47", Toast.LENGTH_SHORT).show();
                    dato.putString("d47", i47.getText().toString());
                }
                else{
                    i47.setText("0");
                    dato.putString("d47", i47.getText().toString());
                }
                break;

        }

    }


    public void aceptar(View view){


        Intent in = new Intent(this, DatosOdontograma.class);
        in.putExtras(dato);
        startActivity(in);
        finish();

    }
}
