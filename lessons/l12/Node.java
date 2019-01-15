
/**
 * Un Node est soit un Directory ou un File
 * 
 *          Node
 *            î
 *     --------------
 *     |             |
 *   Directory     File
 * 
 * La classe Node est "abstract", c'est-à-dire abstraite,
 * donc elle ne peut pas être réel (= ne peut être instanciée, pas d'objet)
 */
public abstract class Node {
    /**
     * Nom du Node
     */
    private String nom;
    
    /**
     * Répertoire parent
     */
    private Directory parent;

    /**
     * Constructeur qui initialise tous les paramètres
     * @param nom est le nom du noeud
     * @param parent est le répertoire parent
     */
    public Node(Directory parent, String nom) {
        this.nom = nom;
        this.parent = parent;
        if(parent != null) {
            parent.addChild(this);
        }
    }

    /**
     * Retourne le nom du noeud
     * @return nom du noeud
     */
    public String getNom() {
        return nom;
    }

    /**
     * Change le nom du noeud
     * @param nom est le nouveau nom
     */
    public void setNom(String nom) {
        // TODO vérifier que le nom ne contient pas de caractères interdits (, \ ...)
        this.nom = nom;
    }

    /**
     * retourne une référence du répertoire parent
     * @return le répertoire
     */
    public Directory getParent() {
        return parent;
    }

    /**
     * change de répertoire
     * @param parent est une référence vers le nouveau répertoire
     */
    public void setParent(Directory parent) {
        // TODO : mettre à jour les listes children des parents (ancien & nouveau)
        this.parent = parent;
    }
    
    /**
     * Calcule et retourne le chemin absolu
     * @return le chemin absolu (par exemple D:\travaux\java\note20190114.docx)
     */
    public String getAbsolutePath() {
        Directory up = parent;
        String path = parent.getNom() + "\\" + nom;
        while((up = up.getParent()) != null) {
            path = up.getNom() + "\\" + path;
        }
        return path;
    }
    
}
