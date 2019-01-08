
public class Chocolat extends Aliment {
    private String emballage;

    /**
     * Constructeur est une méthode très particulière:
     * 1) elle n'a pas de valeur de retour (void, Chocolat, ...)
     * 2) elle est utilisée avec l'opérateur
     *          new Chocolat("emballage de luxe")
     * 3) la méthode / constructeur doit avoir le même nom que la classe
     *      Chocolat noir = new Chocolat("emballage de luxe");
     *      Aliment chocolatNoir = new Chocolat("emballage de luxe");
     * @param nom
     * @param emballage 
     */
    public Chocolat(String emballage, String nom) {
        // super doit être la première
        super(nom); // constructeur de la classe mère "new Aliment(nom);"
        this.emballage = emballage;
    }


    public String getEmballage() {
        return emballage;
    }

    public void setEmballage(String emballage) {
        this.emballage = emballage;
    }
    
}
