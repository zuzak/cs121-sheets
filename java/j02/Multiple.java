class Multiple {
	public static void main(String[] args){
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		
		if ((n1 % n2) == 0) {
			System.out.println(n1 + " is a multiple of " + n2);
		} else if ((n2 % n1) == 0) {
			System.out.println(n2 + " is a multiple of " + n1);
		} else {
			System.out.println(n1 + " and " + n2 + " are not multiples of each other");
		}
	}
}
