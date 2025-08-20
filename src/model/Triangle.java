package model;

public class Triangle {
	private double height,base;
	private String description;
	
	public Triangle(String description, double base, double height){
		// Fail fast
		validateBase(base);
		
		validateHeight(height);
		
		this.description = description;
		this.base = base;
		this.height = height;
		
	}
	
	public String getDescription() {
		return this.description;
	}

	public double getHeight() {
		return this.height;
	}

	public double getBase() {
		return this.base;		
	}
	
	public double area(){
		return (height * base)/2;
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
			("A base do triângulo não pode ser menor ou igual a zero");
	}
	
	private void validateHeight(double height) {
		if(height <= 0)
			throw new IllegalArgumentException
			("A altura do triângulo não pode ser menor ou igual a zero");
	}

}