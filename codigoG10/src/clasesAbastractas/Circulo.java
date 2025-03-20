package clasesAbastractas;

public class Circulo extends Figura {
    private double radius;

    public Circulo(int color, double radius) {
        super(color);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
