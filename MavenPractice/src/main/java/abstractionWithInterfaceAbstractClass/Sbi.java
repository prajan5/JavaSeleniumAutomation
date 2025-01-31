package abstractionWithInterfaceAbstractClass;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sbi implements Rbi {

	@Override
	public void kyc() {
		System.out.println("Sbi implements PAN CARD");
		
	}

	@Override
	public void deposit() {
		System.out.println("Sbi implements deposit abovd 10L");
		
	}

	@Override
	public void startApp(String url) {
		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
		
	}



	@Override
	public void startApp(String browser, String url) {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		Sbi sb = new Sbi();
		sb.deposit();
		sb.kyc();
		sb.startApp("https://www.leafground.com/radio.xhtml");

	}

}
