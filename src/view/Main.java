package view;

import model.Square;
import model.Circle;
import model.Rectangle;
import model.Triangle;
import view.console.SquareConsoleDrawer;
import view.console.CircleConsoleDrawer;
import view.console.RectangleConsoleDrawer;
import view.console.TriangleConsoleDrawer;

public class Main {

	public static void main(String[] args) {
		Square square1 = new Square("Q1",5);
		
		System.out.printf("%s, área: %.2f\n",
				square1.getDescription(),square1.area());
		
		System.out.println("Desenho: ");
		
		SquareConsoleDrawer squareConsoleDrawer =
				new SquareConsoleDrawer(square1);
		
		squareConsoleDrawer.draw();
		
		System.out.println();//--------------------------
		
		Rectangle rectangle1 = new Rectangle("R1",6,3);
		
		System.out.printf("%s, área: %.2f\n",
				rectangle1.getDescription(),rectangle1.area());
		
		System.out.println("Desenho: ");
		
		RectangleConsoleDrawer rectangleConsoleDrawer =
				new RectangleConsoleDrawer(rectangle1);
		
		rectangleConsoleDrawer.draw();
		
		System.out.println();//--------------------------
		
		Triangle triangle1 = new Triangle("T1",4,4);
		
		System.out.printf("%s, área: %.2f\n",
				triangle1.getDescription(),triangle1.area());
		
		System.out.println("Desenho: ");
		
		TriangleConsoleDrawer triangleConsoleDrawer =
				new TriangleConsoleDrawer(triangle1);
		
		triangleConsoleDrawer.draw();
		
		System.out.println();//--------------------------
		
		Circle circle1 = new Circle("C1",2);
		
		System.out.printf("%s, área: %.2f\n",
				circle1.getDescription(),circle1.area());
		
		System.out.println("Desenho: ");
		
		CircleConsoleDrawer circleConsoleDrawer =
				new CircleConsoleDrawer(circle1);
		
		circleConsoleDrawer.draw();


	}

}