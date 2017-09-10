package com.example.diamond.appcontactos;

import java.io.Serializable;

/**
 * Created by Diamond on 03/09/2017.
 */

public class Contacto implements Serializable {
    String Nombre, Email, Twitter, FechaNac;
    int Numero;

    public Contacto(String nombre, String email, String twitter, String fechaNac, int numero) {
        Nombre = nombre;
        Email = email;
        Twitter = twitter;
        FechaNac = fechaNac;
        Numero = numero;
    }

    public String getTwitter() {
        return Twitter;
    }
    public void setTwitter(String twitter) {
        Twitter = twitter;
    }
    public String getFechaNac() {
        return FechaNac;
    }
    public void setFechaNac(String fechaNac) {
        FechaNac = fechaNac;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getNumero() {
        return Numero;
    }
    public void setNumero(int numero) {
        Numero = numero;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {

        return this.Nombre +"/"+ this.Email;
    }


}
