import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;



public class Bound extends Rectangle {

	private static final long serialVersionUID = 1L;	
	private int left = (int)x;
	private int right= left+(int)width;
	private int top= (int)y;
	private int bottom= top-(int)height;
	
	
	
	public Bound() {
		super();
	}

	public Bound(Rectangle arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public Bound(Point arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public Bound(Dimension arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public Bound(int arg0, int arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public Bound(Point arg0, Dimension arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public Bound(int arg0, int arg1, int arg2, int arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public int getLeft() {
		return left;
	}

	public int getRight() {
		return right;
	}

	public int getTop() {
		return top;
	}

	public int getBottom() {
		return bottom;
	}

	

	public boolean checkCollisionHorizontal(Bound Other){
		
		boolean checkleft = ((left >= Other.left) && (left <= Other.right)) ;
		boolean checkright = ((right <= Other.left) && (right >= Other.right));
		
		
		
		return (checkleft || checkright);
	}
	
	public boolean checkCollisionVertical(Bound Other){
		
			boolean checktop = (top >= Other.bottom) && (this.top<=Other.top) ;
			boolean checkbottom = (Other.top >= bottom) && (this.bottom>=Other.bottom);
	
		
		//boolean checktop = ((Other.getY()-Other.getHeight()) - this.getX()) < 0 ;
		//boolean checkbottom = ( Other.getY() - (this.getY()-this.getHeight()) ) > 0;
		
		return (checktop || checkbottom);
	}
	
	public boolean checkCollision(Bound Other){
		
		
		return checkCollisionHorizontal(Other) && checkCollisionVertical (Other);
		
	}
	
	
	@Override
	public void setLocation(int dx, int dy){
	left = dx;
	right = dx+width;
	top = dy;
	bottom = dy-height;
	}
	
	public void print () {
	
	
		/*
		System.out.print ("height = ");
		System.out.println (height);

		System.out.print ("width = ");
		System.out.println (width);
		 */

		
		//System.out.println ("Koordinat Titik Sudut: ");\
	/*
		System.out.println ("a: ("+left+","+top+")"); 
		System.out.println ("b: ("+right+","+top+")"); 
		System.out.println ("c: ("+left+","+bottom+")"); 
		System.out.println ("d: ("+right+","+bottom+")"+"\n"); 
		*/
	System.out.println ("Left: "+left); 
	System.out.println ("Right: "+right); 
	System.out.println ("Top: "+top); 
	System.out.println ("Bottom: "+bottom+"\n");
	
	}
/*	
	public static void main (String[] args){
		
		Bound a = new Bound (10,10,5,5);
		Bound b = new Bound (0,0,5,5);
		
		a.print();
		b.print();
	
		
		 int dx= a.left;
		 int dy= a.top;
			do
			{	
			a.setLocation(dx,dy);
			dx--;
			dy--;
			
			}while(!a.checkCollision(b));
			System.out.println (a.checkCollision(b));
			
			
		a.print();
		b.print();
		
		
	
		
	}

*/
}
	
	
	

