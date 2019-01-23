
/**
 * classe pour simuler un Rectangle
 *  	hérite de GeometricObject
 */
public class Rectangle extends GeometricObject {
	
	/**
	 * Largeur du rectangle
	 */
	private double width = 1.;
	
	/**
	 * longueur du rectangle
	 */
	private double length = 1.;
	
	/**
	 * Constructeur sans paramètre
	 */
	public Rectangle() {
		super();
	}

	/**
	 * Constructeur avec 2 paramètres
	 * @param width est la largeur du rectangle
	 * @param length est la longueur du rectangle
	 */
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	/**
	 * Constructeur avec 4 paramètres
	 * @param width est la largeur du rectangle
	 * @param length est la longueur du rectangle
	 * @param color est la couleur
	 * @param filled indique si le rectangle colorié à l'intérieur
	 */
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	/**
	 * getter (pour lire) de la largeur
	 * @return la largeur
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * setter (pour écrire) la largeur
	 * @param width est la nouvelle largeur
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * getter (pour lire) de la longueur
	 * @return la longueur
	 */
	public double getLength() {
		return length;
	}

	/**
	 * setter (pour écrire) la longueur
	 * @param length est la nouvelle longueur
	 */
	public void setLength(double length) {
		this.length = length;
	}
	
	/**
	 * calcule l'aire du rectangle (largeur * longueur)
	 * @return l'aire
	 */
	public double getArea() {
		return width * length;
	}
	
	/**
	 * calcule le périmètre 2 * longueur + 2 * largeur
	 * @return le périmètre
	 */
	public double getPerimeter() {
		return 2 * (width + length);
	}

	/* génère une String avec les attributs de Rectangle
	 * @param version String des attributs de Rectangle
	 */
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", " + super.toString() + "]";
	}

}
