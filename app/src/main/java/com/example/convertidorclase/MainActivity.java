package com.example.convertidorclase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView energiaBT;
    private TextView consumo_de_combustibleBT;
    private TextView frecuenciaBT;
    private TextView longitudBT;
    private TextView areaBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        energiaBT                   =(TextView)findViewById(R.id.energiaBT);
        consumo_de_combustibleBT    =(TextView)findViewById(R.id.consumoDeCombustibleBT);
        frecuenciaBT                =(TextView)findViewById(R.id.frecuenciaBT);
        longitudBT                  =(TextView)findViewById(R.id.longitudBT);
        areaBt                      =(TextView)findViewById(R.id.areaBT);
    }
    public void activity_energia (View view){
        Intent lanzarActivityEnergia = new Intent(view.getContext(),Energia_Activity.class);
        startActivity(lanzarActivityEnergia);
    }
    public void activity_consumo_combustible (View view){
        Intent lanzarActivityConsumoCombustible = new Intent(view.getContext(),ConsumoDeCombustible_Activity.class);
        startActivity(lanzarActivityConsumoCombustible);
    }
    public void activity_frecuencia (View view){
        Intent lanzarActivityFrecuencia = new Intent(view.getContext(),Frecuencia_Activity.class);
        startActivity(lanzarActivityFrecuencia);
    }
    public void activity_longitud (View view){
        Intent lanzarActivityLongitud = new Intent(view.getContext(),Longitud_Activity.class);
        startActivity(lanzarActivityLongitud);
    }
    public void activity_codigomorse (View view){
        Intent lanzarActivityCodigoMorse = new Intent(view.getContext(),Codigomorse_Activity.class);
        startActivity(lanzarActivityCodigoMorse);
    }
    public void activity_area (View view){
        Intent lanzarActivityArea = new Intent(view.getContext(),area_Activity.class);
        startActivity(lanzarActivityArea);
    }
}
