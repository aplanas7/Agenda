package com.company;

public class PantallaEliminar {

    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("Editar");
        CampoDeTexto campoDeTexto = new CampoDeTexto();
        Mensaje mensaje = new Mensaje();

        String buscarnombre = campoDeTexto.pedir("Nombre a buscar", true);
        String buscarapellido = campoDeTexto.pedir("Apellido a buscar", true);

        for (Contacto contacto : Main.agenda.contactos) {
            if (contacto.nombre.equals(buscarnombre) && contacto.apellido.equals(buscarapellido)) {

                contacto.nombre = null;
                contacto.apellido = null;
                contacto.telefono = null;
                contacto.correo = null;

                mensaje.mostrarInfo("Contacto eliminado");
                Enter enter = new Enter();
                enter.mostrar();

            } else {
                mensaje.mostrarError("Contacto no encontrado");

                Enter enter = new Enter();
                enter.mostrar();
            }
        }
    }
}