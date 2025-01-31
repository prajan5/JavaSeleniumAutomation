package polymorphism;

public class APIClient {
	
	void sendRequest(String endpoint)
	{
		System.out.println("SendRequest:"+endpoint);
		
	}
	
	void sendRequest(String endpoint,String requestBody,boolean requestStatus)
	{
		System.out.println("SendRequestEndPoint:"+endpoint);
		System.out.println("SendRequestrequestBody:"+requestBody);
		System.out.println("SendRequestrequestStatus:"+requestStatus);
	}
	
	public static void main(String[] args)
	{
		APIClient obj = new APIClient();
		obj.sendRequest("WWW.google.com");
		obj.sendRequest("WWW.Facebook.com","Account",true);
	}

	

}
