import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Esercizio2 {
    public static void main(String[] args) {
        int N = 10; // Puoi modificare N a tuo piacimento
        List<Integer> listaOrdinata = generaListaOrdinata(N);
        System.out.println("Lista ordinata: " + listaOrdinata);

        List<Integer> listaCopia = creaListaInvertita(listaOrdinata);
        System.out.println("Lista con elementi invertiti: " + listaCopia);

        boolean stampaPari = true; // Cambia a false per stampare dispari
        stampaPosizioni(listaCopia, stampaPari);
    }

    public static List<Integer> generaListaOrdinata(int N) {
        Random random = new Random();
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            lista.add(random.nextInt(101)); // Genera numeri da 0 a 100
        }
        Collections.sort(lista);
        return lista;
    }

    public static List<Integer> creaListaInvertita(List<Integer> lista) {
        List<Integer> listaInvertita = new ArrayList<>(lista);
        Collections.reverse(listaInvertita);
        listaInvertita.addAll(lista); // Aggiunge gli elementi originali dopo quelli invertiti
        return listaInvertita;
    }

    public static void stampaPosizioni(List<Integer> lista, boolean pari) {
        System.out.println(pari ? "Elementi in posizioni pari:" : "Elementi in posizioni dispari:");
        for (int i = 0; i < lista.size(); i++) {
            if (pari && i % 2 == 0) {
                System.out.print(lista.get(i) + " ");
            } else if (!pari && i % 2 != 0) {
                System.out.print(lista.get(i) + " ");
            }
        }
        System.out.println();
    }
}