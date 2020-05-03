package com.example.convertidorclase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Energia_Activity extends AppCompatActivity {

    private EditText  ingreso;
    private Spinner  convertirDeSP;
    private Spinner  convertirASP;
    private TextView mostrarResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energia_);
        convertirDeSP       =(Spinner)findViewById(R.id.spinnerConvertiDe);
        convertirASP        =(Spinner)findViewById(R.id.spinnerConvertirA);
        ingreso             =(EditText)findViewById(R.id.ingresoEnergia);
        mostrarResultado    =(TextView)findViewById(R.id.mostrarResultado);

        //Opciones de conversion
        String[] opciones ={"Julio","Kilojoule","Caloria-gramo","Kilocaloria","Vatio-hora","Kilovatio-hora","Electronvoltio","BTU","Termia(US)","Pie-libra fuerza"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this ,android.R.layout.simple_spinner_item,opciones);
        convertirDeSP.setAdapter(adapter);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opciones);
        convertirASP.setAdapter(adapter1);

    }
        //Metodo para calcular la conversion
        public void CalcularEnergia(View view) {
            String valor_ingresado = ingreso.getText().toString();
            double valor_int = Double.parseDouble(valor_ingresado);

            String seleccion1 = convertirDeSP.getSelectedItem().toString();
            String seleccion2 = convertirASP.getSelectedItem().toString();
                //------------------------------------------------- 1
                if (seleccion1.equals("Julio") && seleccion2.equals("Kilojoule")) {
                    double conversion = valor_int / 1000;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Julio") && seleccion2.equals("Caloria-gramo")) {
                    double conversion = valor_int / 4.184;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Julio") && seleccion2.equals("Kilocaloria")) {
                    double conversion = valor_int / 4184;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Julio") && seleccion2.equals("Vatio-hora")) {
                    double conversion = valor_int / 3600;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Julio") && seleccion2.equals("Kilovatio-hora")) {
                    double conversion = valor_int / (Math.exp(3.6) + 6);
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Julio") && seleccion2.equals("Electronvoltio")) {
                    double conversion = valor_int * (Math.exp(6.24) + 18);
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Julio") && seleccion2.equals("BTU")) {
                    double conversion = valor_int / 1055;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Julio") && seleccion2.equals("Termia(US)")) {
                    double conversion = valor_int / (Math.exp(1.055) + 8);
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Julio") && seleccion2.equals("Pie-libra fuerza")) {
                    double conversion = valor_int / 1.356;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                }
                //-------------------------------------------------------------------------- 2
                else if (seleccion1.equals("Kilojoule") && seleccion2.equals("Joule")) {
                    double conversion = valor_int * 1000;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilojoule") && seleccion2.equals("Caloria-gramo")) {
                    double conversion = valor_int * 239;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilojoule") && seleccion2.equals("Kilocaloria")) {
                    double conversion = valor_int / 4.184;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilojoule") && seleccion2.equals("Vatio-hora")) {
                    double conversion = valor_int / 3.6;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilojoule") && seleccion2.equals("Kilovatio-hora")) {
                    double conversion = valor_int / 3600;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilojoule") && seleccion2.equals("Electronvoltio")) {
                    double conversion = valor_int * (Math.exp(9.223) + 18);
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilojoule") && seleccion2.equals("BTU")) {
                    double conversion = valor_int / 1.055;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilojoule") && seleccion2.equals("Termia(US)")) {
                    double conversion = valor_int / 105480;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilojoule") && seleccion2.equals("Pie-libra fuerza")) {
                    double conversion = valor_int * 738;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                }
                //-------------------------------------------------------------------------- 3
                else if (seleccion1.equals("Caloria-gramo") && seleccion2.equals("Joule")) {
                    double conversion = valor_int * 4.184;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Caloria-gramo") && seleccion2.equals("Kilojoule")) {
                    double conversion = valor_int / 239;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Caloria-gramo") && seleccion2.equals("Kilocaloria")) {
                    double conversion = valor_int / 1000;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Caloria-gramo") && seleccion2.equals("Vatio-hora")) {
                    double conversion = valor_int / 860;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Caloria-gramo") && seleccion2.equals("Kilovatio-hora")) {
                    double conversion = valor_int / 860421;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Caloria-gramo") && seleccion2.equals("Electronvoltio")) {
                    double conversion = valor_int * (Math.exp(9.223) + 18);
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Caloria-gramo") && seleccion2.equals("BTU")) {
                    double conversion = valor_int / 252;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Caloria-gramo") && seleccion2.equals("Termia(US)")) {
                    double conversion = valor_int / (Math.exp(2.521) + 7);
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Caloria-gramo") && seleccion2.equals("Pie-libra fuerza")) {
                    double conversion = valor_int * 3.086;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                }
                //-------------------------------------------------------------------------- 4
                else if (seleccion1.equals("Kilocaloria") && seleccion2.equals("Joule")) {
                    double conversion = valor_int * 4184;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilocaloria") && seleccion2.equals("Kilojoule")) {
                    double conversion = valor_int / 4.184;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilocaloria") && seleccion2.equals("Caloria-gramo")) {
                    double conversion = valor_int * 1000;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilocaloria") && seleccion2.equals("Vatio-hora")) {
                    double conversion = valor_int * 1.162;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilocaloria") && seleccion2.equals("Kilovatio-hora")) {
                    double conversion = valor_int / 860;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilocaloria") && seleccion2.equals("Electronvoltio")) {
                    double conversion = valor_int * (Math.exp(9.223) + 18);
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilocaloria") && seleccion2.equals("BTU")) {
                    double conversion = valor_int * 3.966;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilocaloria") && seleccion2.equals("Termia(US)")) {
                    double conversion = valor_int / 25210;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilocaloria") && seleccion2.equals("Pie-libra fuerza")) {
                    double conversion = valor_int * 3086;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                }
                //-------------------------------------------------------------------------- 5
                else if (seleccion1.equals("Vatio-hora") && seleccion2.equals("Joule")) {
                    double conversion = valor_int * 3600;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Vatio-hora") && seleccion2.equals("Kilojoule")) {
                    double conversion = valor_int / 3.6;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Vatio-hora") && seleccion2.equals("Caloria-gramo")) {
                    double conversion = valor_int * 860;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Vatio-hora") && seleccion2.equals("Kilocaloria")) {
                    double conversion = valor_int * 1.162;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Vatio-hora") && seleccion2.equals("Kilovatio-hora")) {
                    double conversion = valor_int / 1000;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Vatio-hora") && seleccion2.equals("Electronvoltio")) {
                    double conversion = valor_int * (Math.exp(9.223) + 18);
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Vatio-hora") && seleccion2.equals("BTU")) {
                    double conversion = valor_int * 3.412;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Vatio-hora") && seleccion2.equals("Termia(US)")) {
                    double conversion = valor_int / 29300;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Vatio-hora") && seleccion2.equals("Pie-libra fuerza")) {
                    double conversion = valor_int * 2655;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                }
                //-------------------------------------------------------------------------- 6
                else if (seleccion1.equals("Kilovatio-hora") && seleccion2.equals("Joule")) {
                    double conversion = valor_int * 3600;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilovatio-hora") && seleccion2.equals("Kilojoule")) {
                    double conversion = valor_int / 3.6;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilovatio-hora") && seleccion2.equals("Caloria-gramo")) {
                    double conversion = valor_int * 860;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilovatio-hora") && seleccion2.equals("Kilocaloria")) {
                    double conversion = valor_int * 1.162;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilovatio-hora") && seleccion2.equals("Vatio-hora")) {
                    double conversion = valor_int / 1000;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilovatio-hora") && seleccion2.equals("Electronvoltio")) {
                    double conversion = valor_int * (Math.exp(9.223) + 18);
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilovatio-hora") && seleccion2.equals("BTU")) {
                    double conversion = valor_int * 3.412;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilovatio-hora") && seleccion2.equals("Termia(US)")) {
                    double conversion = valor_int / 29300;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                } else if (seleccion1.equals("Kilovatio-hora") && seleccion2.equals("Pie-libra fuerza")) {
                    double conversion = valor_int * 2655;
                    String resultado = String.valueOf(conversion);
                    mostrarResultado.setText(resultado);
                }


    }
}
