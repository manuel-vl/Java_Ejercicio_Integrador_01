package repository;

import model.Cliente;
import model.Factura;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FacturaImp implements CRUDRepository<Factura>{
    List<Factura> listaFacturas=new ArrayList<Factura>();

    ClienteImp implementacionClient=new ClienteImp();

    @Override
    public void mostrarPantalla() {
        for (Factura factura: listaFacturas){
            System.out.println(factura.toString());
        }
    }

    @Override
    public void save(Factura object) {
        Optional<Cliente> clienteFinded = implementacionClient.buscar(object.getClient().getDni());

        if(clienteFinded.isPresent()){
            listaFacturas.add(object);
        }else{
            implementacionClient.save(object.getClient());
            listaFacturas.add(object);
        }

        listaFacturas.add(object);
    }

    @Override
    public List<Factura> listarElementos() {
        return listaFacturas;
    }

    @Override
    public Optional<Factura> buscar(String codigo) {
        boolean finded=false;

        for (Factura factura: listaFacturas){
            if(factura.getCodigo().equals(codigo)){
                System.out.println("Factura encontrada y sus datos son: ");
                System.out.println(factura.toString());
                return Optional.of(factura);
            }
        }

        if(!finded){
            System.out.println("Factura no encontrada");
        }

        return Optional.empty();
    }

    @Override
    public void eliminar(String codigo) {
        Optional <Factura> factura=this.buscar(codigo);

        if(factura.isEmpty()){
            System.out.println("Factura no encontrada");
        }else{
            System.out.println("Factura eliminada");
            listaFacturas.remove(factura.get());
        }
    }
}
