import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il numero di parole (N): ");
        int N = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Set<String> paroleDistinte = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();
        Set<String> paroleInserite = new HashSet<>();

        for (int i = 0; i < N; i++) {
            System.out.print("Inserisci parola " + (i + 1) + ": ");
            String parola = scanner.nextLine();

            if (!paroleInserite.add(parola)) {
                paroleDuplicate.add(parola);
            }
        }

        System.out.println("Parole duplicate: " + paroleDuplicate);
        System.out.println("Numero di parole distinte: " + paroleInserite.size());
        System.out.println("Elenco delle parole distinte: " + paroleInserite);
    }
}