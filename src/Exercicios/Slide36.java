package Exercicios;

public class Slide36 {

	public static void main(String[] args) {
		
		//Controle de Fluxo do Programa (if() / else
		int idade = 20;
		if( idade <= 12){
			System.out.println("Crian�a");
		}
		else if( idade <= 19 ){
			System.out.println("Adolescente");
		}
		else if( idade <= 60) {
			System.out.println("Adulto");
		}
		else {
			System.out.println("Idoso");
		}
	}

}