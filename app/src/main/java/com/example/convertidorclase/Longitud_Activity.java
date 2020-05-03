package com.example.convertidorclase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Longitud_Activity extends AppCompatActivity {
        private EditText ingresoL;
        private Spinner convertirDeL;
        private Spinner convertirAL;
        private TextView mostrarResultadoL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longitud_);

        ingresoL                =(EditText)findViewById(R.id.ingresoL);
        convertirDeL            =(Spinner)findViewById(R.id.spinnerDeL);
        convertirAL             =(Spinner)findViewById(R.id.spinnerAL);
        mostrarResultadoL       =(TextView)findViewById(R.id.mostrarResultadoL);
        //Opciones de conversion
        String[] opciones ={"Kilometro","Metro","Centimetro","Milimetro","Micromono","Nanometro","Milla","Yarda","Pie","Pulgada","Milla nautica"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this ,android.R.layout.simple_spinner_item,opciones);
        convertirDeL.setAdapter(adapter);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opciones);
        convertirAL.setAdapter(adapter1);

    }
    public double pasarAMetro (String ingreso , double ingresoNum){
        double resultado =0;
        if (ingreso.equals("Kilometro")) {
                return resultado = ingresoNum*1000;
        }
        else if(ingreso.equals("Centimetro")){
                return resultado = ingresoNum / 100;
        }
        else if(ingreso.equals("Milimetro")){
                return resultado = ingresoNum / 1000;
        }
        else if(ingreso.equals("Micronomo")){
                return resultado = ingresoNum /(Math.exp(1)+6);
        }
        else if(ingreso.equals("Nanometro")){
                return resultado = ingresoNum / (Math.exp(1)+9);
        }
        else if(ingreso.equals("Milla")){
                return resultado = ingresoNum * 1609;
        }
        else if(ingreso.equals("Yarda")){
                return  resultado = ingresoNum /1094;
        }
        else if(ingreso.equals("Pie")){
                return  resultado = ingresoNum / 3.281;
        }
        else if(ingreso.equals("Pulgada")){
                return  resultado = ingresoNum / 39.37;
        }
        else if(ingreso.equals("Milla nautica")){
            return resultado = ingresoNum * 1852;
        }
        return resultado;
    }

    public double pasardeMetroAotros (String ingreso,double ingresoNum){
        double resultado =0;
        if (ingreso.equals("Kilometro")) {
            return resultado = ingresoNum/1000;
        }
        else if(ingreso.equals("Centimetro")){
            return resultado = ingresoNum * 100;
        }
        else if(ingreso.equals("Milimetro")){
            return resultado = ingresoNum * 1000;
        }
        else if(ingreso.equals("Micronomo")){
            return resultado = ingresoNum *(Math.exp(1)+6);
        }
        else if(ingreso.equals("Nanometro")){
            return resultado = ingresoNum *(Math.exp(1)+9);
        }
        else if(ingreso.equals("Milla")){
            return resultado = ingresoNum * 1609;
        }
        else if(ingreso.equals("Yarda")){
            return  resultado = ingresoNum *1094;
        }
        else if(ingreso.equals("Pie")){
            return  resultado = ingresoNum * 3.281;
        }
        else if(ingreso.equals("Pulgada")){
            return  resultado = ingresoNum * 39.37;
        }
        else if(ingreso.equals("Milla nautica")){
            return resultado = ingresoNum / 1852;
        }
        return resultado;
    }

    public void calcularLongitud(View view) {
        String valor_ingresado = ingresoL.getText().toString();
        double valor_int = Double.parseDouble(valor_ingresado);

        String seleccion1 = convertirDeL.getSelectedItem().toString();
        String seleccion2 = convertirAL.getSelectedItem().toString();

        double x = pasarAMetro(seleccion1,valor_int);
        System.out.print("ACAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println(x);
        //-----------------------------------------------------------1
        if (seleccion1.equals("Kilometro") && seleccion2.equals("Metro")) {
            double y = pasarAMetro(seleccion1,valor_int);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Kilometro") && seleccion2.equals("Centimetro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Kilometro") && seleccion2.equals("Milimetro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Kilometro") && seleccion2.equals("Micronomo")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Kilometro") && seleccion2.equals("Nanometro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Kilometro") && seleccion2.equals("Milla")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Kilometro") && seleccion2.equals("Yarda")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Kilometro") && seleccion2.equals("Pie")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Kilometro") && seleccion2.equals("Pulgada")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Kilometro") && seleccion2.equals("Milla nautica")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        //--------------------------------------------------------------------2
        if (seleccion1.equals("Metro") && seleccion2.equals("Kilometro")) {
            double y = valor_int;
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Metro") && seleccion2.equals("Centimetro")){
            double y = valor_int;
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Metro") && seleccion2.equals("Milimetro")){
            double y = valor_int;
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Metro") && seleccion2.equals("Micrometro")){
            double y = valor_int;
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Metro") && seleccion2.equals("Nanometro")){
            double y = valor_int;
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Metro") && seleccion2.equals("Milla")){
            double y = valor_int;
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Metro") && seleccion2.equals("Yarda")){
            double y = valor_int;
             y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Metro") && seleccion2.equals("Pie")){

            double y = valor_int;
             y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Metro") && seleccion2.equals("Pulgada")){
            double y = valor_int;
             y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Metro") && seleccion2.equals("Milla nautica")){
            double y = valor_int;
             y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        //-------------------------------------------------------3
        if (seleccion1.equals("Centimetro") && seleccion2.equals("Kilometro")) {
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Centimetro") && seleccion2.equals("Metro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Centimetro") && seleccion2.equals("Milimetro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Centimetro") && seleccion2.equals("Micrometro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Centimetro") && seleccion2.equals("Nanometro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Centimetro") && seleccion2.equals("Milla")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Centimetro") && seleccion2.equals("Yarda")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Centimetro") && seleccion2.equals("Pie")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Centimetro") && seleccion2.equals("Pulgada")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Centimetro") && seleccion2.equals("Milla nautica")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        //------------------------------------------------------4
        if (seleccion1.equals("Centimetro") && seleccion2.equals("Kilometro")) {
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Centimetro") && seleccion2.equals("Metro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Centimetro") && seleccion2.equals("Milimetro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Centimetro") && seleccion2.equals("Micrometro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Centimetro") && seleccion2.equals("Nanometro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Centimetro") && seleccion2.equals("Milla")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Centimetro") && seleccion2.equals("Yarda")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Centimetro") && seleccion2.equals("Pie")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Centimetro") && seleccion2.equals("Pulgada")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Centimetro") && seleccion2.equals("Milla nautica")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        //----------------------------------------------------5
        if (seleccion1.equals("Milimetro") && seleccion2.equals("Kilometro")) {
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milimetro") && seleccion2.equals("Metro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milimetro") && seleccion2.equals("Centimetro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milimetro") && seleccion2.equals("Micrometro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milimetro") && seleccion2.equals("Nanometro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milimetro") && seleccion2.equals("Milla")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milimetro") && seleccion2.equals("Yarda")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milimetro") && seleccion2.equals("Pie")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milimetro") && seleccion2.equals("Pulgada")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milimetro") && seleccion2.equals("Milla nautica")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        //----------------------------------------------------------------6
        if (seleccion1.equals("Micrometro") && seleccion2.equals("Kilometro")) {
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Micrometro") && seleccion2.equals("Metro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Micrometro") && seleccion2.equals("Centimetro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Micrometro") && seleccion2.equals("Milimetro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Micrometro") && seleccion2.equals("Nanometro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Micrometro") && seleccion2.equals("Milla")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Micrometro") && seleccion2.equals("Yarda")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Micrometro") && seleccion2.equals("Pie")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Micrometro") && seleccion2.equals("Pulgada")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Micrometro") && seleccion2.equals("Milla nautica")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        //-----------------------------------------------------------------7
        if (seleccion1.equals("Nanometro") && seleccion2.equals("Kilometro")) {
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Nanometro") && seleccion2.equals("Metro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Nanometro") && seleccion2.equals("Centimetro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Nanometro") && seleccion2.equals("Milimetro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Nanometro") && seleccion2.equals("Micrometro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Nanometro") && seleccion2.equals("Milla")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Nanometro") && seleccion2.equals("Yarda")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Nanometro") && seleccion2.equals("Pie")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Nanometro") && seleccion2.equals("Pulgada")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Nanometro") && seleccion2.equals("Milla nautica")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        //------------------------------------------------------------8
        if (seleccion1.equals("Milla") && seleccion2.equals("Kilometro")) {
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milla") && seleccion2.equals("Metro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milla") && seleccion2.equals("Centimetro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milla") && seleccion2.equals("Milimetro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milla") && seleccion2.equals("Nanometro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milla") && seleccion2.equals("Micrometro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milla") && seleccion2.equals("Yarda")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milla") && seleccion2.equals("Pie")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milla") && seleccion2.equals("Pulgada")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milla") && seleccion2.equals("Milla nautica")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        //---------------------------------------------------------------------9
        if (seleccion1.equals("Pie") && seleccion2.equals("Kilometro")) {
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Pie") && seleccion2.equals("Metro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Pie") && seleccion2.equals("Centimetro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Pie") && seleccion2.equals("Milimetro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Pie") && seleccion2.equals("Nanometro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Pie") && seleccion2.equals("Micrometo")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Pie") && seleccion2.equals("Yarda")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Pie") && seleccion2.equals("Milla")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Pie") && seleccion2.equals("Pulgada")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Pie") && seleccion2.equals("Milla nautica")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        //---------------------------------------------------------------10
        if (seleccion1.equals("Pulgada") && seleccion2.equals("Kilometro")) {
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Pulgada") && seleccion2.equals("Metro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Pulgada") && seleccion2.equals("Centimetro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Pulgada") && seleccion2.equals("Milimetro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Pulgada") && seleccion2.equals("Nanometro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Pulgada") && seleccion2.equals("Milla")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Pulgada") && seleccion2.equals("Yarda")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Pulgada") && seleccion2.equals("Pie")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Pulgada") && seleccion2.equals("Micrometro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Pulgada") && seleccion2.equals("Milla nautica")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        //------------------------------------------------11
        if (seleccion1.equals("Milla nautica") && seleccion2.equals("Kilometro")) {
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milla nautica") && seleccion2.equals("Metro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milla nautica") && seleccion2.equals("Centimetro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milla nautica") && seleccion2.equals("Milimetro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milla nautica") && seleccion2.equals("Nanometro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milla nautica") && seleccion2.equals("Milla")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milla nautica") && seleccion2.equals("Yarda")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milla nautica") && seleccion2.equals("Pie")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milla nautica") && seleccion2.equals("Pulgada")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
        else if(seleccion1.equals("Milla nautica") && seleccion2.equals("Micrometro")){
            double y = pasarAMetro(seleccion1,valor_int);
            y=pasardeMetroAotros(seleccion2,y);
            String resultado = String.valueOf(y);
            mostrarResultadoL.setText(resultado);
        }
    }
}
