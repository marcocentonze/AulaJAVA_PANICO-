
import java.util.Scanner;

public class Smartphone extends DispositivoElettronico {
    private String nome;
    private String password;
    Scanner scanner = new Scanner(System.in);// inizializzo il mio scanner

    public Smartphone(String nome, String password) {
        this.nome = nome;
        this.password = password;
    }

    // faccio l'override
    public void avviaApplicazione(String nomeApp) {
        System.out.println(" Si sta avviando " + nomeApp
                + " su smartphone ");
        loggin(); // richiamo la funzione

    }

    // mi creo la funzione per il login
    private void loggin() {
        String nomeValido = "Marco";
        String passwordAccettata = "Centonze";
        boolean accessoEffettuato = false;

        for (int i = 1; i <= 3; i++) { // i sarebbero i tentativi massimi(3)
            System.out.print("Inserisci il tuo nome: ");
            this.nome = scanner.nextLine();

            System.out.print("Inserisci la tua password: ");
            this.password = scanner.nextLine();

            if (this.nome.equals(nomeValido) && this.password.equals(passwordAccettata)) {
                System.out.println("Hai effettuato correttamente l'accesso");
                accessoEffettuato = true;
                break; // dati corretti quindi esce dal ciclo
            } else {
                System.out.println("Nome utente o password errati. Hai ancora " + (3 - i) + " tentativi.");
            }
        }

        if (!accessoEffettuato) {
            System.out.println("Hai superato il numero massimo di tentativi.Riprova tra 2h");
            System.exit(0); // termina l'esecuzione del progrmama
        }

    }

    // mi creo i getter e setter per poterli usare fuori dalla classe
    // Getter per il nome
    public String getNome() {
        return nome;
    }

    // Getter per la password
    public String getPassword() {
        return password;
    }

    // Setter per il nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Setter per la password
    public void setPassword(String password) {
        this.password = password;
    }
}