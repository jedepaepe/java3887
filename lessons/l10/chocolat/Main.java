package chocolat;

public class Main {
    
    public static void main(String[] args) {        
        Chocolat noir = new Chocolat();
        noir.nom = "Chocolat noir";
        noir.pourcentageCacao = 70;
        noir.ingredients[0] = new Ingredient();
        noir.ingredients[0].nom = "succre";
        noir.ingredients[0].quantite = 30;
        System.out.println(noir.nom + " - " + noir.pourcentageCacao + "% cacao");
        System.out.println("Est-il aphrodisiaque? " + noir.aphrodisiaque());
        
        System.out.println("");
        
        Chocolat noirDeNoir = new Chocolat();
        noirDeNoir.nom = "Intense";
        noirDeNoir.pourcentageCacao = 90;
        System.out.println(noirDeNoir.nom + " - " + noirDeNoir.pourcentageCacao + "% cacao");
        System.out.println("Est-il aphrodisiaque? " + noirDeNoir.aphrodisiaque());
        
    }
    
}
