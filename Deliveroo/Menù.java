import java.util.ArrayList;
import java.util.Scanner;

public class Menù {

    private String[] tipoPane = { "Sesamo", "Ai cereali", "Integrale", "Di grano" };
    private double[] panePrezzo = { 2.0, 2.5, 1.5, 1.0 };
    private String[] farcituraDolce = { "Nutella", "Crema di pistacchio", "Nocciolata", "Marmellata" };
    private double[] farcituraCosto = { 2.0, 3.0, 2.5, 1.5 };

    public void creaPiattoSpeciale() {
        Scanner scanner = new Scanner(System.in);// creo l'oggetto scanner
        // chiedo all'utente che pane vuole e gli faccio vedere le scelte
        System.out.println("Scegli il tipo di pane:");
        for (int i = 0; i < tipoPane.length; i++) {
            System.out.println(i + 1 + ". " + tipoPane[i] + " - " + "Prezzo:" + panePrezzo[i] + " euro");
        }
        int sceltaPane = scanner.nextInt(); // prendo l'input dell'utente
        String paneScelto = tipoPane[sceltaPane - 1];// metto -1 perchè l'array parte da 0,così ci prendiamo tutte le
                                                     // opzioni
        double prezzoPaneScelto = panePrezzo[sceltaPane - 1];

        // creo input per dare la possibilità di scelta farcitura
        System.out.println("Scegli il tipo di farcitura:");
        System.out.println("1. Farcitura standard");
        System.out.println("2. Farcitura personalizzata (Costo fisso di 5 euro)");

        int sceltaTipoFarcitura = scanner.nextInt(); // prendo la scelta dell'utente

        String farcituraScelta = "";
        double prezzoFarcituraScelta = 0.0;

        // if in base alla scelta farcitura
        if (sceltaTipoFarcitura == 1) { // Farcitura standard
            System.out.println("Scegli la farcitura:");
            for (int i = 0; i < farcituraDolce.length; i++) {
                System.out.println((i + 1) + ". " + farcituraDolce[i] + " Costo: " + farcituraCosto[i]);
            }
            int sceltaFarcitura = scanner.nextInt(); // prendo la scelta della farcitura standard
            farcituraScelta = farcituraDolce[sceltaFarcitura - 1];
            prezzoFarcituraScelta = farcituraCosto[sceltaFarcitura - 1];
        } else if (sceltaTipoFarcitura == 2) { // Farcitura personalizzata
            System.out.println("Inserisci il nome della tua farcitura personalizzata:");
            scanner.nextLine();
            farcituraScelta = scanner.nextLine(); // prendo il nome della farcitura personalizzata dall'utente
            prezzoFarcituraScelta = 5.0; // Costo fisso per la farcitura personalizzata
        }

        // calcolo il prezzo totale
        PiattoSpeciale piatto = new PiattoSpeciale(paneScelto, prezzoPaneScelto, farcituraScelta,
                prezzoFarcituraScelta);
        System.out.println(
                "Hai creato un panino: " + piatto.getTipoPane() + " con " + piatto.getTipoFarcitura() + " - Totale: "
                        + piatto.getTotalePiatto() + " euro");

    }

    // senza main non mi si avvia
    public static void main(String[] args) {
        Menù menù = new Menù();
        menù.creaPiattoSpeciale();
    }
}
