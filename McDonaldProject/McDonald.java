import java.util.Scanner;

public class McDonald {
    private static Scanner scanner = new Scanner(System.in);
    private static int sceltaBudget;

    public static void main(String[] args) {
        Login login = new Login();
        login.userLogin();
    }

    public static void scegliBudget() {
        System.out.println("Scegli il tuo budget:");
        System.out.println("1. €10");
        System.out.println("2. €20");
        System.out.println("3. €30");
        System.out.println("4. €40");
        sceltaBudget = scanner.nextInt();
        scanner.nextLine();

    }

    public void checkPersone() {

        System.out.println("Quante persone(max 4)");
        int conteggioPersone = scanner.nextInt();
        // scanner.nextLine();

        if (conteggioPersone < 1 || conteggioPersone > 4) {
            System.out.println("Conteggio non valido,riprovare.");
        } else {
            // richiamo metodo per scegliere menù abbinato al budget scelto
        }
    }

    public void scegliMenu() {
        switch (sceltaBudget) {
            case 1:
                System.out.println("Hai scelto il Menù 1");

                break;
            case 2:
                System.out.println("Hai scelto il Menù 2");

                break;
            case 3:
                System.out.println("Hai scelto il Menù 3");

                break;
            case 4:
                System.out.println("Hai scelto il Menù 4");

                break;

            default:
                break;
        }
    }
}
