

public class Vara {
	private String namn;
	protected int pris;
	
	Vara(String namn, int pris){
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((namn == null) ? 0 : namn.hashCode());
		result = prime * result + pris;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Vara)) {
			return false;
		}
		Vara other = (Vara) obj;
		if (namn == null) {
			if (other.namn != null) {
				return false;
			}
		} else if (!namn.equals(other.namn)) {
			return false;
		}
		if (pris != other.pris) {
			return false;
		}
		return true;
	}
	



	
	

	
	
}
