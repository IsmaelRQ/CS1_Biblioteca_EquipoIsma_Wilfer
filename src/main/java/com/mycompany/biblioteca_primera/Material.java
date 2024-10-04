package com.mycompany.biblioteca_primera;

public class Material {
    private String identificador;
    private String titulo;
    private int cantidadRegistrada;
    private int cantidadActual;

    public Material(String identificador, String titulo, int cantidadRegistrada) {
        this.identificador = identificador;
        this.titulo = titulo;
        this.cantidadRegistrada = cantidadRegistrada;
        this.cantidadActual = cantidadRegistrada;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantidadRegistrada() {
        return cantidadRegistrada;
    }

    public void setCantidadRegistrada(int cantidadRegistrada) {
        this.cantidadRegistrada = cantidadRegistrada;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void prestar() {
        if (cantidadActual > 0) {
            cantidadActual --;
            System.out.println("Material prestado: " + titulo + ". Cantidad restante: " + cantidadActual);
        } else {
            System.out.println("No hay copias disponibles de " + titulo);
        }
    }

    public void devolver() {
        if (cantidadActual < cantidadRegistrada) {
            cantidadActual ++;
            System.out.println("Material devuelto: " + titulo + ". Cantidad disponible: " + cantidadActual);
        }
    }
    
    public void renovar() {
        System.out.println("El material " + titulo + " ha sido renovado.");
    }
}
