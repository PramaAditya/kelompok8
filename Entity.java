



abstract class Entity{
	
	//Atribut
	private Bound bound;

	protected Entity(Bound bound) {
		super();
		this.bound = bound;
	}

	//Setter & Getter
	public Bound getBound() {
		return bound;
	}
	
	public void setBound(Bound bound) {
		this.bound = bound;
	}
	
	public boolean collideCheck(Entity Other) {
		
		
		
		return bound.checkCollision(Other.getBound());
		
	}
	
	//Method
	public void die() {
	
	try {
		finalize();
	} catch (Throwable e) {
		e.printStackTrace();
	}
	
	}
	public void fall() {
		
	
	}
	
	abstract void print();
	
	
	
}

