import java.util.Random;
public class Numbers {
	static Random seed = new Random();
	static int currNumber;
	static final int maxNumber = 10;
	
	public static void int genNumber(){
		currNumber = seed.nextInt(maxNumber);
	}
	
	public static int returnNumber(){
		return currNumber;
	}
}
