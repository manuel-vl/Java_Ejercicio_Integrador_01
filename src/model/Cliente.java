package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String dni;
    private String nombre;
    private String apellido;

    public Cliente() {

    }

    public Cliente(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "\nmodel.Cliente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    public static void listarCliente(List<Cliente> clientes){
        for (Cliente c: clientes){
            System.out.println("DNI: " +c.getDni());
            System.out.println("Nombre: " +c.getNombre());
            System.out.println("Apellido: " +c.getApellido());
        }
    }

    public static void eliminarCliente(String dni, List<Cliente> clientes){
        boolean eliminado=false;

        for (Cliente c: clientes){
            if(c.getDni().equals(dni)){
                eliminado=true;
                clientes.remove(c);
                break;
            }
        }

        if(!eliminado){
            System.out.println("No se encontro el cliente a borrar");
        }else{
            System.out.println("Cliente eliminado!");
        }
    }

    public static void buscarCliente(String dni, List<Cliente> clientes){
        boolean finded=false;

        for (Cliente c: clientes){
            if(c.getDni().equals(dni)){
                finded=true;
                System.out.println("Cliente encontrado, sus datos son: ");
                System.out.println("DNI: " +c.getDni());
                System.out.println("Nombre: " +c.getNombre());
                System.out.println("Apellido: " +c.getApellido());
            }
        }

        if(!finded){
            System.out.println("No se encontro el cliente a buscar");
        };
    }
}
