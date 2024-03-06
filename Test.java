// Classe abstraite
abstract class Animal {
    // méthode abstraite (n'a pas de corps)
    public abstract void son();

    // méthode standard
    public void sleep() {
        System.out.println("Zzz");
        System.out.println("Zzz");
    }
}

// Sous-classe (hérite de Animal)
class Cochon extends Animal {
    @Override
    public void son() {
        // Le corps de son () est fourni ici
        System.out.println("Le cochon dit: wee wee");
        System.out.println("Le chat dit: miaou miaou");
    }
}

public class Test {
    public static void main(String[] args) {
        Cochon monCochon = new Cochon(); // crée un objet Cochon
        monCochon.son();
        monCochon.sleep();
    }
}
