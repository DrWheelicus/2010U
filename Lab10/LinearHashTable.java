public class LinearHashTable<T> extends Hashtable<T> {

	public LinearHashTable(int capacity){
		super(capacity);
	}
	 
	 public int rehash(int prevHash){
		 //add one to previous index
		 //return new value modulus size of array capacity 
		 int re = prevHash += 1;
		 return re % capacity;
	 }
}
