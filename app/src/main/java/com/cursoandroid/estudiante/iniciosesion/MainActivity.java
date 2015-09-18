package com.cursoandroid.estudiante.iniciosesion;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    EditText usuario,pass;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario=(EditText)findViewById(R.id.etUsuario);
        pass=(EditText)findViewById(R.id.etPass);
    }

    /**
     * Esta función permite verificar el usuario y contraseña
     * y iniciar otra acitividad
     * @param view recibe la vista del boton
     */
    public void iniciar (View view){
        String usuarioC="usuario",passC="123456";
        if(usuario.getText().toString().equals(usuarioC)){
            if (pass.getText().toString().equals(passC)){

                //Creacion de una intencion Explicita
                //Nueva Actividad
                Intent intent=new Intent(getApplicationContext(),
                        Actividad2.class);

                //Agregar un extra a la intencion
                intent.putExtra("usuario",usuario.getText().toString());

                //Iniciar Actividad
                startActivity(intent);

            }
            else {
                Toast.makeText(getApplicationContext(),
                        "Error en la contraseña"
                        ,Toast.LENGTH_SHORT).show();
                Log.i("Contraseña",pass.getText().toString());
            }
        }
        else {
            Toast.makeText(getApplicationContext(),
                    "Error en el usuario"
                    ,Toast.LENGTH_SHORT).show();
            Log.i("Usuario", usuario.getText().toString());
        }
    }
}
