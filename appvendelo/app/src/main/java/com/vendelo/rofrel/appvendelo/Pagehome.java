package com.vendelo.rofrel.appvendelo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class Pagehome extends Activity implements OnClickListener {

    TextView mensage ;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagehome);
        Bundle datos = this.getIntent().getExtras();
        String correohome = datos.getString("correo");
        String passwordhome = datos.getString("password");

        View btn_auto = findViewById(R.id.imageButton_autos);
      /*  View btn_moto = findViewById(R.id.imageButton2_motos);
        View btn_inmueble = findViewById(R.id.imageButton3_inmuebles);*/

    }


    @Override
    public void onClick(View v) {
        if (v.getId() == findViewById(R.id.imageButton_autos).getId() ){

            Intent intent_moto = new Intent();

            intent_moto.putExtra("moto", "motoin" );
            intent_moto.setClass(Pagehome.this, Pagemoto.class);
            startActivity(intent_moto);

        }
    }
}
