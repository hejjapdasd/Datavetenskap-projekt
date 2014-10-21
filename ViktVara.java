public class ViktVara extends Vara {
	private float vikt;
	
	protected ViktVara(String namn, int pris, float vikt) {
		super(namn, pris);
		this.vikt = vikt;
	}
	
	@Override
	public String toString(){
		return "" + taNamn() + taTotal();
	}
	
	@Override
	public int taPris() {
		return this.pris;
	}
	
	public float taTotal() {
		return taVikt() * taPris(); 
	}
	
	public float taVikt() {
		return this.vikt;
	}
}
