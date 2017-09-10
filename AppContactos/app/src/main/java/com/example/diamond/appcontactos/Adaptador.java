package com.example.diamond.appcontactos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Diamond on 07/09/2017.
 */

public class Adaptador extends BaseAdapter {
    Contacto[] contactos;
    Context context;

    public Adaptador(Contacto[] contactos) {

    }

    public Adaptador(MainActivity mainActivity, Contacto[] listaContactos) {

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view1= convertView;
        if(convertView==null){
            LayoutInflater infl = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view1 = infl.inflate(R.layout.item_lista, null);
        }

        TextView nombre = view1.findViewById(R.id.textView7);
        nombre.setText(contactos[position].getNombre().toString());
        TextView email = view1.findViewById(R.id.textView8);
        email.setText(contactos[position].getEmail().toString());

        return view1;
    }
}
