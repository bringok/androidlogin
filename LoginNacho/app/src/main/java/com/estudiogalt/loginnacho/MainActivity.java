package com.estudiogalt.loginnacho;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void BotonEntrar(View V){

        TextView Tusuario = (TextView) findViewById(R.id.editText);
        String usuario = Tusuario.getText().toString();

        TextView Tpass = (TextView) findViewById(R.id.editText2);
        String pass = Tpass.getText().toString();

        if (usuario.equals("root") && pass.equals("root")){
            //pantalla de éxito
            TextView mensaje = (TextView) findViewById(R.id.textView);
            mensaje.setText("Éxito!");
            Intent i = new Intent(this, Exito.class);
            startActivity(i);
        }
        else if (usuario.equals("")){
            //pantalla de usuario vacío
            TextView mensaje = (TextView) findViewById(R.id.textView);
            mensaje.setText("Por favor complete el campo de usuario");
            //consultar sobre setVisibility e invisible visibility
        }
        else if (pass.equals("")){
            //pantalla de pass vacío
            TextView mensaje = (TextView) findViewById(R.id.textView);
            mensaje.setText("Por favor complete el campo de contraseña");
        }
        else{
            //pantalla de usuario o pass inválidos
            TextView mensaje = (TextView) findViewById(R.id.textView);
            mensaje.setText("El usuario o la contraseña ingresados son inválidos");
        }


    }
}
