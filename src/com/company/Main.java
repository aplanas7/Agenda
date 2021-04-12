package com.company;


import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Agenda agenda = new Agenda();

    public static void main(String[] args) {

        PantallaMenu pantallaMenu = new PantallaMenu();
        while(pantallaMenu.mostrar()) { }
    }
}
















/*

Nota
   Titulo
   Contenido

Lista de notas

Menu
    Opcion

Pantalla
    PantallaBusqueda
    Pantalla.....

Titulo

LineaAsteriscos

Mensaje

Campo
   CampoLineaTexto
   CampoMultiLinea
   CampoNumerico
   CampoAnyKey

 */