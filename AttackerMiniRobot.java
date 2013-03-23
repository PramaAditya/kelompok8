
abstract class AttackerMiniRobot extends miniRobot {
   
	protected abstract int getAttack();
	protected abstract int getDefend();

	public AttackerMiniRobot(Bound bound) {
		super(bound);
		// TODO Auto-generated constructor stub
	}

	// delegation
    private  Attacker i;
 	
	// normal attributes
    public void horizontal() { i = new Horizontal(); }
    public void vertical() 	 { i = new Vertical(); }
    public void diagonal() 	 { i = new Diagonal(); }
	
	protected void shoot (int damage) 
    {  
		i.shoot(damage); 
	}
	
}
