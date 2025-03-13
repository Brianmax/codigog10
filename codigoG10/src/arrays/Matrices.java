package arrays;

import java.util.Random;
import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero de filas");
        int filas = sc.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        Random rand = new Random();
        for(int i = 0; i < filas; i++) {
            for(int j = 0; j < columnas; j++) {
                matriz[i][j] = rand.nextInt(100);
            }
        }


    }
}
