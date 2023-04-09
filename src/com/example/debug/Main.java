package com.example.debug;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuggyClass myClass = new BuggyClass();
		int factorial = myClass.factorial(6);
		System.out.println("El factorial de 6 es: " +  + factorial);
		myClass.imprimeImpares(50);
	}

}
