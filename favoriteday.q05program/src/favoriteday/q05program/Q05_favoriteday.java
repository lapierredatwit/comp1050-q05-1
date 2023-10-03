package favoriteday.q05program;
import java.util.Scanner;
public class Q05_favoriteday {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is your favorite day of the week?");
		String day = input.nextLine();
		System.out.printf("%s is a great day!", day);

	}

}
