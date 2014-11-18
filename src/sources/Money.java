package sources;

public abstract class Money {
	public abstract Money times(int multiplier);
	protected int amount;
	
	public boolean equals(Object object){
		Money money = (Money) object;
		return amount == money.amount
				&& getClass().equals(money.getClass());
	}
	
	public static Money dollar(int amount){
		return new Dollar(amount);
	}
	
	public static Money franc(int amount){
		return new Franc(amount);
	}

}
