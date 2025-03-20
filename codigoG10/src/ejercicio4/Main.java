package ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        library.addItem(new Dvd("Dvd1", 1, "director1", 120));
        library.addItem(new Dvd("Dvd2", 2, "director2", 120));
        library.addItem(new Dvd("Dvd3", 3, "director3", 120));
        library.addItem(new Dvd("Dvd4", 4, "director4", 120));
        library.addItem(new Dvd("Dvd5", 5, "director5", 120));

        library.addUser(new LibraryUser("user1", 1));
        library.addUser(new LibraryUser("user2", 2));
        library.addUser(new LibraryUser("user3", 3));
        library.addUser(new LibraryUser("user4", 4));

        System.out.println(new Dvd("Dvd1", 1, "director1", 120));


        while(true) {
            System.out.println("1. Agregar usuario");
            System.out.println("2. Agregar item");
            System.out.println("3. Realizar prestamo");
            System.out.println("4. Salir");
            int option = sc.nextInt();

            if(option == 1) {
                System.out.println("Ingrese el username");
                String username = sc.next();
                System.out.println("Ingrese el ID");
                int id = sc.nextInt();
                library.addUser(new LibraryUser(username, id));
            } else if(option == 2) {
                System.out.println("1. Agregar DVD");
                System.out.println("2. Agregar Book");
                int option2 = sc.nextInt();
                System.out.println("Ingrese el title");
                String title = sc.next();
                System.out.println("Ingrese el item id");
                int itemId = sc.nextInt();

                // agregar dvd
                if(option2 == 1) {
                    System.out.println("Ingrese el director");
                    String director = sc.next();
                    System.out.println("Ingrese la duracion");
                    int duracion = sc.nextInt();
                    library.addItem(new Dvd(title, itemId, director, duracion));
                } else if(option2 == 2) { // agregar un book
                    System.out.println("Ingrese el autor");
                    String author = sc.next();
                    library.addItem(new Book(title, itemId, author));
                }
            } else if(option == 3) {
                System.out.println("Ingrese ID usuario");
                int idUsuario = sc.nextInt();
                System.out.println("Ingrese ID item");
                int idItem = sc.nextInt();
                library.loanItem(idUsuario, idItem);
            } else if(option == 4) {
                break;
            }
            System.out.println("===================================");
        }
    }
}
