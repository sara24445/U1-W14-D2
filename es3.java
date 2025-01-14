import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RubricaTelefonica {
    private Map<String, String> rubrica;

    public RubricaTelefonica() {
        rubrica = new HashMap<>();
    }

    public void inserisciContatto(String nome, String numero) {
        rubrica.put(nome, numero);
    }

    public void cancellaContatto(String nome) {
        rubrica.remove(nome);
    }

    public String cercaPerTelefono(String numero) {
        for (Map.Entry<String, String> entry : rubrica.entrySet()) {
            if (entry.getValue().equals(numero)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String cercaPerNome(String nome) {
        return rubrica.get(nome);
    }

    public void stampaContatti() {
        for (Map.Entry<String, String> entry : rubrica.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Telefono: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();
        Scanner scanner = new Scanner(System.in);

        rubrica.inserisciContatto("Marco", "123456789");
        rubrica.inserisciContatto("Luca", "987654321");

        rubrica.stampaContatti();

        System.out.print("Inserisci nome per cercare il numero: ");
        String nome = scanner.nextLine();
        System.out.println("Telefono di " + nome + ": " + rubrica.cercaPerNome(nome));
        
        System.out.print("Inserisci numero per cercare il nome: ");
        String numero = scanner.nextLine();
        System.out.println("Nome con numero " + numero + ": " + rubrica.cercaPerTelefono(numero));
        
        rubrica.cancellaContatto("Marco");
        rubrica.stampaContatti();
    }
}