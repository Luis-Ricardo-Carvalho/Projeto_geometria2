package view.console;

import model.Rectangle;

public class RectangleConsoleDrawer {
	private Rectangle rectangle;
	
	public RectangleConsoleDrawer(Rectangle square) {
		if(square == null)
			throw new IllegalArgumentException(
					"É necessário uma instância válida de Rectangle.");
		
		this.rectangle = square;
	}
	
	public void draw() {
		for(int i = 0; i < rectangle.getHeight(); i++) {
			for(int j = 0; j < rectangle.getBase(); j++)
				System.out.print(". ");
			System.out.println("");
		}
	}
}
