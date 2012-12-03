import java.util.Scanner;
public class GuessTheNumber{
	static Scanner scan = new Scanner(System.in);
	static int currGuess;
	static Numbers foo = new Numbers();
	public static void main(String args[]) {
		//System.out.println(Numbers.getNumber());
		foo.genNumber();	
		while (true) {
			while (true) {
				//System.out.println(foo.returnNumber());
				System.out.println("Please guess a number.");
				currGuess = scan.nextInt();
				if (currGuess == foo.returnNumber()){
					System.out.println("Yay! That was correct! Brucie would be proud.");
					break;
				} else if (currGuess > foo.returnNumber()) {
					System.out.println("Nay. That's too high.");
				} else {
					System.out.println("Nay. That's too low.");
				}
			}
			System.out.println("Would you like to play again? [true/false]");
			if (scan.nextBoolean() == false) {
				break;
			}
		}
	}
}
