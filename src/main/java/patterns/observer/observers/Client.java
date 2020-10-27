package main.java.patterns.observer.observers;

import main.java.patterns.observer.interfaces.Observer;

public class Client implements Observer {

    private String nombre;

    public Client(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void sendDiscountMessage() {
        System.out.println("Se envía mensaje al cliente: " + nombre);
    }
}
