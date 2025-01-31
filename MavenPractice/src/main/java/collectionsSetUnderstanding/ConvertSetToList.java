package collectionsSetUnderstanding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ConvertSetToList {

	public static void main(String[] args) {

	
	
	
	String arrname[] =  {"HCL", "Wipro", "Aspire", "Systems", "CTS"};
	Set<String> setWithLinkedSet = new LinkedHashSet<String>();
	
	for (String s :arrname)
	{
		setWithLinkedSet.add(s);
	}
	//Output would be As per insertion order.
	//List of names After converting from array to LinkedHashSet :[HCL, Wipro, Aspire, Systems, CTS]
	System.out.println("List of names After converting from array to LinkedHashSet :"+setWithLinkedSet);
	
	
	//Since we do not have get method in Set we need to convert Set to List
	
	List<String> list = new ArrayList<String>(setWithLinkedSet);
	String s = list.get(2);
	System.out.println("Name at index2 is:"+s);//Aspire
	
	

}
}