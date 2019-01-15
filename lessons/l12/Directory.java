/**
 * Répertoire
 * @author jedepaepe
 */
class Directory extends Node {
    private Node[] children = new Node[2]; // 2 : c'est trop mais c'est voulu

    public Directory(Directory parent, String nom) {
        super(parent, nom);
    }

    /**
     * @return une copie de la liste des noeuds enfants
     */
    public Node[] getChildren() {
        Node[] copy = new Node[this.countChildren()];
        for(int i = 0; i < copy.length; i++) {
            copy[i] = children[i];
        }
        return copy;
    }

    /**
     * Compte le nombre d'enfants que contient la directory
     * @return nombre d'enfants
     */
    public int countChildren() {
        int count = 0;
        for(int i = 0; i < children.length; i++) {
            if(children[i] != null) count++;
        }
        return count;
    }

    /**
     * ajoute un noeud enfant dans la liste des noeuds contenus dans le répertoire
     * @param child 
     */
    void addChild(Node child) {
        for(int i = 0; i < children.length; i++) {
            if(children[i] == null) {
                children[i] = child;
                break;  // cassé la boucle for
            }
        }
        // TODO gérer le cas où il n'y a plus de place
        // il faudrait initialiser une nouvelle liste children = new Node[2 * length précédente]
        // copier les références de l'ancienne liste children dans la nouvelle liste children
        // et ajouter le nouveau
    }

}
