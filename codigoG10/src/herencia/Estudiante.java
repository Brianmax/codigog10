package herencia;

public class Estudiante extends Persona{
    private float promedio;

    public Estudiante(String nombre, String apellido, int edad, float promedio) {
        super(nombre, apellido, edad);
        this.promedio = promedio;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Promedio: " + promedio);
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
}
