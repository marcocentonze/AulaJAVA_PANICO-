import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class EsercizioLoStadio {
    public static void main(String[] args) {
//inizializzo gli oggetti
 Scanner scanner = new Scanner(System.in);
 Random random = new Random();
  
 //chiedo all'utente quanti weekend
 System.out.println("Inserisci il numero di weekend: ");
 int numeroWeekend = scanner.nextInt();


int spettatoreId = 0;
int guadagnoTotale= 0;


//Simulazione spettatori più id univoco
int spettatoriSabato = random.nextInt(75800) + 1;
int spettatoriDomenica= random.nextInt(75800) +1;


//




    }
}

// obiettivi:
// 1 Creare un sistema di id crescente che conti quante persone vengono allo
// stadio
// 2 Il sistema deve permetterti di randomizzare X week end per fare stime di affluenza
// Le stime che devi far fare sono: Min spettatori,Max spettatori,Max icass e min incasso
// 3 Ogni biglietto costa il sabato 20$ e la domenica 15$,deve essere possibile filtrare come scelta per giorno

//chiedo prima input quanti weekend
// generare una quantità di persone e dare un id a ciascuna
// analisi dei dati
//se 0 weekend allora ciao