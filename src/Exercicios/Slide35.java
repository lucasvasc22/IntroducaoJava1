package Exercicios;

public class Slide35 {

	public static void main(String[] args) {
		
		//Controles de Fluxo do Programa
		
		int idade = 20;
		if ( idade <= 12){
			System.out.println("Criança");
		}
		
		if( idade > 12 && idade <= 19){
			System.out.println("Adolescente");
		}
		
		if( idade > 19 && idade <= 60){
			System.out.println("Adulto");
		}
		if( idade > 60){
			System.out.println("Idoso");
		}
	}

}
