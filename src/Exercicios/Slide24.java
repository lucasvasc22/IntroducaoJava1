package Exercicios;

public class Slide24 {

	public static void main(String[] args) {
		
		//Incremento e Decremento: ++e--
		int a = 0;
		int b = a++;     //incrementando depois de atribuir
		int c = ++a;     //incrementando antes de atribuir
		b = a--;         //decrementando depois de atribuir
		c = --a;         //decrementando antes de atribuir
		
		//Mais e Menos Un�rio: + e -
		int x = +3;      //x recebe o positivo 3
		x = -x;          //x recebe -3, neste caso
		
		
		//Invers�o de Bits: ~
		int i = -1;      //1 = -2 (os bits foram invertidos)
		
		//Complementar booleano: !
		boolean falsidade = ! (true);      //inverte o valor booleano
		
		//Convers�o de Tipos: (tipo)
		double d = 1.99;
		int ii = (int) d;     //converte de double p/ int (perda de precis�o)  
	}

}
