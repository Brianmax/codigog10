package generics;

public class Punto2d <T, K> {
    private T x;
    private K y;

    public Punto2d(T x, K y) {
        this.x = x;
        this.y = y;
    }

    public K getY() {
        return y;
    }

    public void setY(K y) {
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }
}
