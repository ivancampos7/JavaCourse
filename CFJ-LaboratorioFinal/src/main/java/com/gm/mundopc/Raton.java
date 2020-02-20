package com.gm.mundopc;

public class Raton extends DispositivoEntrada{
    private int idRaton;
    private static int contadorRatones;
    private String color;
    private boolean ergonominco;
   
 Raton(){
     this.idRaton = contadorRatones++;
 }
 
 Raton(String color, boolean especial){
     this();
     this.color = color;
     this.ergonominco = especial;     
 }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", color=" + color + ", ergonominco=" + ergonominco + '}';
    }

    public int getIdRaton() {
        return idRaton;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isErgonominco() {
        return ergonominco;
    }

    public void setErgonominco(boolean ergonominco) {
        this.ergonominco = ergonominco;
    }
 
    
 
    
 
}
