package sources;

public class Dollar extends Money {
	
	private String currency;
	
	public Dollar(int amount){
		this.amount = amount;
		currency = "USD";
	}
	
	public Money times(int multiplier){
		
		return new Dollar(amount*multiplier);
	}
	
	public String currency(){
		return currency;
	}
	

}
