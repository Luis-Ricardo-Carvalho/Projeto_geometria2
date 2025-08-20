package model;

public class Circle {
	
	private double radius;
	String description;

	public double getRadius() {
		return this.radius;		
	}
	
	public String getDescription(){
		return this.description;
	}	
	
	public Circle(String description, double radius){
		// Fail fast		
		validateRadius(radius);
		
		this.description = description;
		this.radius = radius;
		
	}
	
	public double area(){
		return Math.PI* Math.pow(radius, 2);
	}
	
	private void validateRadius(double radius) {
		if(radius <= 0)
			throw new IllegalArgumentException
			("O raio do circulo não pode ser menor ou igual a zero");
	}

}
