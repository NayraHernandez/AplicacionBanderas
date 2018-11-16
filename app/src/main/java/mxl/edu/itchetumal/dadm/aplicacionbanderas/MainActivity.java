package mxl.edu.itchetumal.dadm.aplicacionbanderas;
import android.content.Context;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    private Pais[] datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<CharSequence> adaptadorPaises = ArrayAdapter.createFromResource(this,
                R.array.array_paises,
                android.R.layout.simple_spinner_item);

        Spinner spPaises = (Spinner) findViewById(R.id.cmbPaises);

        adaptadorPaises.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);

        spPaises.setAdapter(adaptadorPaises);

        ArrayAdapter<CharSequence> adaptadorListaPaises =
                ArrayAdapter.createFromResource(this,
                        R.array.array_dominiopaises,
                        android.R.layout.simple_list_item_checked);

        ListView lstNombresPaises = (ListView) findViewById(R.id.lstPaises);

        lstNombresPaises.setAdapter(adaptadorListaPaises);
        spPaises.setAdapter(adaptadorPaises);

        ArrayAdapter<CharSequence> adaptadorListaPaises = android.R.layout.simple_list_item_1;

       // Pais miPais= new Pais (R.drawable.mexico, "México",".mx");
        datos = new Pais[] {new Pais (R.drawable.mexico, "México",".mx"),
                new Pais (R.drawable.francia, "Francia",".fr")
                new Pais (R.drawable.alemania, "Alemania",".de")};


                AdaptadorPaises adaptador = new AdaptadorPaises(this);
                ListView lstNombresPaises = (ListView) findViewById(R.id.lstPaises);
                lstNombresPaises.setAdapter(adaptadorListaPaises);
                lstNombresPaises.setAdapter(adaptador);
                lstNombresPaises.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        // Get the selected item text from ListView
                        String selectedItem = (String) parent.getItemAtPosition(position);
                        // Display the selected item text on TextView
                        Toast.makeText(getBaseContext(),"Your favorite : " + selectedItem, Toast.LENGTH_LONG).show();
                    }
        });
    }

    class AdaptadorPaises extends ArrayAdapter <Pais>{

        public AdaptadorPaises (Context context){
            super (context, R.layout.lista_paises, datos);
        }
        public View getView(int position, View convertView, ViewGroup parent){
            LayoutInflater = inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate (R.layout.lista_paises, null);
        }
    }

}

