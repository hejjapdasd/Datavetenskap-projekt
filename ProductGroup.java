
public class ProductGroup {
	private String groupName;
	private Discount discount;
	
	public ProductGroup(String groupName, Discount discount){
		this.groupName = groupName;
		this.discount = discount;
	}
	
	public Discount getDiscount(){
		return discount;
	}
	
	
}
