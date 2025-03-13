package poo;

public class Persona {
    String nombre;
    String apellido;
    int edad;


    // no recibe entradas
    // no retorna una respuesta
    void decirHola() {
        System.out.println("HOLA");
    }
    // recibe argumentos
    // no retorna una salida
    void decirHola2(String nombrePersona) {
        System.out.println("Hola " + nombrePersona);
    }

    // recibe argumentos
    // retorna una salida

    float sumar(float a, float b) {
        float respuesta = a + b;
        return respuesta;
    }
}
