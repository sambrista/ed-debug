package com.example.debug;

public class BuggyClass {

	public int factorial(int n) {
		int resultado = 0;
		for (int i = 1; i <= n; i++) {
			resultado = resultado * i;
		}
		return resultado;
	}
	public void imprimeImpares(int limite) {
		System.out.println("Inicio bucle");
		int j = limite; // Límite del bucle
	    for (int i = 0; i<j; j++) {
	    	if (i % 2 != 0) {
		        System.out.print(i);
		        if (j == 7) {
		        	System.out.print(" (el número de la suerte)");
		        }
		        System.out.println("");
	    	}
	    }
	    System.out.println("Fin bucle");
	}
	
}
