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

    // Implementación Parcelable
//    protected Palabra(Parcel in) {
//        palabraEspañol = in.readString();
//        palabraIngles = in.readString();
//        imagenId = in.readInt();
//    }
//
//    public static final Creator<Palabra> CREATOR = new Creator<Palabra>() {
//        @Override
//        public Palabra createFromParcel(Parcel in) {
//            return new Palabra(in);
//        }
//
//        @Override
//        public Palabra[] newArray(int size) {
//            return new Palabra[size];
//        }
//    };
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeString(palabraEspañol);
//        dest.writeString(palabraIngles);
//        dest.writeInt(imagenId);
//    }
}