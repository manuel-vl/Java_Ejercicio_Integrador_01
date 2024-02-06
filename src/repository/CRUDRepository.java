package repository;

import java.util.List;
import java.util.Optional;

public interface CRUDRepository<T> {
    // Metodo para mostrar por pantalla
    public void mostrarPantalla();

    // Metodo para guardar un objeto
    public void save(T object);

    // Metodo para listar
    public List<T> listarElementos();

    // Metodo para obtener un objeto
    public Optional<T> buscar(String id);

    // Metodo para eliminar
    public void eliminar(String id);
}
