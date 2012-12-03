public class TestCounter {
	public static void main(String args[]){
		Counter foo = new Counter();

		foo.incrementCount();
		foo.incrementCount();
		foo.incrementCount();
		foo.incrementCount();
		foo.incrementCount(); // for loops are for losers


		System.out.println(foo.GetCount());
	}
}
