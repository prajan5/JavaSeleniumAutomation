package datatypePractice;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DataTypes {

	public static void main(String[] args) {
		int noofTabOpen = 1;
		String searchBox = "Selenium";
		boolean tabClose = true;
		char browserLog = 'C';
		float version = 121.3f;
		long ph =89398529839823L;
		
		System.out.println("No of tab open:"+noofTabOpen);
		System.out.println("search string:"+searchBox
				+"\n"+"No of tab Cloed:"+tabClose
				+"\n"+"browserlog:"+browserLog
				+"\n"+"Browser version"+version
				+"\n"+"Phone:"+ph);
		
		

	}

}
