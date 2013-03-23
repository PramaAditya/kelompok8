
public class Player implements Savable {
	
	private static final long serialVersionUID = -2456153286695704755L;
	//atribute
	private int level;
	private Sparepart sparepart;
	private int maxHealth;
	private String minirobotList[];
	
	
	
	
	public void Save() {
		// TODO Auto-generated method stub
		
	}




	public int getLevel() {
		return level;
	}




	public void setLevel(int level) {
		this.level = level;
	}




	public Sparepart getSparepart() {
		return sparepart;
	}




	public void setSparepart(Sparepart sparepart) {
		this.sparepart = sparepart;
	}




	public int getMaxHealth() {
		return maxHealth;
	}




	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}




	public String[] getMinirobotList() {
		return minirobotList;
	}




	public void setMinirobotList(String minirobotList[]) {
		this.minirobotList = minirobotList;
	}	
}