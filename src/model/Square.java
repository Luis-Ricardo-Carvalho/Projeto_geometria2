package model;

public class Square {
	// Atributos
	private double side;
	private String description;
	
	// Métodos construtores
	public Square(String description,double side){
		// Fail fast
		validateSide(side);
		
		this.description = description;
		this.side = side;
		
	}
	
	// Métodos
	public String getDescription() {
		return description;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		validateSide(side);
		
		this.side = side;		
	}
	
	public double area() {				
		return side * side;
	}
	
	private void validateSide(double side) {
		if(side <= 0)
			throw new IllegalArgumentException
				("Lado do quadrado não pode ser menor ou igual a zero");
	}
		
}
