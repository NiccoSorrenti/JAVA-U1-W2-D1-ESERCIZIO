import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
        }

        stampaArray(array);

        while (true) {
            System.out.print("\nInserisci un numero (0 per terminare): ");
            int valore = scanner.nextInt();

            if (valore == 0) {
                System.out.println("Programma terminato.");
                break;
            }

            System.out.print("Inserisci la posizione (0-4): ");
            int posizione = scanner.nextInt();

            try {
                array[posizione] = valore;
                stampaArray(array);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Errore: posizione non valida. Inserire un indice tra 0 e 4.");
            }
        }

        scanner.close();
    }

    
    private static void stampaArray(int[] array) {
        System.out.print("Stato dell'array: ");
        for (int numero : array) {
            System.out.print(numero + " ");
        }
        System.out.println();

    }
}