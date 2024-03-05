public class Cercle extends Forme {
    
    private int rayon;
    
    // Constructeur de la classe Cercle
    public Cercle(int rayon) {
        this.rayon = rayon;
    }
    
    // Getter pour obtenir le rayon du cercle
    public int getRayon() {
        return this.rayon;
    }
    
    // Méthode pour calculer la circonférence du cercle
    public double circonference() {
        // La formule de la circonférence d'un cercle est 2 * π * r (2 * pi * rayon)
        return 2 * Math.PI * this.rayon;
    }
    
    // Méthode pour calculer la surface du cercle
    public double surface() {
        // La formule de la surface d'un cercle est π * r^2 (pi * rayon au carré)
        return Math.PI * Math.pow(this.rayon, 2);
    }
    
    // Méthode pour afficher les détails du cercle
    public void affiche() {
        System.out.println("Cercle de rayon " + this.rayon);
        System.out.println("Circonférence du cercle : " + circonference());
        System.out.println("Surface du cercle : " + surface());
    }
    
}
