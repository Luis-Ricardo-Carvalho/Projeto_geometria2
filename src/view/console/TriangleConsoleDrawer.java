package view.console;

import model.Triangle;

public class TriangleConsoleDrawer {
private Triangle triangle;
	
	public TriangleConsoleDrawer(Triangle triangle) {
		if(triangle == null)
			throw new IllegalArgumentException(
					"É necessário uma instância válida de Square.");
		
		this.triangle = triangle;
	}
	
	public void draw() {		
		for(int i = 0; i < triangle.getHeight(); i++) {
			for(int j = 0; j < i; j++) {
			System.out.print("* ");
			}
			System.out.println("");			
		}
	}

}
