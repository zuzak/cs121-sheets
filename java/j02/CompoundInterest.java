public class CompoundInterest {
	public static void main(String[] args){
		int p = Integer.parseInt(args[0]);
		int r = Integer.parseInt(args[1]);
		int n = Integer.parseInt(args[2]);
		double a = p * Math.pow((1+r),n);


		System.out.println(a);
		
	}
}
