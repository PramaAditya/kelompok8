public final class Purama extends AttackerMiniRobot  {
	
	

	public String name = this.getClass().getName();
	private static int level=1;
	private static int cost=10;
	private static int energy=10;
	private static boolean playable=true;
	private static int attack=40;
	private static int defend=500;
	
	private int health=defend;
	
	
	public Purama(Bound bound) {
		super(bound);
		horizontal();
		
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}


	protected int getAttack() {
		// TODO Auto-generated method stub
		return attack;
		}

	protected int getDefend() {
		return defend;
	}

	/*************************Getter level********************************/
	public static int getLevel() {
		return level;
	}

	/*************************Getter cost********************************/
	public static int getCost() {
		return cost;
	}

	/*************************Getter energy********************************/
	public static int getEnergy() {
		return energy;
	}

	/*************************Getter playable********************************/
	public static boolean isPlayable() {
		return  playable;
	}

	/*************************Setter level********************************/
	public static void setLevel(int level) {
		Purama.level = level;
	}

	/*************************Setter cost********************************/
	public static void setCost(int cost) {
		Purama.cost = cost;
	}

	/*************************Setter energy********************************/
	public static void setEnergy(int energy) {
		Purama.energy = energy;
	}

	/*************************Setter playable********************************/
	public static void setPlayable(boolean playable) {
		Purama.playable = playable;
	}

	public void shoot(){
		this.shoot(this.getAttack());
	}
	

	

	
	
}



