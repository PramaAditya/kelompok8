
abstract class EnergizerMiniRobot extends miniRobot implements Energizer {

	public EnergizerMiniRobot(Bound bound) {
		super(bound);
		// TODO Auto-generated constructor stub
	}

	public Energy genEnergy(int time) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected abstract int getAttack();

	@Override
	protected abstract int getDefend();

}
