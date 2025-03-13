package poo;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();

        // persona1.nombre = "Jose";
        persona1.setNombre("Jose");
        // persona1.apellido = "Rivera";
        persona1.setApellido("Rivera");
        // persona1.edad = 25;
        persona1.setEdad(25);

        // persona2.nombre = "Juan";
        persona2.setNombre("Jose");
        // persona2.apellido = "Rivera";
        persona2.setApellido("Rivera");
        // persona2.edad = 35;
        persona2.setEdad(35);

        persona1.decirHola();

        persona2.decirHola2("Pedro");
        float respuesta = persona2.sumar(78.3f, 23.2f);

        Computer computer1 = new Computer();
        computer1.brand = "HP";
        computer1.model = "HP-1299o";
        computer1.ram = 32;
        computer1.storage = 120;

        computer1.printInfo();

        System.out.println("============================");


        Computer computer2 = new Computer();
        computer2.brand = "Lenovo";
        computer2.model = "Lenovo-1299o";
        computer2.ram = 16;
        computer2.storage = 512;

        computer2.printInfo();


        System.out.println("======================");
        System.out.println(computer1);

        Computer computer3 = new Computer("Apple", "Macbook Pro", 16, 1024);
        Persona persona = new Persona();

    }
}
