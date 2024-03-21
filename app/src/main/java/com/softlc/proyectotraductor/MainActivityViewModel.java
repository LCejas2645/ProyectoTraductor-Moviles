package com.softlc.proyectotraductor;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivityViewModel extends ViewModel {
    private List<Palabra> listaPalabras;

    public MainActivityViewModel() {
        listaPalabras = new ArrayList<Palabra>() {{
            add(new Palabra("casa", "House", R.drawable.casa));
            add(new Palabra("perro", "Dog", R.drawable.perro));
            add(new Palabra("arbol", "Tree", R.drawable.arbol));
            add(new Palabra("gato", "Cat", R.drawable.gato));
            add(new Palabra("ventana", "Window", R.drawable.ventana));
            add(new Palabra("auto", "Car", R.drawable.auto));
        }};
    }

    public Palabra buscarPalabra(String palabraEspañol) {
        for (Palabra palabra : listaPalabras) {
            if (palabra.getPalabraEspañol().equalsIgnoreCase(palabraEspañol)) {
                return palabra;
            }
        }
        return new Palabra("","Palabra no encontrada",R.drawable.error);
    }
}
