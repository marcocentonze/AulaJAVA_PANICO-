import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class EsercizioLoStadio {
    public static void main(String[] args) {
        // inizializzo gli oggetti
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // ArrayList<String> statistiche = new ArrayList<String>();

        // chiedo all'utente quanti weekend
        System.out.println("Inserisci il numero di weekend: ");
        int numeroWeekend = scanner.nextInt();

        int prezzoSabato = 20;
        int prezzoDomenica = 15;
        int spettatoriSabato = (int) (Math.random() + 1);
        int spettatoriDomenica = (int) (Math.random() + 1);

        for (int i = 0; i < numeroWeekend; i++) {
            // Simulazione spettatori più id univoco

            spettatoriSabato = random.nextInt(75800) + 1;
            spettatoriDomenica = random.nextInt(75800) + 1;
        }

        // guadagno per giorno
        int guadagnoSabato = spettatoriSabato * prezzoSabato;
        int guadagnoDomenica = spettatoriDomenica * prezzoDomenica;
        // guadagno totale
        int guadagnoTotale = +guadagnoSabato + guadagnoDomenica;

        while (true) { // sistemare il while

            // prendo input utente e vedo che scelta fa
            System.out.println("\nSeleziona un'opzione:");
            System.out.println("1. Guadagno del sabato");
            System.out.println("2. Guadagno della domenica");
            System.out.println("3. Guadagno totale");
            System.out.println("0. Esci");

            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Il guadagno del sabato è: " + guadagnoSabato);
                    break;
                case 2:
                    System.out.println("Il guadagno della domenica è: " + guadagnoDomenica);
                    break;
                case 3:
                    guadagnoTotale = guadagnoSabato + guadagnoDomenica;
                    System.out.println("Il guadagno totale è: " + guadagnoTotale);
                    break;
                case 0:
                    System.out.println("Arrivederci!");
                    return;
                default:
                    System.out.println("Opzione non corretta");
            }
        }

        // // Calcolo minimo e massimo spettatore
        // int minimoSpettatore = Math.min(spettatoriSabato, spettatoriDomenica);
        // int massimoSpettatore = Math.max(spettatoriSabato, spettatoriDomenica);

        // // Calcolo minimo e massimo incasso
        // int minimoIncasso = Math.min(guadagnoSabato, guadagnoDomenica);
        // int massimoIncasso = Math.max(guadagnoSabato, guadagnoDomenica);

        // System.out.println("Il guadagno totale è: " + guadagnoTotale);

    }
}

// obiettivi:
// 1 Creare un sistema di id crescente che conti quante persone vengono allo
// stadio
// 2 Il sistema deve permetterti di randomizzare X week end per fare stime di
// affluenza
// Le stime che devi far fare sono: Min spettatori,Max spettatori,Max icass e
// min incasso
// 3 Ogni biglietto costa il sabato 20$ e la domenica 15$,deve essere possibile
// filtrare come scelta per giorno

// chiedo prima input quanti weekend
// generare una quantità di persone e dare un id a ciascuna
// analisi dei dati
// se 0 weekend allora ciao