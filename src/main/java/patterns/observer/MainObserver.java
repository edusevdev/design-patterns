package main.java.patterns.observer;

import main.java.patterns.observer.observables.Store;
import main.java.patterns.observer.observers.Client;

public class MainObserver {
    public static void main(String[] args) {

        // Create store
        Store store1 = new Store("Tienda de Gran Vía");

        // Create clients
        Client client1 = new Client("Pepe");
        Client client2 = new Client("Ana");
        Client client3 = new Client("Laura");

        // The clients we want to notify are added
        store1.addClient(client1);
        store1.addClient(client2);
        store1.addClient(client3);

        // Someone activates the store offers
        store1.activateDiscounts();

    }
}
