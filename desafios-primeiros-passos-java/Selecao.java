import java.util.Scanner;

/**
 * Leia 4 valores inteiros A, B, C e D. Com base nisso, se o valor de B for
 * maior do que de C e se D for maior do que A, e a soma de C com D for maior
 * que a soma de A e B e se tanto C quanto D forem positivos e, ainda, se a
 * variável A for par, escreva a mensagem "Valores aceitos", senão escrever
 * "Valores nao aceitos". <br>
 * <br>
 * 
 * <strong>Entrada:</strong> <br>
 * Quatro números inteiros A, B, C e D.<br>
 * <br>
 * 
 * <strong>Saída:</strong> <br>
 * Imprima a mensagem corretamente esperada pela validação dos valores.
 * 
 */
public class Selecao {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();

		if (b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && (a % 2) == 0) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}

		scan.close();
	}
}
