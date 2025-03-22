package generics;

public class Punto2d <T> {
    private T x;
    private T y;

    public Punto2d(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }
}
