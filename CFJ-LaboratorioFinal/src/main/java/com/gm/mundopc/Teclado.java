package com.gm.mundopc;

public class Teclado extends DispositivoEntrada {
    private int idTeclado;
    private static int contadorTeclados;
    private String idioma;
    private boolean iluminacion;
    
    Teclado(){
        this.idTeclado = contadorTeclados++;
    }
    
    Teclado(String language, boolean light){
        this();
        this.idioma = language;
        this.iluminacion = light;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + ", idioma=" + idioma + ", iluminacion=" + iluminacion + '}';
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isIluminacion() {
        return iluminacion;
    }

    public void setIluminacion(boolean iluminacion) {
        this.iluminacion = iluminacion;
    }
    
    
}
