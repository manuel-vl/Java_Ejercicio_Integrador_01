package model;

import model.Cliente;

import java.util.List;

public class Factura {
    private String codigo;
    private Cliente client;
    private List<Item> items;
    private Double total;

    public Factura() {
    }

    public Factura(String codigo, Cliente client, List<Item> items, Double total) {
        this.codigo = codigo;
        this.client = client;
        this.items = items;
        this.total = total;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
