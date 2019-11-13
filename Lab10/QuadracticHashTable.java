public class QuadracticHashTable<T> extends Hashtable<T> {
	
	public QuadracticHashTable(int capapcity){
		super(capapcity);
	}
	 
	 public int rehash(int prevHash){
		 //square the previous index
		 //return new value modulus array capacity
		 
		 int re = prevHash * prevHash;
		 return re % capacity;
		 
	 }
}
