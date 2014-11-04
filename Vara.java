

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
	public boolean equals(Object other){
		if (other == null){
	    	return false;
		}else if(other instanceof Vara){
			if((((Vara) other).taNamn() == this.taNamn())&&(((Vara) other).taPris() == this.taPris())){
				return true;
			}
		}
		return false;	
	    
	}
	
	@Override
    public int hashCode() {
		int hash = 5;
	    hash += this.taNamn().hashCode();
        hash += this.taPris();
        return hash;
	    }


	
	

	
	
}
