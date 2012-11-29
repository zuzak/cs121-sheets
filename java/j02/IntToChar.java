public class IntToChar {
	public static void main(String[] args) {
		char character;
		int integer = Integer.parseInt(args[0]);
//		character = Character.toChars(integer);
		character = (char) integer;
		System.out.println(character);
	}
}
