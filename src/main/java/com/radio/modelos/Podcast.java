package com.radio.modelos;

public class Podcast extends Audio{
    private String presentador;
    private String descripcion;

    public String getPresentador() {
        return presentador;
    }
@Override
public int getClasificacion(){
    if(getTotalDeReproducciones() > 200){
        return 9;
    } else {
        return 2;
    }
}

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
