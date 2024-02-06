import model.Cliente;
import model.Factura;
import model.Item;
import repository.ClienteImp;
import repository.FacturaImp;
import repository.ItemImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Implementacion Client
        ClienteImp implementacionClient=new ClienteImp();
        // Implemtnacion Item
        ItemImp implementacionItem=new ItemImp();
        // Implementacion Factura
        FacturaImp implementacionFactura=new FacturaImp();

        // Clientes
        Cliente clienteA = new Cliente("12345678", "Manuel", "Valencia");
        Cliente clienteB = new Cliente("123456789", "Daniela", "Restrepo");
        Cliente clienteC = new Cliente("123456789", "Diana", "Bautista");
        Cliente clienteD = new Cliente("123456789", "Jhonatan", "Pinilla");

        // Save cliente
        implementacionClient.save(clienteA);
        implementacionClient.save(clienteB);
        implementacionClient.save(clienteC);

        // Items
        Item itemA=new Item("Item01", "Alpinito", 1, 1500.0);
        Item itemB=new Item("Item02", "Leche", 2, 3500.0);
        Item itemC=new Item("Item03", "Granola", 1, 17000.0);
        Item itemD=new Item("Item04", "Quesito", 2, 10000.0);

        // Save items
        implementacionItem.save(itemA);
        implementacionItem.save(itemB);
        implementacionItem.save(itemC);
        implementacionItem.save(itemD);


        // Factura
        Factura factura1=new Factura("FA01", clienteA, implementacionItem.listarElementos());
        Factura factura2=new Factura("FA02", clienteD, implementacionItem.listarElementos());

        // Save facturas
        implementacionFactura.save(factura1);
        implementacionFactura.save(factura2);

    }
}

