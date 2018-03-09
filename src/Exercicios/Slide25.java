package Exercicios;

public class Slide25 {

	public static void main(String[] args) {
		
		//Operadores Aritméticos
		
		//Multiplicação e Divisão: *e/
		int um = 3/2;                    //divisão de inteiros gera um inteiro
		float umEmeio = (float) 3/2;     //ocorre promoção aritmética para um float
		double xyz = umEmeio * um;       //ocorre promoção aritmética para float
		
		//Módulo: %
		int resto = 7 % 2;               //resto = 1
		
		//Adição e Subtração
		long l = 1000 + 4000;
		double d = 1.0 - 0.01;
		
		//Concatenção
		long var = 12345;
		String str = "O valor e var é: " +var;
	}

}
