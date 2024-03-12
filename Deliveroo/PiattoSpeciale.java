public class PiattoSpeciale {
    private String tipoPane;
    private String tipoFarcitura;
    private int panePrezzo;
    private int prezzoFarcitura;
    private int totalePiatto;

    public PiattoSpeciale(String pane,int panePrezzo, String farcitura,int prezzoFarcitura) {
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

    public int getpanePrezzo() {
        return panePrezzo;
    }
}
