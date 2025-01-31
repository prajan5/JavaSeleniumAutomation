package collectionsSetUnderstanding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetString {
	
	

	public static void main(String[] args) {
		
		Set<String> mentors = new HashSet<String>();
		
		mentors.add("Ramya");
		mentors.add("Helan");
		mentors.add("Abiram");
		mentors.add("Celine");
		mentors.add("Britto");
		//Print the List
		System.out.println("Set after adding values: "+mentors);//[Ramya, Helan, Abiram, Celine, Britto]
		
	
		
		//size
		int mentorsSize = mentors.size();
		System.out.println("Hast set prints output in random order");//6
		System.out.println("Set size: "+mentorsSize);//6
		
		//contains
		boolean contains = mentors.contains("Abiram");
		System.out.println("set contains Abiram: "+contains);//true
		
		//remove
		
		mentors.remove("Abiram");
		System.out.println("Set after removing abiram: "+mentors);
		
		//No get method in Set because of the output order by each implementation classes 
		//Cannot use sort method instead use TreeSet
		
		System.out.println(mentors.toArray());//[Ljava.lang.Object;@379619aa

		
		
	
		
		

	}

}
