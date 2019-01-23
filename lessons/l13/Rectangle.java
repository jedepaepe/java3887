
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
	 * hauteur du rectangle
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
	 * @param length est la hauteur du rectangle
	 */
	public Rectangle(double width, double length) {
		super();
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
	 * getter (pour lire) de la hauteur
	 * @return la hauteur
	 */
	public double getLength() {
		return length;
	}

	/**
	 * setter (pour écrire) la hauteur
	 * @param length est la nouvelle hauteur
	 */
	public void setLength(double length) {
		this.length = length;
	}
	
	/**
	 * calcule l'aire du rectangle (largeur * hauteur)
	 * @return l'aire
	 */
	public double getArea() {
		return width * length;
	}
	
	/**
	 * calcule le périmètre 2 * hauteur + 2 * largeur
	 * @return le périmètre
	 */
	public double getPerimeter() {
		return 2 * (width + length);
	}

}
