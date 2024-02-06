package repository;

import model.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ItemImp implements CRUDRepository<Item>{
    List<Item> listaItems=new ArrayList<Item>();

    @Override
    public void mostrarPantalla() {
        for (Item item: listaItems){
            System.out.println(item.toString());
        }
    }

    @Override
    public void save(Item object) {
        listaItems.add(object);
    }

    @Override
    public List<Item> listarElementos() {
        return listaItems;
    }

    @Override
    public Optional<Item> buscar(String codigo) {
        boolean finded=false;

        for (Item item: listaItems){
            if(item.getCodigo().equals(codigo)){
                System.out.println("Datos del item: ");
                System.out.println(item.toString());
                return Optional.of(item);
            }
        }

        if(!finded){
            System.out.println("Item no encontrado");
        }

        return Optional.empty();
    }

    @Override
    public void eliminar(String codigo) {
        Optional <Item> item=this.buscar(codigo);

        if(item.isEmpty()){
            System.out.println("Item no encontrado");
        }else{
            System.out.println("Item eliminado");
            listaItems.remove(item.get());
        }
    }
}
