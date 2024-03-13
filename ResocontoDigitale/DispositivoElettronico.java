
import java.util.Scanner;

public class DispositivoElettronico {
    public void avviaApplicazione(String nameApp) {
        System.out.println("L'applicazione si sta avviando e si chiama" + nameApp);
    }

    public class Smartphone extends DispositivoElettronico {
        private String nome;
        private String password;
        Scanner scanner = new Scanner(System.in);// inizializzo il mi scanner

        public Smartphone(String nome, String password) {
            this.nome = nome;
            this.password = password;
        }

        // faccio l'override
        public void avviaApplicazione(String nomeApp) {
            System.out.println("Si sta avviando" + nomeApp
                    + "su smartphone");
            loggin(); // richiamo la funzione

        }

        // mi creo la funzione per il login
        private void loggin() {
            String nomeValido = "Marco";
            String passwordAccettata = "Centonze";
            System.out.print("Inserisci il tuo nome: ");
            this.nome = scanner.nextLine();

            System.out.print("Inserisci la tua password: ");
            this.password = scanner.nextLine();

            if (nome == nomeValido && password == passwordAccettata) {
                System.out.println("Hai effettuato correttamente l'accesso");
            } else {
                return; // da testare
            }

        }
    }

}
