
public class MainTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Purama p = new Purama(null);
		p.shoot();
		System.out.print(p.getClass().getSimpleName()+" "+p.getHealth());
	}

}
