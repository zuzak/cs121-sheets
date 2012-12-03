public class Counter {
	private int count = 0;
	final int maxCount = 1; // final this
	public void incrementCount(){
		count++;
		if (count > maxCount) {
			resetCount();
		}
	}
	public int GetCount(){
		return count;
	}
	public void resetCount(){
		count = 0;
	}
	/*public void main(String args[]){
		incrementCount();
		incrementCount();
		System.out.println(GetCount());
	}	*/
}
