package com.company;

public class PantallaBuscar {

    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("Busqueda");
        CampoDeTexto campoDeTexto = new CampoDeTexto();

        String buscarnombre = campoDeTexto.pedir("Nombre a buscar", true);
        String buscarapellido = campoDeTexto.pedir("Apellido a buscar", true);

        for (Contacto contacto : Main.agenda.contactos) {
            if (contacto.nombre.equals(buscarnombre) && contacto.apellido.equals(buscarapellido)) {
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

                Enter enter = new Enter();
                enter.mostrar();

            } else {
                Mensaje mensaje = new Mensaje();
                mensaje.mostrarError("Contacto no encontrado");

                Enter enter = new Enter();
                enter.mostrar();
            }
        }
    }
}


/*





 */

