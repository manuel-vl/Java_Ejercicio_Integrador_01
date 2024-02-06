package repository;

import model.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClienteImp implements CRUDRepository<Cliente>{
    List<Cliente> listClientes=new ArrayList<Cliente>();

    @Override
    public void mostrarPantalla() {
        for (Cliente cliente: listClientes){
            System.out.println("DNI: " +cliente.getDni());
            System.out.println("Nombre: " +cliente.getNombre());
            System.out.println("Apellido: " +cliente.getApellido());
        }
    }

    @Override
    public void save(Cliente object) {
        listClientes.add(object);
    }

    @Override
    public List<Cliente> listarElementos() {
        return listClientes;
    }

    @Override
    public Optional<Cliente> buscar(String id) {
        boolean finded=false;

        for (Cliente cliente: listClientes){
            if(cliente.getDni().equals(id)){
                System.out.println("Cliente encontrado, su data es: ");
                System.out.println("DNI: " +cliente.getDni());
                System.out.println("Nombre: " +cliente.getNombre());
                System.out.println("Apellido: " +cliente.getApellido());
                return Optional.of(cliente);
            }
        }

        if(!finded){
            System.out.println("Cliente no encontrado");
        }

        return Optional.empty();
    }

    @Override
    public void eliminar(String id) {
        Optional<Cliente> cliente=this.buscar(id);

        if(cliente.isEmpty()){
            System.out.println("Cliente no encontrado");
        }else{
            System.out.println("Cliente eliminado");
            listClientes.remove(cliente.get());
        }
    }
}
