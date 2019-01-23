/**
 * Simulation of a circle
 * 		hérite de GeometricObjec
 */
public class Circle extends GeometricObject{
	
	/**
	 * rayon du cercle, valeur par défaut
	 */
	private double radius = 1.;

    /**
     * Constructeur sans paramètre
     */
    public Circle() {
    }

    /**
     * Constructeur avec le rayon comme seul paramètre
     * @param radius est le rayon
     */
    public Circle(double radius) {
    	// this est la référence sur l'instance courante de Circle (l'objet courant)
        this.radius = radius;
    }

    /**
     * Constructeur avec 3 paramètres
     * @param radius est le rayon du cercle
     * @param color est la couleur du cercle
     * @param filled indique si le cercle est rempli
     */
    public Circle(double radius, String color, boolean filled) {
    	// super(color, filled) appelle le constructeur de la classe mère: GeometricObject(color, filled)
        super(color, filled);
        // on préfère appeler la fonction setRadius car elle contrôle si le rayon est correct
        setRadius(radius);
    }

    /**
     * 
     * @return le rayon du cercle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * assigne une valeur au rayon
     * @param radius 
     * note: la méthode est déclarée final car elle est utilisée dans le constructeur
     * final indique que la méthode ne peut pas être override (par une classe qui hériterait de Circle)
     *      je sais, c'est compliqué et optionnel, mais c'est aussi que serait écrit du code professionnel
     *          => retenez que parfois on déclare des méthodes "final",
     *          et cela veut dire que c'est la version finale de la méthode
     */
    public final void setRadius(double radius) {
        this.radius =  Math.abs(radius);
    }
    
    /**
     * 
     * @return l'aire du cercle : PI * R^2
     */
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    
    /**
     * 
     * @return le périmètre du cercle : 2 * PI * R
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    /**
     * 
     * @return le diamètre du cercle : 2 * R
     */
    public double getDiameter() {
        return 2 * radius;
    }
}
