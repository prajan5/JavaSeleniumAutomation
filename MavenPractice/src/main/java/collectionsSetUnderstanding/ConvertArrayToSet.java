package collectionsSetUnderstanding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ConvertArrayToSet {

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
	
	
	
	Set<String> setWithTreeSet = new TreeSet<String>();
	
	for (String s :arrname)
	{

		setWithTreeSet.add(s);
	}
	//List of names After converting from array to TreeSet :[Aspire, CTS, HCL, Systems, Wipro]
	//Output would be As per AscII table Ascending order (Ascending)
	System.out.println("List of names After converting from array to TreeSet :"+setWithTreeSet);
	

	
	
	//Remove the duplicate character from the String.Can use set concept
	
	String sName = "priya rajan";
	
	//convert String into toCharArray();
	
	char ch[] = sName.toCharArray();
	
	//empty set
	Set<Character> uniqSet = new LinkedHashSet<Character>();
	
	
	for (Character c :ch)
	{

		uniqSet.add(c);
	}
	//Print set 
	System.out.println("After removing duplicate values  :"+uniqSet);//After removing duplicate values  :[p, r, i, y, a,  , j, n]
	
	//Print set through loop
	for (Character cha :uniqSet)
	{

		System.out.print(cha);//priya jn
	}
	
	
	
	
	

}
}