package main.java.patterns.observer.observables;

import main.java.patterns.observer.interfaces.Observable;
import main.java.patterns.observer.observers.Client;

import java.util.ArrayList;
import java.util.List;

public class Store implements Observable {

    private String nombre;
    private List<Client> clients;

    public Store(String nombre) {
        clients = new ArrayList<>();
        this.nombre = nombre;
    }

    public void activateDiscounts() {
        System.out.println("Se activan ofertas en tienda: " + nombre);
        this.notifyClients();
    }

    @Override
    public void notifyClients() {
        clients.stream().forEach(client -> client.sendDiscountMessage());
    }

    @Override
    public void addClient(Client client) {
        clients.add(client);
    }

    @Override
    public void deleteClient(Client client) {
        clients.remove(client);
    }
}
