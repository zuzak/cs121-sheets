import java.util.Random;
public class Numbers {
	static Random seed = new Random();
	static int currNumber;
	static final int maxNumber = 10;
	
	public static void genNumber(){
		currNumber = seed.nextInt(maxNumber)+1;
	}
	
	public static int returnNumber(){
		return currNumber;
	}
}
