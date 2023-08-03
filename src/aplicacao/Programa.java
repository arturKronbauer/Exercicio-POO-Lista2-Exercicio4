package aplicacao;

import java.util.Scanner;

import entidades.Aluno;

public class Programa {

	public static void main(String[] args) {
		String nome;
		float nota1, nota2, nota3, media;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome: ");
		nome = sc.nextLine();
		do {
			System.out.print("Nota 1: ");
			nota1 = sc.nextFloat();
		} while ((nota1 < 0) || (nota1 > 30));	
		
		do {
			System.out.print("Nota 2: ");
			nota2 = sc.nextFloat();
		} while ((nota2 < 0) || (nota2 > 35));
		
		do {
			System.out.print("Nota 3: ");
			nota3 = sc.nextFloat();
		} while ((nota3 < 0) || (nota3 > 35));	
		
		Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
		System.out.println();
		media = aluno.getMedia();
		System.out.println("Nota Final: "+ String.format("%.2f", media));
		if (media >= 60.0) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Reprovado");
			float faltaram = 60 - media;
			System.out.println("Faltaram "+ String.format("%.2f",faltaram)+ " pontos");
		}
	}
}
