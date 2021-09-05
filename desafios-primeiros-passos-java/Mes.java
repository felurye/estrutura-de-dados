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
 */
public class Mes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month;
		month = input.nextInt();

		switch (month) {
		case 1:
			System.out.printf("January\n");
			break;
		case 2:
			System.out.printf("February\n");
			break;
		case 3:
			System.out.printf("March\n");
			break;
		case 4:
			System.out.printf("April\n");
			break;
		case 5:
			System.out.printf("May\n");
			break;
		case 6:
			System.out.printf("June\n");
			break;
		case 7:
			System.out.printf("July\n");
			break;
		case 8:
			System.out.printf("August\n");
			break;
		case 9:
			System.out.printf("September\n");
			break;
		case 10:
			System.out.printf("October\n");
			break;
		case 11:
			System.out.printf("November\n");
			break;
		case 12:
			System.out.printf("December\n");
			break;
		default:
			System.out.printf("Invalid input\n");
		}

		input.close();
	}
}
