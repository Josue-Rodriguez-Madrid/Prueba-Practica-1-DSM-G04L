package com.aj.evalucacin1programa2;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    private Button btnborrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
        tv3=(TextView)findViewById(R.id.tv3);
        tv4=(TextView)findViewById(R.id.tv4);
        tv5=(TextView)findViewById(R.id.tv5);
        tv6=(TextView)findViewById(R.id.tv6);
        btnborrar=(Button)findViewById(R.id.btnborrar);

        btnborrar.setOnClickListener( new  View.OnClickListener(){
            @Override
            public void onClick(View view) {
                et1.setText("");
                tv1.setText("");
                tv2.setText("");
                tv3.setText("");
                tv4.setText("");
                tv5.setText("");
                tv6.setText("");
            }

        });
    }

    public void seno(View view) {
        String valor1=et1.getText().toString();

        double nro1=Integer.parseInt(valor1);

        double senog=Math.sin(nro1);
        String resu=String.valueOf(senog);
        tv1.setText(resu);

        double senor=Math.PI/180*senog;
        String resu1=String.valueOf(senor);
        tv2.setText(resu1);
    }
    public void coseno(View view) {
        String valor1=et1.getText().toString();

        double nro1=Integer.parseInt(valor1);

        double cosenog=Math.cos(nro1);
        String resu2=String.valueOf(cosenog);
        tv3.setText(resu2);

        double cosenor=Math.PI/180*cosenog;
        String resu3=String.valueOf(cosenor);
        tv4.setText(resu3);
    }
    public void logaritmo(View view) {
        String valor1 = et1.getText().toString();

        double nro1 = Integer.parseInt(valor1);

        double logn = Math.log(nro1);
        String resu4 = String.valueOf(logn);
        tv5.setText(resu4);

    }
    public void raiz(View view) {
        String valor1 = et1.getText().toString();

        double nro1 = Integer.parseInt(valor1);

        double raizcuad = Math.sqrt(nro1);
        String resu5 = String.valueOf(raizcuad);
        tv6.setText(resu5);

    }
}