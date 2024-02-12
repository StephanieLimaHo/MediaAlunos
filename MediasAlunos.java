package br.edu.ifpr.media;

import java.util.Scanner;

public class MediasAlunos {

	private static double[][] informarNotas(double notas[][]) {
		Scanner ler = new Scanner(System.in);
		int aluno = 1;
		for (int linha = 0; linha < notas.length; linha++) {
			System.out.println("Informe as notas do " + aluno + "° aluno:");
			for (int coluna = 0; coluna < notas[0].length; coluna++) {
				notas[linha][coluna] = ler.nextDouble();
			}
			aluno++;
		}
		return notas;
	}

	private static double calcularMedia(int aluno, double notas[][]) {
		double media = 0;
		aluno--;
		for (int linha = aluno; linha == aluno; linha++) {
			for (int coluna = 0; coluna < 4; coluna++) {
				media += notas[aluno][coluna];
			}
		}
		media = media / 4;
		return media;
	}

	public static void main(String[] args) {
		int opcao = 0;
		Scanner ler = new Scanner(System.in); // Iniciar o Scanner
		double[][] notasAlunos = new double[3][4]; // Criar o vetor
													// bidimensional
		notasAlunos = informarNotas(notasAlunos); // Chamar método para informar
													// notas
		do {
			System.out.println("Deseja calcular a média de qual aluno?\n: ");
			int aluno = ler.nextInt(); // Ver qual aluno o usuário deseja
										// calcular a
										// média
			double mediaAlunoEscolhido = calcularMedia(aluno, notasAlunos);
			System.out.println("A média do aluno escolhido é:" + mediaAlunoEscolhido);

			System.out.println("Se deseja sair digite '0', para continuar, pressione qualquer tecla.");
			opcao = ler.nextInt();
		} while (opcao != 0);
	}

}