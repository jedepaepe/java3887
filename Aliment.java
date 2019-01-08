public class Aliment {
    /**
     * nom de l'aliment
     * doit commencer par une majuscule
     */
    private String nom;
    
    public Aliment(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        // règle business sur le nom
        if(nom.length() == 0) {
            System.err.println("Nom est vide");
            return;
        }
        if(nom.charAt(0) >= 'A' && nom.charAt(0) < 'Z') {
            System.err.println("Nom ne commence pas par une majuscule " + nom);
            return;
        }
        // enregistre la modication
        System.out.println("this.nom changé en nom");
        
        // LE code
        this.nom = nom;
    }

    void print() {
        System.out.println(nom);
    }
}
