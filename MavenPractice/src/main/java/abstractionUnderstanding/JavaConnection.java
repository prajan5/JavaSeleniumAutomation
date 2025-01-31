package abstractionUnderstanding;

public class JavaConnection implements DatabaseConnection{





	
	
	
	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.executeUpdate();
		jc.connect();
		JavaConnection.disconnect();
		DatabaseConnection.disconnect();//interface.methodname()
		
		

	}
	
	/*public  void connect()
	{
		System.out.println("connect method from java Connection interface ");
	}*/
	
	//Cannot override static method 
	public static void disconnect() {
		System.out.println("disconnect method from javaConnection interface ");
	}

	@Override
	public void executeUpdate() {
		System.out.println("executeupdate method from Java connection interface ");


		
	}

}
