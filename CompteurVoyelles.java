import java.util.Scanner;

public class CompteurVoyelles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer un mot : ");
        String mot = scanner.nextLine().toLowerCase(); // Convertir le mot en minuscules pour simplifier la vérification

        int compteurVoyelles = 0;
        for (int i = 0; i < mot.length(); i++) {
            char lettre = mot.charAt(i);
            if (lettre == 'a' || lettre == 'e' || lettre == 'i' || lettre == 'o' || lettre == 'u' || lettre == 'y') {
                compteurVoyelles++;
            }
        }

        System.out.println("Le mot \"" + mot + "\" comprend " + compteurVoyelles + " voyelles.");
    }
}