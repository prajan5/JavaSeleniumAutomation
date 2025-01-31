package collectionListUnderstanding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConvertArrayToList {

	public static void main(String[] args) {
	int age[] = { 6,7,3,2,0,5};
	
	List<Integer> listAge = new ArrayList<Integer>();
	
	for (Integer i: age)
	{
		listAge.add(i);
	}
	//System.out.println(listAge);//[6, 7, 3, 2, 0, 5]
	Collections.sort(listAge);
	System.out.println(listAge);//[0, 2, 3, 5, 6, 7]

	
	
	
	String arrname[] =  {"HCL", "Wipro", "Aspire", "Systems", "CTS"};
	List<String> listname = new ArrayList<String>();
	
	for (String s :arrname)
	{
		listname.add(s);
	}
	System.out.println("List of names After converting from array to list :"+listname);
	Collections.sort(listname);
	System.out.println("List of names After sorting :"+listname);
	
	
	
	
	

}
}