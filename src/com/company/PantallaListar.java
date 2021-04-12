package com.company;

public class PantallaListar {

    void mostrar(){
        Titulo titulo = new Titulo();
        titulo.mostrar("Contactos Guardados");

        for(Contacto contacto: Main.agenda.contactos){
            if (contacto.nombre != null) {
                System.out.print(contacto.nombre + " ");
            }
            if (contacto.apellido != null) {
                System.out.print(contacto.apellido + " ");
            }
            if (contacto.telefono != null) {
                System.out.print(contacto.telefono + " ");
            }
            if (contacto.correo != null) {
                System.out.println(contacto.correo);
            }
        }
        Enter enter = new Enter();
        enter.mostrar();
    }
}


