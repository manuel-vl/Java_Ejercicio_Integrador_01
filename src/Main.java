import model.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente clienteA = new Cliente("123456789", "Manuel", "Valencia");
        Cliente clienteB = new Cliente("123456789", "Daniela", "Restrepo");
        Cliente clienteC = new Cliente("123456789", "Diana", "Bautista");
        Cliente clienteD = new Cliente("123456789", "Jhonatan", "Pinilla");

        // List of clients
        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(clienteA);
        clientes.add(clienteB);
        clientes.add(clienteC);
        clientes.add(clienteD);

        menuPrincipal(clientes);
    }

    public static void menuPrincipal(List<Cliente> clientes) {
        System.out.println("Bienvenido a la Tienda");
        int opcion = 0;

        do {
            System.out.println("1. Ver listado cliente");
            System.out.println("2. Buscar un cliente por DNI");
            System.out.println("3. Eliminar un cliente por DNI");
            System.out.println("0. Salir");
            System.out.println("Porfavor, selecciona la accion a realizar: ");
            Scanner input = new Scanner(System.in);
            opcion = Integer.parseInt(input.next());

            switch (opcion) {
                case 1 -> Cliente.listarCliente(clientes);
                case 2 -> {
                    opcion = 0;
                    menuBuscar(clientes);
                }
                case 3 -> {
                    opcion=0;
                    menuEliminar(clientes);
                }
                case 0 -> System.out.println("Gracias por su visita!");
                default -> System.out.println("Porfavor, ingrese una opcion valida.");
            }
        } while (opcion != 0);
    }

    public static void menuBuscar(List<Cliente> clientes) {
        int opcion = 0;

        do {
            System.out.println("\n\n");
            System.out.println("1. Ingresar DNI.");
            System.out.println("0. Volver");
            System.out.println("Porfavor, selecciona la accion a realizar (Buscando): ");
            Scanner input = new Scanner(System.in);
            opcion = Integer.parseInt(input.next());

            switch (opcion) {
                case 1 -> {
                    System.out.println("A continuacion, digite el DNI: ");
                    String dni = input.next();
                    Cliente.buscarCliente(dni, clientes);
                }
                case 0 -> menuPrincipal(clientes);
                default -> System.out.println("Porfavor, ingresa una opcion valida.");
            }
        } while (opcion != 0);
    }

    public static void menuEliminar(List<Cliente> clientes) {
        int opcion = 0;

        do {
            System.out.println("\n\n");
            System.out.println("1. Ingresar DNI.");
            System.out.println("0. Volver");
            System.out.println("Porfavor, selecciona la accion a realizar (Eliminando): ");
            Scanner input = new Scanner(System.in);
            opcion = Integer.parseInt(input.next());

            switch (opcion) {
                case 1 -> {
                    System.out.println("A continuacion, digite el DNI: ");
                    String dni = input.next();
                    Cliente.eliminarCliente(dni, clientes);
                }
                case 0 -> menuPrincipal(clientes);
                default -> System.out.println("Porfavor, ingresa una opcion valida.");
            }
        } while (opcion != 0);
    }
}
