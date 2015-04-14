package com.vendelo.rofrel.appvendelo;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener {

    TextView correo,password ;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        correo = (TextView) findViewById(R.id.editText_correo);
        password = (TextView) findViewById(R.id.editText2_password);
        View boton = findViewById(R.id.button_ingresar);
        boton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == findViewById(R.id.button_ingresar).getId() ){
            correo.getText().toString();
            password.getText().toString();

            Intent login = new Intent();

            login.putExtra("correo", correo.getText().toString() );
            login.putExtra("password", password.getText().toString() );
            login.setClass(MainActivity.this, Pagehome.class);
            startActivity(login);

        }
    }
}
