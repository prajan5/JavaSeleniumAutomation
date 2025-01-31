package abstractionWithInterfaceAbstractClass;

public abstract class SbiChennai implements Rbi {
	
	
	

	@Override
	public void kyc() {
		System.out.println("SbiChennai implements PAN CARD");
		
	}

	@Override
	public void deposit() {
		System.out.println("SbiChennai implements deposit above 10L");
		
	}

	
	public void minBalance()
	{
		System.out.println("Min Balance 5000");
	}
	
	//one abstract method for justification
	public abstract void loan();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cannot create object for interface and abstract class

	}

}
