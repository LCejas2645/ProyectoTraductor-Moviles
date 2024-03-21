package com.softlc.proyectotraductor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SegundaActivityViewModel extends ViewModel {
    private MutableLiveData<Palabra> palabraLiveData = new MutableLiveData<>();

    public void setPalabra(Palabra palabra) {
        palabraLiveData.setValue(palabra);
    }

    public LiveData<Palabra> getPalabra() {
        return palabraLiveData;
    }
}