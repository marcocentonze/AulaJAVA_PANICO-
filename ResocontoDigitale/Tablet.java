import java.util.Random;

public class Tablet extends DispositivoElettronico {
    private static int idCorrente = 0;
    private int punti;
    private int id;

    public Tablet() {
        Random random = new Random();
        this.punti = random.nextInt(101); // Punti random tra 0 e 100
        this.id = ++idCorrente; // Incrementa ID per ogni nuovo utente
    }

    // override
    public void avviaApplicazione(String nomeApp) {
        super.avviaApplicazione(nomeApp);
        System.out.println("L'Id del tablet è " + id + " e hai avviato l'applicazione " + nomeApp
                + " con  un totale di " + punti + " punti.");
    }

    // Getter per i punti
    public int getPunti() {
        return punti;
    }

    // Gettr per l'id
    public int getId() {
        return id;
    }
}
