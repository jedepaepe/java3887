/**
 * Répésentation d'un fichier
 * @author jedepaepe
 */
public class File extends Node {
    /**
     * Nombre d'octets
     */
    private long size;

    /**
     * Constructeur qui initialise l'ensemble des attribut
     * @param parent est le répertoire parent
     * @param nom est le nom du fichier
     * @param size est la taille du fichier
     */
    public File(Directory parent, String nom, long size) {
        super(parent, nom);
        this.size = size;
    }

    /**
     * 
     * @return la taille du fichier
     */
    public long getSize() {
        return size;
    }

    /**
     * Change la valeur de la taille du fichier
     * @param size est la nouvelle du fichier
     */
    public void setSize(long size) {
        this.size = size;
    }
    
    /**
     * calcule l'extension du fichier
     * par exemple "mon.travail.xlsx" a pour extension "xlsx"
     * @return l'extension du fichier
     *      et retourne une chaîne de caractère vide s'il n'y a pas d'extension
     * TODO : test "nom-de-fichier-avec-point-final."
     */
    public String getExtension() {
        // pour le split voir https://stackoverflow.com/questions/14833008/java-string-split-with-dot
        // la méthode split ne prend pas une chaîne de caractères comme paramètre mais un regex
        // un regex, c'est une expression (voir https://fr.wikipedia.org/wiki/Expression_r%C3%A9guli%C3%A8re)
        // le "//." indique qu'on splitte sur le caractère "."
        String part[] = getNom().split("\\.");
        if(part.length <= 1) {
            return "";
        } else {
            return part[part.length - 1];
        }
    }
}
