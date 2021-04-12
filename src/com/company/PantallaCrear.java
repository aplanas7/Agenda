package com.company;


public class PantallaCrear {

    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("Crear Contacto");     // titulo = "CREAR NOTA"

        Contacto contacto = new Contacto();

        CampoDeTexto campoDeTexto = new CampoDeTexto();

        contacto.nombre = campoDeTexto.pedir("Nombre", true);
        contacto.apellido = campoDeTexto.pedir("Apellido", true);
        contacto.telefono = campoDeTexto.pedir("Telefono", true);
        contacto.correo = campoDeTexto.pedir("Correo");



        Main.agenda.contactos.add(contacto);
    }
}
