
import java.lang.reflect.Array;
import java.awt.Rectangle;

@SuppressWarnings("unused")
public class Field {
	//atribute
	private int energy;
	
	private Rectangle border;
	static private Grid[][] grid; //= new Grid [panjang][lebar];
	/*
	 * panjang = border.getLength() 
	 * lebar   = border.getWidth() 
	*/
	
	
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public Rectangle getBorder() {
		return border;
	}
	public void setBorder(Rectangle border) {
		this.border = border;
	}
	public static Grid[][] getGrid() {
		return grid;
	}
	public static void setGrid(Grid[][] grid) {
		Field.grid = grid;
	}
	
	
	
}