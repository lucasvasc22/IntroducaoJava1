package Exercicios;

public class Slide25 {

	public static void main(String[] args) {
		
		//Operadores Aritm�ticos
		
		//Multiplica��o e Divis�o: *e/
		int um = 3/2;                    //divis�o de inteiros gera um inteiro
		float umEmeio = (float) 3/2;     //ocorre promo��o aritm�tica para um float
		double xyz = umEmeio * um;       //ocorre promo��o aritm�tica para float
		
		//M�dulo: %
		int resto = 7 % 2;               //resto = 1
		
		//Adi��o e Subtra��o
		long l = 1000 + 4000;
		double d = 1.0 - 0.01;
		
		//Concaten��o
		long var = 12345;
		String str = "O valor e var �: " +var;
	}

}
