package main.java.patterns.observer.interfaces;

import main.java.patterns.observer.observers.Client;

public interface Observable {

    void addClient(Client client);

    void deleteClient(Client client);

    void notifyClients();
}
