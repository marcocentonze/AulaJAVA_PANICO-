public class PiattoSpeciale {
    private String tipoPane;
    private String tipoFarcitura;
    private double panePrezzo;
    private double prezzoFarcitura;
    private double totalePiatto;

    public PiattoSpeciale(String pane,double panePrezzo, String farcitura,double prezzoFarcitura) {
        this.tipoPane = pane;
        this.panePrezzo = panePrezzo;
        this.tipoFarcitura = farcitura;
        this.prezzoFarcitura = prezzoFarcitura;
        this.totalePiatto = panePrezzo + prezzoFarcitura + 1; //+1 prezzo fisso

    }

    public String getTipoPane() {
        return tipoPane;
    }

    public void setTipoPane(String tipoPane) {
        this.tipoPane = tipoPane;
    }

    public String getTipoFarcitura() {
        return tipoFarcitura;
    }

    public void setTipoFarcitura(String tipoFarcitura) {
        this.tipoFarcitura = tipoFarcitura;
    }

    public double getpanePrezzo() {
        return panePrezzo;
    }
    public double getTotalePiatto() {
        return totalePiatto;
    }
}
