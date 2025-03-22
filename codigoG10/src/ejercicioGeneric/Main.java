package ejercicioGeneric;

public class Main {
    public static void main(String[] args) {
        ListaGenerica<String> listaGenerica = new ListaGenerica<>();


        listaGenerica.agregar("Adriana");
        listaGenerica.agregar("Sheyla");
        listaGenerica.agregar("George");
        listaGenerica.agregar(null);

        System.out.println(listaGenerica.obtener(0));

        System.out.println(listaGenerica.contieneElemento("Jose"));
        System.out.println(listaGenerica.contieneElemento(null));
    }
}
