
package com.gm.mundopc;

public class DispositivoEntrada {
    private String tipoEntrada;
    private String marca;
    
    DispositivoEntrada(){
    }
    
    DispositivoEntrada(String tipo,String marca){
        this();
        this.tipoEntrada = tipo;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipoEntrada=" + tipoEntrada + ", marca=" + marca + '}';
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
