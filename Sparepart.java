
public class Sparepart {
	private int value;
	
	public void add (int i){
	this.value += i;}
	public void add (Sparepart other){
	this.value += other.value; 
	try {
		other.finalize();
	} catch (Throwable e) {
		e.printStackTrace();
	}
	}
	
	
	public int getValue() {
		return value;
	}
	
	
}