package com.example.convertidorclase;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Codigomorse_Activity extends AppCompatActivity {

    private EditText ingresoET;
    private Spinner spinnerCM;
    private TextView startBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codigomorse_);
        ingresoET = (EditText)findViewById(R.id.ingresoET);
        spinnerCM   = (Spinner)findViewById(R.id.spinnerCodigoMorse);
        startBT   = (TextView) findViewById(R.id.startBT);
        //Opciones de tiempo
        String[] opciones ={"1 Repeticion","5 Repeticiones","10 Repeticiones"};
        //Setear opciones en Spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this ,android.R.layout.simple_spinner_item,opciones);
        spinnerCM.setAdapter(adapter);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void start (View view) throws CameraAccessException, InterruptedException {
        String valor_ingresado = ingresoET.getText().toString();
        char[] l = valor_ingresado.toCharArray();

        String seleccion1 = spinnerCM.getSelectedItem().toString();
        if(seleccion1.equals("1 Repeticion")){
            for(int j=0;j<1;j++){
                for (int i=0;i<l.length;i++){
                    String f = Character.toString(l[i]);
                    System.out.println(""+f);
                    if     (f.equals("a")||(f.equals("A"))){
                    CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                    String cameraId = camManager.getCameraIdList()[0];
                    //PUNTO
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(200);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                    //RAYA
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(600);
                    // TERMINA APAGANDO EL FLASH
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                }
                         else if(f.equals("b")||(f.equals("B"))){
                    CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                    String cameraId = camManager.getCameraIdList()[0];
                    //RAYA
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(600);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                    //PUNTO
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(200);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                    //PUNTO
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(200);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                    //PUNTO
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(200);
                }
                         else if(f.equals("c")||(f.equals("C"))){
                    CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                    String cameraId = camManager.getCameraIdList()[0];
                    //RAYA
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(600);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                    //PUNTO
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(200);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                    //RAYA
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(600);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                    //PUNTO
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(200);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                }
                         else if(f.equals("d")||(f.equals("D"))){
                    CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                    String cameraId = camManager.getCameraIdList()[0];
                    //RAYA
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(600);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                    //PUNTO
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(200);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                    //PUNTO
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(200);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                }
                         else if(f.equals("e")||(f.equals("E"))){
                    CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                    String cameraId = camManager.getCameraIdList()[0];
                    //PUNTO
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(200);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);

                }
                         else if(f.equals("f")||(f.equals("F"))){
                    CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                    String cameraId = camManager.getCameraIdList()[0];
                    //PUNTO
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(200);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                    //PUNTO
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(200);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                    //RAYA
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(600);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                    //PUNTO
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(200);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                }
                         else if(f.equals("g")||(f.equals("G"))){
                    CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                    String cameraId = camManager.getCameraIdList()[0];
                    //RAYA
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(600);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                    //RAYA
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(600);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                    //PUNTO
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(200);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                }
                         else if(f.equals("h")||(f.equals("H"))){
                    CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                    String cameraId = camManager.getCameraIdList()[0];
                    //PUNTO
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(200);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                    //PUNTO
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(200);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                    //PUNTO
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(200);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                    //PUNTO
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(200);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                }
                         else if(f.equals("i")||(f.equals("I"))){
                    CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                    String cameraId = camManager.getCameraIdList()[0];
                    //PUNTO
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(200);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                    //PUNTO
                    camManager.setTorchMode(cameraId,true);
                    Thread.sleep(200);
                    // TIEMPO MUERTO
                    camManager.setTorchMode(cameraId,false);
                    Thread.sleep(150);
                }
                         else if(f.equals("j")||(f.equals("J"))){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if(f.equals("k")||(f.equals("K"))){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if(f.equals("l")||(f.equals("L"))){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if(f.equals("m")||(f.equals("M"))){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                            }
                         else if(f.equals("n")||(f.equals("N"))){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);

                            }
                         else if(f.equals("ñ")||(f.equals("Ñ"))){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if(f.equals("o")||(f.equals("O"))){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if(f.equals("p")||(f.equals("P"))){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);

                            }
                         else if(f.equals("q")||(f.equals("Q"))){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if(f.equals("r")||(f.equals("R"))){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if(f.equals("s")||(f.equals("S"))){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if(f.equals("t")||(f.equals("T"))){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if(f.equals("u")||(f.equals("U"))){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if(f.equals("v")||(f.equals("V"))){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if(f.equals("w")||(f.equals("W"))) {
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if(f.equals("x")||(f.equals("X"))) {
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if(f.equals("y")||(f.equals("Y"))) {
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if(f.equals("z")||(f.equals("Z"))) {
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if(f.equals(" ")) {
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if(f.equals("0")){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if (f.equals("1")){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if (f.equals("2")){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if (f.equals("3")){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if (f.equals("4")){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if (f.equals("5")){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if (f.equals("6")){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if (f.equals("7")){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if (f.equals("8")){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if (f.equals("9")){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if(f.equals(".")){
                                CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                                String cameraId = camManager.getCameraIdList()[0];
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //PUNTO
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(200);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                                //RAYA
                                camManager.setTorchMode(cameraId,true);
                                Thread.sleep(600);
                                // TIEMPO MUERTO
                                camManager.setTorchMode(cameraId,false);
                                Thread.sleep(150);
                            }
                         else if(f.equals(",")){

                            }
                            else if(f.equals("?")){

                            }
                            else if (f.equals("!")){

                            }

                            else if(f.equals(null)){
                                Toast.makeText(this,"Ingrese un mensaje",Toast.LENGTH_LONG).show();
                            }
                        }
                }
                        Toast.makeText(this," Termino el mensaje",Toast.LENGTH_LONG).show();
        }
        else if (seleccion1.equals("5 Repeticiones")) {
            if (valor_ingresado==null) {
                Toast.makeText(this, "Ingrese un mensaje", Toast.LENGTH_LONG).show();
            }
            else {
                for (int j = 0; j < 5; j++) {
                    for (int i = 0; i < l.length; i++) {
                        String f = Character.toString(l[i]);
                        System.out.println("" + f);
                        if (f.equals("a") || (f.equals("A"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TERMINA APAGANDO EL FLASH
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("b") || (f.equals("B"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                        } else if (f.equals("c") || (f.equals("C"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("d") || (f.equals("D"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("e") || (f.equals("E"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);

                        } else if (f.equals("f") || (f.equals("F"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("g") || (f.equals("G"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("h") || (f.equals("H"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("i") || (f.equals("I"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("j") || (f.equals("J"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("k") || (f.equals("K"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("l") || (f.equals("L"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("m") || (f.equals("M"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                        } else if (f.equals("n") || (f.equals("N"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);

                        } else if (f.equals("ñ") || (f.equals("Ñ"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("o") || (f.equals("O"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("p") || (f.equals("P"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);

                        } else if (f.equals("q") || (f.equals("Q"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("r") || (f.equals("R"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("s") || (f.equals("S"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("t") || (f.equals("T"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("u") || (f.equals("U"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("v") || (f.equals("V"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("w") || (f.equals("W"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("x") || (f.equals("X"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("y") || (f.equals("Y"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("z") || (f.equals("Z"))) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals(" ")) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("0")) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("1")) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("2")) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("3")) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("4")) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("5")) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("6")) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("7")) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("8")) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals("9")) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals(".")) {
                            CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                            String cameraId = camManager.getCameraIdList()[0];
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //PUNTO
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(200);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                            //RAYA
                            camManager.setTorchMode(cameraId, true);
                            Thread.sleep(600);
                            // TIEMPO MUERTO
                            camManager.setTorchMode(cameraId, false);
                            Thread.sleep(150);
                        } else if (f.equals(",")) {
                        } else if (f.equals("?")) {
                        } else if (f.equals("!")) {
                        }
                    }
                }
                Toast.makeText(this, " Termino el mensaje", Toast.LENGTH_LONG).show();
            }
        }
        else if(seleccion1.equals("10 Repeticiones")){
            for(int j=0;j<10;j++){
                for (int i=0;i<l.length;i++){
                    String f = Character.toString(l[i]);
                    System.out.println(""+f);
                    if     (f.equals("a")||(f.equals("A"))){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TERMINA APAGANDO EL FLASH
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals("b")||(f.equals("B"))){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                    }
                    else if(f.equals("c")||(f.equals("C"))){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals("d")||(f.equals("D"))){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals("e")||(f.equals("E"))){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);

                    }
                    else if(f.equals("f")||(f.equals("F"))){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals("g")||(f.equals("G"))){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals("h")||(f.equals("H"))){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals("i")||(f.equals("I"))){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals("j")||(f.equals("J"))){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals("k")||(f.equals("K"))){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals("l")||(f.equals("L"))){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals("m")||(f.equals("M"))){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                    }
                    else if(f.equals("n")||(f.equals("N"))){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);

                    }
                    else if(f.equals("ñ")||(f.equals("Ñ"))){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals("o")||(f.equals("O"))){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals("p")||(f.equals("P"))){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);

                    }
                    else if(f.equals("q")||(f.equals("Q"))){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals("r")||(f.equals("R"))){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals("s")||(f.equals("S"))){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals("t")||(f.equals("T"))){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals("u")||(f.equals("U"))){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals("v")||(f.equals("V"))){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals("w")||(f.equals("W"))) {
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals("x")||(f.equals("X"))) {
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals("y")||(f.equals("Y"))) {
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals("z")||(f.equals("Z"))) {
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals(" ")) {
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals("0")){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if (f.equals("1")){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if (f.equals("2")){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if (f.equals("3")){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if (f.equals("4")){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if (f.equals("5")){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if (f.equals("6")){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if (f.equals("7")){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if (f.equals("8")){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if (f.equals("9")){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals(".")){
                        CameraManager camManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                        String cameraId = camManager.getCameraIdList()[0];
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //PUNTO
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(200);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                        //RAYA
                        camManager.setTorchMode(cameraId,true);
                        Thread.sleep(600);
                        // TIEMPO MUERTO
                        camManager.setTorchMode(cameraId,false);
                        Thread.sleep(150);
                    }
                    else if(f.equals(",")){

                    }
                    else if(f.equals("?")){

                    }
                    else if (f.equals("!")){

                    }

                    else if(f.equals(null)){
                        Toast.makeText(this,"Ingrese un mensaje",Toast.LENGTH_LONG).show();
                    }
                }
            }
            Toast.makeText(this," Termino el mensaje",Toast.LENGTH_LONG).show();
        }
    }
}
