public class Main {
    public static void main(String[] args) {
        // mi creo tutti gli oggetti e richiamo anche i figli dalla classe padre
        DispositivoElettronico disp = new DispositivoElettronico();

        // chiamo il metodo
        disp.avviaApplicazione("App Webex");

        // oggetto smartphone(figlio)
        DispositivoElettronico smart = disp.new Smartphone("NomeUtente", "PasswordUtente");

        // chiamo il metodo
        smart.avviaApplicazione("WhatsApp");

        // oggetto tablet
        DispositivoElettronico tablet = new DispositivoElettronico.Tablet();

        // chiamo il metodo
        tablet.avviaApplicazione("Zoom");
    }
}
