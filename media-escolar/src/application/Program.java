package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = sc.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if(media >= 6.0) {
			System.out.printf("Parabéns! Você foi aprovado(a). Sua nota é: %.2f%n", media);
		}else {
			System.out.printf("Reprovado. Sua nota é: %.2f", media);
		}
		
		sc.close();
	}

}
