/**
 * 
 * class to test GeometricObject & Circle & Rectangle
 *
 */
public class TestGeom {
	
	public static void main(String[] args) {
		Circle circle = new Circle(10, "bleu", false);
		System.out.println("couleur: " + circle.getColor());
		System.out.println("filled: " + circle.isFilled());
		System.out.println("rayon: " + circle.getRadius());
		System.out.println("di�tre: " + circle.getDiameter());
		System.out.println("p�rim�tre: " + circle.getPerimeter());
		System.out.println("aire: " + circle.getArea());
		System.out.println(circle.toString());
		
		System.out.println();
		
		circle.setColor("orange");
		circle.setFilled(true);
		circle.setRadius(1);
		System.out.println(circle.toString());
		
		System.out.println();
		
		Rectangle rectangle = new Rectangle(20, 10, "jaune", true);
		System.out.println("couleur: " + rectangle.getColor());
		System.out.println("filled: " + rectangle.isFilled());
		System.out.println("largeur: " + rectangle.getWidth());
		System.out.println("longueur: " + rectangle.getLength());
		System.out.println("p�rim�tre: " + rectangle.getPerimeter());
		System.out.println("aire: " + rectangle.getArea());
		System.out.println(rectangle.toString());
		
		System.out.println();
		
		rectangle.setColor("violet");
		rectangle.setFilled(false);
		rectangle.setWidth(2);
		rectangle.setLength(1);
		System.out.println(rectangle.toString());
	}
}
