package ejercicioGeneric;

import java.util.Arrays;

public class ListaGenerica <T> {
    private T[] elementos;
    private int tamanio;
    private final int CAPACIDAD_INICIAL = 10;

    @SuppressWarnings("unchecked")
    public ListaGenerica() {
        elementos = (T[]) new Object[CAPACIDAD_INICIAL];
        tamanio = 0;
    }

    public void agregar(T elemento) {
        if(tamanio == elementos.length) {
            aseguraCapacidad();
        }
        elementos[tamanio] = elemento;
        tamanio++;
    }

    // crear el metodo "contieneElemento"
    // recibe un argumento de tipo T
    // retorna true si el elemento esta dentro del array
    // falso si no esta

    public T obtener(int posicion) {
        if(posicion < 0 || posicion >= tamanio) {
            System.out.println("Posicion no valido");]
            return null;
        }
        return elementos[posicion];
    }



    private void aseguraCapacidad() {
        int nuevaCapacidad = elementos.length * 2;
        T[] nuevoArray = Arrays.copyOf(elementos, nuevaCapacidad);
        elementos = nuevoArray;
    }
}
