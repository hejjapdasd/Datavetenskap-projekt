public class Vara {
	private String namn;
	protected int pris;
	
	protected Vara(String namn, int pris){
		this.namn = namn;
		this.pris = pris;
		
	}
	
	public String toString(){
		return "" + namn + pris;
	}
	
	public String taNamn() {
		return this.namn;
	}
	
	public int taPris() {
		return this.pris;
	}
	
	
}