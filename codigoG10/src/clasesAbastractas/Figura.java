package clasesAbastractas;

// no se puede instanciar

public abstract class Figura {
    protected int color;

    public Figura(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public abstract double area();
}
