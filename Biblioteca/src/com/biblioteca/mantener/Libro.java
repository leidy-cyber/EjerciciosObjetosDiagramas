package com.biblioteca.mantener;

public class Libro {
    private int edicion;
    private int añoPublicaion;
    private Autor autor;


    public Libro(){

    }

    public Libro(int edicion, int añoPublicaion, Autor autor){
        this.edicion = edicion;
        this.añoPublicaion = añoPublicaion;
        this.autor = autor;

    }
    public void setEdicion(int edicion) {
        this.edicion =edicion;
    }
    public int getEdicion(){
        return edicion;
    }
    public void setAñoPublicacion(int añoPublicaion) {
        this.añoPublicaion =añoPublicaion;
    }
    public int getAñoPublicacion(){
        return añoPublicaion;
    }
    public void setAutor(Autor autor) {
        this.autor =autor;
    }
    public Autor getAutor(){
        return autor;
    }

    public String toString() {
        return "Libro { " + super.toString() + "Edicion =" + edicion + ", AñoPublicacion = " + añoPublicaion +  ", Autor = " + autor +'}';
    }
  

}
