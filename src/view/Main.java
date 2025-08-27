package view;

import java.util.Scanner;

import model.Calc;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calc c = new Calc();

		System.out.println(c.decimalToBinary(10));	
		System.out.println(c.decimalToHex(10));
		System.out.println(c.restOfDiv(10, 7));	
		System.out.println(c.factorial(5));			
		System.out.println(c.sumPercentage(10, 5));	
		System.out.println(c.subPercentage(10, 5));	
		System.out.println(c.percentageDeValue(10, 10));	

		System.out.println("Histórioco de operações");
		for (String operation: c.getLastOperations()) {
			System.out.println(operation);
		}
		
		String option;
		do {
			
			System.out.println();
			System.out.println("Escolha uma opção"
					+ "\n 1 - Soma"
					+ "\n 2 - Subtração"
					+ "\n 3 - Divisão"
					+ "\n 4 - Multiplicação"
					+ "\n N - Sair");
			option = scanner.next().toUpperCase();
		
			double num1,num2;
				switch (option) {
					case "1":
						System.out.println("Digite um número para Soma:");
						num1 = scanner.nextDouble();
						System.out.println("Digite outro número para Soma:");
						num2 = scanner.nextDouble();
			
						System.out.println(c.sum(num1, num2));	
						break;
						
					case "2":
						System.out.println("Digite um número para Subtração:");
						num1 = scanner.nextDouble();
						System.out.println("Digite outro número para Subtração:");
						num2 = scanner.nextDouble();
			
						System.out.println(c.sub(num1, num2));	
						break;
						
					case "3":
						System.out.println("Digite um número para Divisão:");
						num1 = scanner.nextDouble();
						System.out.println("Digite outro número para Divisão:");
						num2 = scanner.nextDouble();
			
						System.out.println(c.div(num1, num2));	
						break;
						
					case "4":
						System.out.println("Digite um número para Multiplicação:");
						num1 = scanner.nextDouble();
						System.out.println("Digite outro número para Multiplicação:");
						num2 = scanner.nextDouble();
			
						System.out.println(c.mul(num1, num2));	
						break;
						
					case "N":
						System.out.println("Encerrando a calculadora...");						
					break;
					
					default:
						System.out.println("Opção inválida tente novamente");
					break;
				}
			
		}while(!option.equals("N"));

		System.out.println("Histórioco de operações");
		for (String operation: c.getLastOperations()) {
			System.out.println(operation);
		}

		
		

	}

}
