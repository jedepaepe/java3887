
import java.util.Date;

/**
 * Top level of the hierarchy
 * We put it as abstract because we don't want to instantiate it
 * 		that is logical : how to draw it?
 */
public abstract class GeometricObject {
    // l'initialisation des attributs est exécuté lors de l'appel du constructeur
    //      vous pouvez tester en mode DEBUG
	
	/**
	 * couleur de la forme, valeur par défaut est "vert"
	 */
    private String color = "vert";
    
    /**
     * indique si la forme est peinte (true: peinte à l'intérieur, false: seulement le bord), valeur par défaut : true
     */
    private boolean filled = true;
    
    /**
     * date de création de l'objet
     * 	constante initialisée à l'heure courante
     */
    private final Date createdAt = new Date();

    /**
     * Constructeur sans paramètre
     */
    public GeometricObject() {
    }

    /**
     * Contructeur avec paramètres
     * @param color
     * @param filled 
     */
    public GeometricObject(String color, boolean filled) {
    	// this est la référence sur l'instance courante de GeometricObject (l'objet courant)
    	// ici, on est obligé de l'écrire car une "conflit" de noms entre
    	//		color qui est le paramètre du constructeur "GoemetricObjec(String color, ..." ligne 28
    	//		color qui est l'attribut de la classe GeometricObject "private String color = "vert"; ligne 12
        this.color = color;
        this.filled = filled;
    }

    /**
     * getter de color
     * @return la couleur
     */
    public String getColor() {
        return color;
    }

    /**
     * setter de color : assigne une nouvelle couleur
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * getter de filled
     * (on utilise souvent isXXXX au lieu de getXXXX dans le cas d'un attribut boolean (true|false)
     * @return filled (la forme est-elle remplie par la couleur?)
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * setter de filled : assigne une nouvelle valeur à filled
     * @param filled 
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * getter de createdAt
     * @return la date de création de l'objet
     */
    public Date getCreatedAt() {
        return createdAt;
    }
    
    /**
     * retourne une String qui représente l'objet
     * @return la String
     */
    @Override
    public String toString() {
        return "GeometricObject{" + "color=" + color + ", filled=" + filled + ", createdAt=" + createdAt + '}';
    }
}
