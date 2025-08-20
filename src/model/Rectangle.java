package model;

public class Rectangle {
	
	private double base,height;
	private String description;
	
	// Métodos construtores
	public Rectangle(String description, double base, double height){
		// Fail fast
		validateBase(base);
		
		validateHeight(height);
		
		this.description = description;
		this.base = base;
		this.height = height;
		
	}
	
	// Métodos
	public String getDescription() {
		return description;
	}

	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double area() {				
		return base * height;
	}

	public void setBase(double base) {
		validateBase(base);
		
		this.base = base;		
	}

	public void setHeight(double height) {
		validateHeight(height);
		
		this.height = height;		
	}
	
	private void validateBase(double base) {
		if(base <= 0)
			throw new IllegalArgumentException
			("A base do retângulo não pode ser menor ou igual a zero");
	}
	
	private void validateHeight(double height) {
		if(height <= 0)
			throw new IllegalArgumentException
			("A altura do retângulo não pode ser menor ou igual a zero");
	}

}
