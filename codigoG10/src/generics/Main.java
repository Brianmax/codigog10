package generics;

import interfaces.ArrayList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList<Double> arrayList2 = new java.util.ArrayList<>();
        java.util.ArrayList<Float> arrayList3 = new java.util.ArrayList<>();

        Punto2d<Integer, Integer> punto2d = new Punto2d<>(4,5);
        Punto2d<Float, Float> punto2d2 = new Punto2d<>(3.3f, 2.5f);
        Punto2d<Integer, String> punto2dString = new Punto2d<>(4, "george");

        Map<Integer, String> map = new HashMap<>();

        map.put(4, "george");
        map.put(3, "Adriana");
        map.put(2, "Sheyla");

        System.out.println(map.get(2));


    }
}
