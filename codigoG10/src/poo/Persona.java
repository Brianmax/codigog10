package poo;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;


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

    // getter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
