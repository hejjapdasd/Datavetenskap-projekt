
public class Tillverkare {
	
	private String Tillverkarnamn;
	private Discount discount;
		
	public Tillverkare(String namn){
		this.Tillverkarnamn = namn;
	}
	
	public Discount getDiscount(){
		return discount;
	}
	public boolean setDiscount(String DiscountName){
				
		return true;
		
	}

}
