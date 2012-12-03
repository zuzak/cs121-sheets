public class Counter {
	private int count = 0;
	int MaxCount = 9001; // final this
	public void incrementCount(){
		count++;
		System.out.println("Incremented");
		if (count > maxCount) {
			resetCount();
		}
	}
	public int GetCount(){
		return count;
	}
	public void resetCount(){
		count = 0;
		System.out.println("Reset")
	}
	/*public void main(String args[]){
		incrementCount();
		incrementCount();
		System.out.println(GetCount());
	}	*/
}
