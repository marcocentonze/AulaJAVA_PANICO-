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
            System.out.println(i + 1 + ". " + tipoPane[i] + " - " +"Prezzo:" + panePrezzo[i] + " euro");
        }
        int sceltaPane = scanner.nextInt(); // prendo l'input dell'utente
        String paneScelto = tipoPane[sceltaPane - 1];//metto -1 perchè l'array parte da 0,così ci prendiamo tutte le opzioni
        double prezzoPaneScelto = panePrezzo[sceltaPane - 1];

        // chiedo che farcitura vuole
        System.out.println("Scegli la farcitura:");
        for (int i = 0; i < farcituraDolce.length; i++) {
            System.out.println(i + 1 + ". " + farcituraDolce[i] + " Costo: " + farcituraCosto[i] + " euro");
        }
        int sceltaFarcitura = scanner.nextInt();// prendo la scelta
        String farcituraScelta = farcituraDolce[sceltaFarcitura - 1];
        double prezzoFarcituraScelta = farcituraCosto[sceltaFarcitura - 1];

        PiattoSpeciale piatto = new PiattoSpeciale(paneScelto, prezzoPaneScelto, farcituraScelta,
                prezzoFarcituraScelta);
        System.out.println("Hai creato un panino: " + piatto.getTipoPane() + " con " + piatto.getTipoFarcitura() + " - Totale: "
                + piatto.getTotalePiatto() + " euro");

               
    }
    //senza main non mi si avvia
    public static void main(String[] args) {
        Menù menù = new Menù();
        menù.creaPiattoSpeciale();
    }
}
