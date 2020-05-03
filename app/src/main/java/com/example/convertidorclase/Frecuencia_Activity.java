package com.example.convertidorclase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;



public class Frecuencia_Activity extends AppCompatActivity {
        private EditText ingresoET;
        private Spinner  convertirDe;
        private Spinner  convertirA;
        private TextView mostraResultadoF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frecuencia_);

        ingresoET   =   (EditText)findViewById(R.id.ingresoET);
        convertirDe =   (Spinner)findViewById(R.id.spinnerConvertiDeFrecuencia);
        convertirA  =   (Spinner)findViewById(R.id.spinnerConvertirAFrecuencia);
        mostraResultadoF   =   (TextView)findViewById(R.id.textView);
        //Opciones de conversion
        String[] opciones ={"Hercio","Kilohercios","Megahercios","Gigahercio"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this ,android.R.layout.simple_spinner_item,opciones);
        convertirDe.setAdapter(adapter);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opciones);
        convertirA.setAdapter(adapter1);

    }
    private double convertirAHercios(String opcion_entrada,double ingreso ){
        double resultado = 0;
        if (opcion_entrada.equals("Kilohercios")){
            return (ingreso*1000);
        }
        else if(opcion_entrada.equals("Megahercios")){
            return  resultado = (ingreso*(Math.exp(1)+6));
        }
        else if(opcion_entrada.equals("Gigahercio")){
            return resultado = (ingreso*(Math.exp(1)+9));
        }
        else {
            return ingreso;
        }
    }
    private double convertirHercioAOtros (String opcion_salida,double ingreso){
        double resultado = 0;
        if (opcion_salida.equals("Kilohercios")){
            return resultado = ingreso/1000;
        }
        else if(opcion_salida.equals("Megahercios")){
            return  resultado = ingreso/(Math.exp(1)+6);
        }
        else if(opcion_salida.equals("Gigahercio")){
            return resultado = ingreso/(Math.exp(1)+9);
        }
        else {
            return ingreso;
        }
    }
    public void calcularFrecuencia (View view){
        String valor_ingresado = ingresoET.getText().toString();
        double valor_int = Double.parseDouble(valor_ingresado);
        String seleccion1 = convertirDe.getSelectedItem().toString();
        String seleccion2 = convertirA.getSelectedItem().toString();

        double k = convertirAHercios(seleccion1,valor_int);
        System.out.println("ACAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println(k);
        double l= convertirHercioAOtros(seleccion2,k);
        System.out.println("ACAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println(l);

        //-----------------------------------------------------------1
        if (seleccion1.equals("Hercio") && seleccion2.equals("Kilohercio")) {
            double r = convertirHercioAOtros(seleccion2,valor_int);
             String resultado = String.valueOf(convertirHercioAOtros(seleccion2,r));
             mostraResultadoF.setText(resultado);

        }
        else if(seleccion1.equals("Hercio") && seleccion2.equals("Megahercio")){
            String resultado = String.valueOf(convertirHercioAOtros(seleccion2,valor_int));
            mostraResultadoF.setText(resultado);
            System.out.print(resultado);
        }
        else if(seleccion1.equals("Hercio") && seleccion2.equals("Gigahercio")){
            String resultado = String.valueOf(convertirHercioAOtros(seleccion2,valor_int));
            mostraResultadoF.setText(resultado);
            System.out.print(resultado);
        }
        //--------------------------------------------------------------2
        else if(seleccion1.equals("Kilohercio") && seleccion2.equals("Hercio")){
                String resultado = String.valueOf(convertirAHercios(seleccion1,valor_int));
                mostraResultadoF.setText(resultado);
            System.out.print(resultado);
        }
        else if(seleccion1.equals("Kilohercio") && seleccion2.equals("Megahercio")){
            double x = convertirAHercios(seleccion1,valor_int);
                    x = convertirHercioAOtros(seleccion2,x);
                    String resultado = String.valueOf(x);
                    mostraResultadoF.setText(resultado);
            System.out.print(resultado);
        }
        else if(seleccion1.equals("Kilohercio") && seleccion2.equals("Gigahercio")){
            double x = convertirAHercios(seleccion1,valor_int);
                    x = convertirHercioAOtros(seleccion2,x);
                    String resultado = String.valueOf(x);
                     mostraResultadoF.setText(resultado);
            System.out.print(resultado);
        }
        //-------------------------------------------------------------3
        else if(seleccion1.equals("Megahercio") && seleccion2.equals("Hercio")){
            String resultado = String.valueOf(convertirAHercios(seleccion1,valor_int));
            mostraResultadoF.setText(resultado);
            System.out.print(resultado);
        }
        else if(seleccion1.equals("Megahercio") && seleccion2.equals("Kilohercio")){
            double x = convertirAHercios(seleccion1,valor_int);
            x = convertirHercioAOtros(seleccion2,x);
            String resultado = String.valueOf(x);
            mostraResultadoF.setText(resultado);

        }
        else if(seleccion1.equals("Megahercio") && seleccion2.equals("Gigahercio")){
            double x = convertirAHercios(seleccion1,valor_int);
            x = convertirHercioAOtros(seleccion2,x);
            String resultado = String.valueOf(x);
            mostraResultadoF.setText(resultado);

        }
        //--------------------------------------------------------------4
        else if(seleccion1.equals("Gigahercio") && seleccion2.equals("Hercio")){
            String resultado = String.valueOf(convertirAHercios(seleccion1,valor_int));
            mostraResultadoF.setText(resultado);
        }
        else if(seleccion1.equals("Gigahercio") && seleccion2.equals("Megahercio")){
            double x = convertirAHercios(seleccion1,valor_int);
            x = convertirHercioAOtros(seleccion2,x);
            String resultado = String.valueOf(x);
            mostraResultadoF.setText(resultado);
            System.out.print(resultado);
        }
        else if(seleccion1.equals("Gigahercio") && seleccion2.equals("Kilohercio")){
            double x = convertirAHercios(seleccion1,valor_int);
            x = convertirHercioAOtros(seleccion2,x);
            String resultado = String.valueOf(x);
            mostraResultadoF.setText(resultado);
            System.out.print(resultado);
        }
    }
}
