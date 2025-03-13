package poo;

import java.util.Date;

public class Computer {
    String brand;
    String model;
    int ram;
    int storage;


    Computer(String brand, String model, int ram, int storage) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
    }

    Computer() {

    }

    void printInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
    }

    void aumentarRam(int ram) {
        this.ram += ram;
    }

    void aumentarStorage(int storage) {
        this.storage += storage;
    }
}
