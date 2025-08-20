package view.console;

import model.Circle;

public class CircleConsoleDrawer {
private Circle circle;
	
	public CircleConsoleDrawer(Circle circle) {
		if(circle == null)
			throw new IllegalArgumentException(
					"É necessário uma instância válida de Square.");
		
		this.circle = circle;
	}
	
	public void draw() {
		double radius = circle.getRadius();
        for (double y = -radius; y <= radius; y++) {
            for (double x = -radius; x <= radius; x++) {
                if (x * x + y * y <= radius * radius) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}
}
