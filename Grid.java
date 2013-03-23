
import java.awt.Rectangle;

public class Grid {
	//atribute
	private Rectangle bound;
	
	//methode
	boolean isGround (Rectangle other){
		return this.bound.intersects(other);
	}
	
	
	
	
	
}