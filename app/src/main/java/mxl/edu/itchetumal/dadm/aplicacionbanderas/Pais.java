package mxl.edu.itchetumal.dadm.aplicacionbanderas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Pais extends BaseAdapter{

    private Integer[] Banderas = {
            R.drawable.francia,
            R.drawable.inglaterra,
            R.drawable.venezuela,
            R.drawable.mexico,
            R.drawable.suecia,
            R.drawable.alemania,
            R.drawable.usa,
            R.drawable.polonia,
            R.drawable.coreasur,
            R.drawable.italia,
    };

    private String [] Paises;
    private String [] Dominio;
    private Context context;
    private LayoutInflater thisInflater;

    public Pais(Context con, String[] Nombre, String[] Dominio) {
        this.context = con;
        this.thisInflater = LayoutInflater.from(con);
        this.Paises = Nombre;
        this.Dominio = Dominio;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if (convertView == null){
            convertView = thisInflater.inflate(R.layout.lista_paises, parent, false);

            TextView lblNombre = (TextView)convertView.findViewById(R.id.lblNombre);
            TextView lblDominio = (TextView)convertView.findViewById(R.id.lblDominio);
            ImageView imgBand = (ImageView) convertView.findViewById(R.id.imgBandera);

            lblNombre.setText(Paises[position]);
            lblDominio.setText(Dominio[position]);
            imgBand.setImageResource(Banderas[position]);
        }
        return convertView;
    }
    @Override
    public int getCount() {

        return Banderas.length;
    }

    @Override
    public Object getItem(int position) {

        return position;
    }

    @Override
    public long getItemId(int position) {

        return position;
    }
}