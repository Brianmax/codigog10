package poo;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();

        persona1.nombre = "Jose";
        persona1.apellido = "Rivera";
        persona1.edad = 25;

        persona2.nombre = "Juan";
        persona2.apellido = "Rivera";
        persona2.edad = 35;

        persona1.decirHola();

        persona2.decirHola2("Pedro");
        float respuesta = persona2.sumar(78.3f, 23.2f);
    }
}
