/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareasemana15coleccioneslista;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author AR.ALCOSER
 */
public class TareaSemana15ColeccionesLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creacion de la coleccion (Diccionario y Map)
        // La clave es el nombre (String) y el valor es el teléfono (String)
        Map<String, String> agenda = new HashMap<>();
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("-- AGENDA DE TELEFONOS --\n");
            
            // Agregamos datos
            agenda.put("Carla", "0997654321");
            agenda.put("Sandra", "0981234567");
            agenda.put("Cesar", "0997623346");
            agenda.put("Kamyla", "0997654321");
            agenda.put("Alisson", "0981234567");
            
            // Mostramos la informacion almacenada barrimos la coleccion y con un nuevo tipo de for
            System.out.println("Lista de contactos original:\n");
            for (String nombre : agenda.keySet()) {
                System.out.println("Nombre: " + nombre + "\t | Telefono: " + agenda.get(nombre));
            }
            
            // Operacion basica: Buscar un elemento dentro de la coleccion
            System.out.print("\nIngrese el nombre del contacto para buscar su numero de telefono en la agenda: ");
            String buscar = teclado.nextLine();
            
            if (agenda.containsKey(buscar)) {
                System.out.println("El telefono de " + buscar + " es: " + agenda.get(buscar));
            } else {
                System.out.println("El contacto '" + buscar + "' no existe en la agenda.");
            }
            
            // Operacion basica: Eliminar un elemento de la coleccion
            System.out.print("\nIngrese el nombre del contacto a eliminar: ");
            String eliminar = teclado.nextLine();
            
            if (agenda.containsKey(eliminar)) {
                agenda.remove(eliminar);
                System.out.println("Contacto '" + eliminar + "' eliminado con Exito !!.");
            } else {
                System.out.println("No se pudo eliminar el contacto que ingresaste porque no existe en la agenda.");
            }
            
             // Operacion basica: Agrega un elemento de la coleccion
            System.out.print("\nIngrese el nombre del nuevo contacto: ");
            String nuevoNombre = teclado.nextLine();

            System.out.print("Ingrese el numero de telefono: ");
            String nuevoTelefono = teclado.nextLine();

            // Guardamos los datos del nuevo contacto en la coleccion
            agenda.put(nuevoNombre, nuevoTelefono);
            System.out.println("Contacto '" + nuevoNombre + "' Ha sido agregado exitosamente a la agenda !!");
            
            // Mostrar lista final para verificar cambios, imprime la coelccion sin formato
            System.out.println("\nAgenda actualizada:");
            System.out.println("Imprimo sin formato: " + agenda);
            
        }//try
    System.out.println(); 
    
    }//public static void
    
}//class TareaSemana15ColeccionesLista
