
public class Discount {
	
	private String DiscountName;
	private float discount;
	
	
	public Discount(String Name, float discount){
		this.DiscountName = Name;
		this.discount = discount;
	}
	
	public float getDiscount(){
		return discount;
	}

}
