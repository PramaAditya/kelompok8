
public class Bullet extends Entity implements Movable {

	private int damage;
	
	
	

	protected Bullet(Bound bound, int damage) {
		super(bound);
		this.damage = damage;
	}
	
	

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	@Override
	public void print() {
		
	}


	public void moveTo(int x, int y) {
		this.getBound().setLocation(x, y);

	}

	public void moveAmount(int dx, int dy) {
		this.getBound().setLocation((int)getBound().getX()+dx, (int)getBound().getY()+dy);
	}

	

	

}
