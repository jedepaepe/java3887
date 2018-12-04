package chocolat;

public class Chocolat {
    // attribut
    String nom;
    double pourcentageCacao;

    // constructeur : 
    //      1) porte le nom de la classe
    //      2) pas de valeur de retour
    //      3) pas statique
    public Chocolat() {
        System.out.println("Je construis un objet de type Chocolat");
    }
    
    boolean aphrodisiaque() {
        return pourcentageCacao > 80;
    }
    
    
}
