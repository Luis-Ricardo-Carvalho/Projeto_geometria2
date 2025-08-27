package model;

import java.util.List;
import java.util.ArrayList;

public class Calc {
	
	private List<String> lastOperations;
	
	public Calc() {
		lastOperations = new ArrayList<String>();
	}
	
	public double sum(double n1, double n2) {
		double sum = n1+n2;
		
		saveOperation(n1, "+", n2, sum);
		
		return sum;
	}
	
	public double sub(double n1, double n2) {
		double sub = n1-n2;
		
		saveOperation(n1, "-", n2, sub);
		
		return sub;
	}
	
	public double mul(double n1, double n2) {
		double mult = n1*n2;
		
		saveOperation(n1, "*", n2, mult);
		
		return mult;
	}
	
	public double div(double n1, double n2) {
		if (n1 <= 0)
			throw new IllegalArgumentException("Numerador inválido");
		if (n2 <= 0)
			throw new IllegalArgumentException("Denominador inválido");
		
		double div = n1/n2;
		
		saveOperation(n1, "/", n2, div);
		
		return div;
	}
	
	public double restOfDiv(double n1, double n2) {
		double rest = n1%n2;
		
		saveOperation(n1, "%", n2, rest);
		
		return rest;
	}
	
	public double factorial(double n1) {
		if (n1 < 0)
			throw new IllegalArgumentException("Numero inválido");
		
		double fact = 1;
		
		for (int i = 1; i <= n1; i++) {
			fact = fact * i;
        }
		
		saveOperationFactorial(n1, "!", fact);
		
		return fact;
	}
	
	public String decimalToBinary(double n) {
		String decimalToBinary = Integer.toBinaryString((int) Math.round(n));
		
		saveOperationDecimalTo(n, "binário", decimalToBinary);
		
        return decimalToBinary;
    }
	
	public String decimalToHex(double n) {
		String decimalToHex = Integer.toHexString((int) Math.round(n));
		
		saveOperationDecimalTo(n, "hexadecimal", decimalToHex);
		
        return decimalToHex;
    }
	
	public double sumPercentage(double n, double percentage) {
		double sumPercentage = n + (n * percentage / 100);
		
		saveOperation(n, "+ %", (percentage / 100), sumPercentage);
		
        return sumPercentage;
    }

    public double subPercentage(double n, double percentage) {
    	double subPercentage = n - (n * percentage / 100);
    	
		saveOperation(n, "- %", (percentage / 100), subPercentage);
    	
        return subPercentage;
    }

    public double percentageDeValue(double n, double percentage) {
    	double percentageDeValue = (percentage / 100) * n;
    	
		saveOperation((percentage / 100), "de", n, percentageDeValue);
    	
        return percentageDeValue;
    }
	
	public List<String> getLastOperations(){
		List<String> copyLastOperations = new ArrayList<>();
		
		for (String operation : lastOperations) {
			copyLastOperations.add(operation);
			
		}
		
		return copyLastOperations;
	}
	
	private void saveOperationFactorial(double n1, String operation, double result) {
		
		String operationStr = String.format
				("Operação: %.2f %s = %.2f", n1, operation, result);
		
		lastOperations.add(operationStr);
		
	}
	
	private void saveOperation(double n1, String operation, double n2, double result) {
		
		String operationStr = String.format
				("Operação: %.2f %s %.2f = %.2f", n1, operation, n2, result);
		
		lastOperations.add(operationStr);
		
	}
	
	
	private void saveOperationDecimalTo(double n1, String operation, String result) {
		
		String operationStr = String.format
				("Operação: decimal %.2f para %s %s", n1, operation, result);
		
		lastOperations.add(operationStr);
		
	}
	


}
