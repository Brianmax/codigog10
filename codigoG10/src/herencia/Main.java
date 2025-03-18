package herencia;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(
                "George",
                "Maxi",
                19,
                13);

        estudiante.printInfo();
        System.out.println("===============================");


        Persona persona = new Estudiante(
                "Pedro",
                "Vargas",
                12,
                19);
        persona.printInfo();


        // A nombre, apellido, edad
        // B nombre, apellido, edad, promedio
    }
}
