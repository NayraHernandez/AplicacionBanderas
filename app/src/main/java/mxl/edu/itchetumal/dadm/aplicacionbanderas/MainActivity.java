package mxl.edu.itchetumal.dadm.aplicacionbanderas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.content.res.Resources;

public class MainActivity extends AppCompatActivity {

    String[] Paises;
    String[] Dominios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        //Llamar los recursos de los arreglos
        Paises = res.getStringArray(R.array.array_paises);
        Dominios = res.getStringArray(R.array.array_dominiopaises);

        ListView lstNombresPaises = (ListView) findViewById(R.id.lstPaises);
        Pais myAdapter = new Pais(getApplicationContext(), Paises, Dominios);
        lstNombresPaises.setAdapter(myAdapter);


    }
}


