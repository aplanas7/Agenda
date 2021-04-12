package com.company;

public class PantallaEditar {

    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("Editar");
        CampoDeTexto campoDeTexto = new CampoDeTexto();
        Mensaje mensaje = new Mensaje();

        String buscarnombre = campoDeTexto.pedir("Nombre a buscar", true);
        String buscarapellido = campoDeTexto.pedir("Apellido a buscar", true);

        for (Contacto contacto : Main.agenda.contactos) {
            if (contacto.nombre.equals(buscarnombre) && contacto.apellido.equals(buscarapellido)) {
                mensaje.mostrarInfo("Contacto encontrado");
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

                contacto.telefono = campoDeTexto.pedir("Nuevo número de telefono");
                contacto.correo = campoDeTexto.pedir("Nuevo correo");

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
