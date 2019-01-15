
/**
 * Classe pour jouer avec les classes Node, Directory & File
 * (FS : File System)
 * @author jedepaepe
 */
public class DemoFS {
    /**
     * Point d'entrée pour exécuter le code
     * @param args sont les arguments de la ligne de commande
     */
    public static void main(String[] args) {
        Directory e2Points = new Directory(null, "E:");
        Directory photos = new Directory(e2Points, "photos");
        File anniversaire = new File(photos, "anniversaire.jpg", 8239);
        System.out.println("anniv. extension: " + anniversaire.getExtension());
        System.out.println("anniv. path: " + anniversaire.getAbsolutePath());
        System.out.println("e2Points nombres enfants " + e2Points.countChildren());
    }
}
