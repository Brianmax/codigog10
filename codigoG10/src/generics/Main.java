package generics;

import interfaces.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList<Double> arrayList2 = new java.util.ArrayList<>();
        java.util.ArrayList<Float> arrayList3 = new java.util.ArrayList<>();

        Punto2d<Integer> punto2d = new Punto2d<>(4,5);
        Punto2d<Float> punto2d2 = new Punto2d<>(3.3f, 2.5f);

    }
}
