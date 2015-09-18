package com.cursoandroid.estudiante.iniciosesion;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by estudiante on 18/09/15.
 */
public class Actividad2 extends Activity {

    TextView nomnbre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activida2);
        Bundle extras=getIntent().getExtras();
        nomnbre=(TextView)findViewById(R.id.tvNombre);
        nomnbre.setText("Binvenido "+extras.getString("usuario"));
    }
}
