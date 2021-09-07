import java.util.Scanner;

public class ConversaoTempo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sec;
		sec = input.nextInt();
		int hour = sec / (3600);

		sec = sec - (hour * 3600);

		int min = sec / (60);
		sec = sec - (min * 60);

		System.out.println(hour + ":" + min + ":" + sec);
		input.close();
	}
}