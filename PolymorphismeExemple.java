class Animal{
    public void son(){
        System.out.println("L'animal fait un son");
    }
}

class Chien extends Animal{
    public void son() {
        System.out.println("Le Chien dit : Bow Bow");
    }
}

class Chat extends Animal{
    public void son() {
        System.out.println("Le Chat dit : Miaou Miaou");
    }
}

class Canard extends Animal{
    public void son() {
        System.out.println("Le Canard dit : coin coin");
    }
}

class Mouton extends Animal{
    public void son() {
        System.out.println("Le Mouton dit : beh beh");
    }
}

public class PolymorphismeExemple{
    public static void main(String[] args) {
        Animal animal=new Animal();
        Animal Chien=new Chien();
        Animal Chat=new Chat();
        Animal Canard=new Canard();
        Animal Mouton=new Mouton();

        animal.son();
        Chien.son();
        Chat.son();
        Canard.son();
        Mouton.son();
    }
}

