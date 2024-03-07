import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class esercizioTorte {
    public static void main(String[] args) {
        ArrayList<String> creazioneTorta = new ArrayList<String>();
        // creo istanza della classe random che mi servirà dopo
        Random random = new Random();
        // creo prima le varie liste di array
        Scanner sceltaTorta = new Scanner(System.in);
        String[] base = { "Pan di Spagna", "Biscotto", "Pasta frolla", "Pasta sfoglia" };
        String[] ripieno = { "Crema pasticcera", "Marmellata", "Nutella", "Crema di nocciole" };
        String[] frutta = { "Fragole", "Banane", "Kiwi", "Mela" };
        String[] decorazione = { "Glassa al cioccolato", "Zucchero a velo", "Stelline", "Smarties" };

        // chiedo con input all'utente se vuole fare manuale o automatico
        System.out.println(
                "Creazione torta: scrivi 1 per farlo manualmente o 2 per farlo automatico o 3 per farlo metà manuale e metà casuale");
        int sceltaCreazioneTorta = sceltaTorta.nextInt();

        // se vuole fare manuale allora gli do i 4 input da scegliere e poi stampo il
        // risultato finale
        if (sceltaCreazioneTorta == 1) {
            System.out.println("Hai scelto la modalità manuale");
            System.out.println("Scegli la tua base tra: Pan di Spagna,Biscotto,Pasta frolla,Pasta sfoglia");
            String sceltaBase = sceltaTorta.nextLine();
            System.out.println("Scegli il tuo ripieno tra: Crema pasticcera,Marmellata,Nutella,Crema di nocciole");
            String sceltaRipieno = sceltaTorta.nextLine();
            System.out.println("Scegli la frutta da aggiungere tra: Fragole,Banane,Kiwi,Mela");
            String sceltaFrutta = sceltaTorta.nextLine();
            System.out.println(
                    "Scegli la decorazione tra aggiungere tra: Glassa al cioccolato,Zucchero a velo,stelline,Smarties");
            String sceltaDecorazione = sceltaTorta.nextLine();

            System.out.println("La tua torta buonissima è composta da:" + sceltaBase + sceltaRipieno + sceltaFrutta
                    + sceltaDecorazione);
            // altrimenti se è automatico uso il random
        } else if (sceltaCreazioneTorta == 2) {
            System.out.println("Hai scelto la modalità automatica");
            int baseAutomatico = random.nextInt(base.length);
            int ripienoAutomatico = random.nextInt(ripieno.length);
            int fruttaAutomatico = random.nextInt(frutta.length);
            int decorazioneAutomatico = random.nextInt(decorazione.length);
            System.out.println("La tua combinazione di torta casuale è :" + base[baseAutomatico] + ripieno[ripienoAutomatico]
                    + frutta[fruttaAutomatico] + decorazione[decorazioneAutomatico]);
            // altrimenti se è semi-automatico faccio 2 manuale e 2 automatico
        } else if (sceltaCreazioneTorta == 3) {
            System.out.println(
                    "Hai scelto la modalità semi-manuale.Potrai scegliere 2 manualmente e 2 saranno assegnati random");
            System.out.println("Scegli la tua base tra: Pan di Spagna,Biscotto,Pasta frolla,Pasta sfoglia");
            String sceltaBaseSemiAutomatica = sceltaTorta.nextLine();
            System.out.println("Scegli il tuo ripieno tra: Crema pasticcera,Marmellata,Nutella,Crema di nocciole");
            String sceltaRipienoSemiAutomatica = sceltaTorta.nextLine();
            int fruttaSemiAutomatica = random.nextInt(frutta.length);
            int decorazioneSemiAutomatica = random.nextInt(decorazione.length);

            System.out.println("La tua torta sarà composta da:" + sceltaBaseSemiAutomatica + sceltaRipienoSemiAutomatica
                    + frutta[fruttaSemiAutomatica] + decorazione[decorazioneSemiAutomatica]);
        }


        // alla fine chiedo se l'utente è soddisfatto o se vuole rifare

    }
}
