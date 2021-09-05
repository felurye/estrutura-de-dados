import java.util.Scanner;

/**
 * Para ajudar a calcular as notas referentes às duas avaliações dos alunos, uma
 * professora pediu para que você desenvolva um programa que calcule e imprima a
 * média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota
 * válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada
 * separadamente. <br>
 * <br>
 * 
 * <strong>Entrada:</strong> <br>
 * A entrada contém vários valores reais, positivos ou negativos. O programa
 * deve ser encerrado quando forem lidas duas notas válidas.<br>
 * <br>
 * 
 * <strong>Saída:</strong><br>
 * Se uma nota inválida for lida, deve ser impressa a mensagem "nota invalida".
 * Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media =
 * " seguido do valor do cálculo. O valor deve ser apresentado com duas casas
 * após o ponto decimal.
 */
public class ValidacaoNotas {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int count = 0;
		float total = 0;
		while (count != 2) {
			double x = input.nextFloat();
			if (x >= 0 && x <= 10) {
				total += x;
				count++;
			} else {
				System.out.println("nota invalida");
			}
		}
		System.out.printf("media = %.2f\n", (total / count));
		input.close();
	}
}
