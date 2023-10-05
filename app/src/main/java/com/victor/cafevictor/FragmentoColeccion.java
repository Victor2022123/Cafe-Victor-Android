package com.victor.cafevictor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FragmentoColeccion extends Fragment {
    /**
     * Esta implementacion es similar a la de Ficha de Evaluacion 6 - Proyecto Fragmentos.
     * Se agrega el evento setOnClickListener para cada boton del fragmento_menu.xml.
     */
    View view;
    Button botonMenuUno;
    Button botonMenuDos;
    Button botonMenuTres;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmento_coleccion, container, false);
//        Boton Uno
        botonMenuUno = (Button) view.findViewById(R.id.btnMenuUno);
        botonMenuUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Cafe Danche... agregado a la Suscripcion", Toast.LENGTH_SHORT).show();
            }
        });

//        Boton Dos
        botonMenuDos = (Button) view.findViewById(R.id.btnMenuDos);
        botonMenuDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Cafe Gran Expresso... a la Suscripcion", Toast.LENGTH_SHORT).show();
            }
        });

//        Boton Tres
        botonMenuTres = (Button) view.findViewById(R.id.btnMenuTres);
        botonMenuTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Cafe Picollo... a la Suscripcion", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
