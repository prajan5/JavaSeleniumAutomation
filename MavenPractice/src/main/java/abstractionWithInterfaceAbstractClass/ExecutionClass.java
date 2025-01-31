package abstractionWithInterfaceAbstractClass;

import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutionClass extends SbiChennai{

	

	@Override
	public void startApp(String url) {
		
		System.out.println(url);
		
		
	}

	@Override
	public void startApp(String browser, String url) {
		System.out.println(browser+":"+url);
		
	}

	@Override
	public void loan() {
		System.out.println("Personal Loan from exeuciton class");
		
		
	}
	
	
	public static void main(String[] args) {
		ExecutionClass ec = new ExecutionClass();
		ec.loan();
		ec.startApp("testleaf");
		ec.startApp("Chrome", "TestLeaf");
		ec.deposit();
		ec.kyc();
		ec.minBalance();

	}

}
