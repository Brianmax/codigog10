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

    public boolean contieneElemento(T elemento) {
        for(int i = 0; i < tamanio; i++) {
            if(elementos[i] == null && elemento == null) {
                return true;
            } else if(elementos[i] != null && elementos[i].equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public T obtener(int posicion) {
        if(posicion < 0 || posicion >= tamanio) {
            System.out.println("Posicion no valido");
            throw new IndexOutOfBoundsException("Posicion no valido");
        }
        return elementos[posicion];
    }



    private void aseguraCapacidad() {
        int nuevaCapacidad = elementos.length * 2;
        T[] nuevoArray = Arrays.copyOf(elementos, nuevaCapacidad);
        elementos = nuevoArray;
    }


}
