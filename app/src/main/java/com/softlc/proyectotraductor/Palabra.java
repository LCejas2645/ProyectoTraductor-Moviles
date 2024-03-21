package com.softlc.proyectotraductor;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Palabra implements Serializable {
    private String palabraEspañol;
    private String palabraIngles;
    private int imagenId;

    public Palabra(String palabraEspañol, String palabraIngles, int imagenId) {
        this.palabraEspañol = palabraEspañol;
        this.palabraIngles = palabraIngles;
        this.imagenId = imagenId;
    }

    public String getPalabraEspañol() {
        return palabraEspañol;
    }

    public String getPalabraIngles() {
        return palabraIngles;
    }

    public int getImagenId() {
        return imagenId;
    }

}