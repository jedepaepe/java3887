
import java.util.ArrayList;
import java.util.Scanner;

/**
 * UIGeom est une classe de type "controller + viewer"
 *  controller : contrôle (chef)
 *  viewer : interface utilisateur
 * 
 * UIGeom avec une fonction main qui: demande à l'utilisateur veux-tu créer un
 * cercle ou un rectangle? tape C pour créer un cercle tape R pour créer un
 * rectangle tape L pour lister tous les objets créés tape Q pour arrêter
 * l'application demande les paramètres nécessaire, par exemple pour le cercle:
 * quelle est la couleur? est une couleur pleine? quel est le rayon? quand tous
 * les paramètres sont remplis: l'objet est créé, l'application affiche, par
 * exemple : "Un cercle de couleur vert, non plein, de rayon 10 est créé"
 * l'objet est ajouté dans la liste des objets si l'utilisateur choisit l'option
 * "lister tous les objets créés", l'application affiche les caractéristique de
 * chaque objet, par exemple: "Un cercle de couleur vert, non plein, de rayon
 * 10"
 */
public class UIGeom {

    /**
     * Point d'entrée du programme
     * @param args 
     */
    public static void main(String[] args) {
        // mieux GeometricObject[] geometricObjects = new GeometricObject[10];
        // pas de problème de taille
        ArrayList<GeometricObject> geometricObjects = new ArrayList<>();
        // pour récupérer les données en provenance du clavier
        Scanner keyboard = new Scanner(System.in);
        // flag qui indique si l'application doit continuer ou s'arrêter
        boolean next = true;
        // boucle principale de l'application
        do {
            // le menu
            System.out.println("tape C pour créer un cercle");
            System.out.println("tape R pour créer un rectangle");
            System.out.println("tape L pour lister tous les objets créés");
            System.out.println("tape Q pour arrêter l'application");
            // récupérer la commande
            String cmd = keyboard.nextLine();
            // exécute un code différent en fonction de la commande
            switch (cmd) {
                case "C":
                    Circle circle = createCircle(keyboard);
                    geometricObjects.add(circle);
                    break;
                case "R":
                    System.out.println("Créer un rectangle");
                    break;
                case "L":
                    System.out.println("Liste des objets:");
                    for(int i = 0; i < geometricObjects.size(); i++) {
                        System.out.println(geometricObjects.get(i).toString());
                    }
                    break;
                case "Q":
                    System.out.println("Quitte l'application");
                    next = false;
                    break;
                default:
                    System.out.println("La commande " + cmd + " n'est pas supportée");
            }
        } while (next);
    }

    private static Circle createCircle(Scanner keyboard) {
        // récupère la couleur
        System.out.print("Couleur: ");
        String color = keyboard.nextLine();
        // récupère le fill (si le cercle est plein ou pas)
        System.out.print("Couleur pleine O/N: ");
        boolean fill = keyboard.nextBoolean();
        keyboard.nextLine();
        // récupère le rayib
        System.out.print("Rayon: ");
        double radius = keyboard.nextDouble();
        keyboard.nextLine();
        // crée le cercle
        Circle circle = new Circle(radius, color, fill);
        // informe l'utilisateur que le cercle est créé
        System.out.println("Cercle créé: " + circle);
        // retourne le cercle
        return circle;
    }
}
