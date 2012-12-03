public class TestCounter {
	public static void main(String args[]){
		Counter foo = new Counter();

		foo.incrementCount();
		foo.incrementCount();

		System.out.println(foo.GetCount());
	}
}
