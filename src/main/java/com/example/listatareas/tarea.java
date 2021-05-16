package com.example.listatareas;

public class tarea {
    private final String descripcion;

    public tarea(String param){ /*constructor del objeto de la instancia tarea*/
        this.descripcion = param;
    }
    public String getDescripcion() {
        return descripcion;
    }
   /*public void setDescripcion(String valor) { //escribe el valor del atributo descripcion
        descripcion = valor;
    }*/
}