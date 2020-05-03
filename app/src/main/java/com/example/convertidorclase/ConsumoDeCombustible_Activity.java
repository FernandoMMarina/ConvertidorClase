package com.example.convertidorclase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ConsumoDeCombustible_Activity extends AppCompatActivity {

    private Spinner convertirDeSP;
    private Spinner convertirASP;
    private EditText ingresoCC;
    private TextView mostrarRestulado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumo_de_combustible_);
        convertirDeSP = (Spinner)findViewById(R.id.spinnerConvertirDeCC);
        convertirASP  = (Spinner)findViewById(R.id.spinnerConvertirACC);
        ingresoCC = (EditText)findViewById(R.id.ingresoCC);
        mostrarRestulado = (TextView)findViewById(R.id.mostrarResultadoCC);

        String[] opciones ={"Milla por galon Americano","Milla por galon(Imperial)","Kilometro por litro","Litro por 100 Kilometros"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this ,android.R.layout.simple_spinner_item,opciones);
        convertirDeSP.setAdapter(adapter);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opciones);
        convertirASP.setAdapter(adapter1);
    }
    public void Calcular (View view){
        String valor_ingresado = ingresoCC.getText().toString();
        int valor_int = Integer.parseInt(valor_ingresado);

        String seleccion1 = convertirDeSP.getSelectedItem().toString();
        String seleccion2 = convertirASP.getSelectedItem().toString();
        if(valor_ingresado.isEmpty()==false) {
            if (seleccion1.equals("Milla por galon Americano") && seleccion2.equals("Milla por galon(Imperial)")) {
                double conversion = valor_int * 1.201;
                String resultado = String.valueOf(conversion);
                mostrarRestulado.setText(resultado);
            } else if (seleccion1.equals("Milla por galon Americano") && seleccion2.equals("Kilometro por litro")) {
                double conversion = valor_int / 2.352;
                String resultado = String.valueOf(conversion);
                mostrarRestulado.setText(resultado);
            } else if (seleccion1.equals("Milla por galon Americano") && seleccion2.equals("Litro por 100 Kilometros")) {
                double conversion = 235.215 / (valor_int);
                String resultado = String.valueOf(conversion);
                mostrarRestulado.setText(resultado);
            }
            //-------------------------------------
            else if (seleccion1.equals("Milla por galon(Imperial)") && seleccion2.equals("Milla por galon Americano")) {
                double conversion = valor_int / 1.201;
                String resultado = String.valueOf(conversion);
                mostrarRestulado.setText(resultado);
            } else if (seleccion1.equals("Milla por galon(Imperial)") && seleccion2.equals("Kilometro por litro")) {
                double conversion = valor_int / 2.825;
                String resultado = String.valueOf(conversion);
                mostrarRestulado.setText(resultado);
            } else if (seleccion1.equals("Milla por galon(Imperial)") && seleccion2.equals("Litro por 100 Kilometros")) {
                double conversion = 282.481 / (valor_int);
                String resultado = String.valueOf(conversion);
                mostrarRestulado.setText(resultado);
            }
            //---------------------------------------
            else if (seleccion1.equals("Kilometro por litro") && seleccion2.equals("Milla por galon Americano")) {
                double conversion = valor_int * 2.352;
                String resultado = String.valueOf(conversion);
                mostrarRestulado.setText(resultado);
            } else if (seleccion1.equals("Kilometro por litro") && seleccion2.equals("Milla por galon(Imperial)")) {
                double conversion = valor_int * 2.825;
                String resultado = String.valueOf(conversion);
                mostrarRestulado.setText(resultado);
            } else if (seleccion1.equals("Kilometro por litro") && seleccion2.equals("Litro por 100 Kilometros")) {
                double conversion = 100 / (valor_int);
                String resultado = String.valueOf(conversion);
                mostrarRestulado.setText(resultado);
            }
            //-------------------------
            else if (seleccion1.equals("Litro por 100 Kilometros") && seleccion2.equals("Milla por galon Americano")) {
                double conversion = (235.215 / (valor_int / 100));
                String resultado = String.valueOf(conversion);
                mostrarRestulado.setText(resultado);
            } else if (seleccion1.equals("Litro por 100 Kilometros") && seleccion2.equals("Milla por galon(Imperial)")) {
                double conversion = 282.481 / (valor_int / 100);
                String resultado = String.valueOf(conversion);
                mostrarRestulado.setText(resultado);
            } else if (seleccion1.equals("Litro por 100 Kilometros") && seleccion2.equals("Kilometro por litro")) {
                double conversion = 100 / (valor_int / 100);
                String resultado = String.valueOf(conversion);
                mostrarRestulado.setText(resultado);
            }
        }
        else {
            Toast.makeText(getApplicationContext(),"Ingrese datos",Toast.LENGTH_SHORT);
        }
    }
}
