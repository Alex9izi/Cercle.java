import java.util.Scanner;

public class SommeImpairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un nombre :");
        int nombre = scanner.nextInt();
        int somme = calculeSommeImpairs(nombre);

        System.out.println("La somme des nombres impairs jusqu'à " + nombre + " est " + somme);

        scanner.close();
    }

    public static int calculeSommeImpairs(int max) {
        int somme = 0;

        for (int i = 1; i <= max; i++) {
            if (i % 2 != 0) {
                somme += i;
            }
        }

        return somme;
    }
}
