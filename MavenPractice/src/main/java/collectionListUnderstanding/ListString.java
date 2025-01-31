package collectionListUnderstanding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListString {
	
	

	public static void main(String[] args) {
		
		List<String> mentors = new ArrayList<String>();
		
		mentors.add("Ramya");
		mentors.add("Helan");
		mentors.add("Abiram");
		mentors.add("Celine");
		mentors.add("Britto");
		//Print the List
		System.out.println(mentors);//[Ramya, Helan, Abiram, Celine, Britto]
		
		//add name in the index 2 ->Note index starts from 0
		
		mentors.add(2,"Yamuna");
		
		//Print the List
		System.out.println(mentors);//[Ramya, Helan, Yamuna, Abiram, Celine, Britto]
		
		//size
		int mentorsSize = mentors.size();
		System.out.println("Size of the List"+mentorsSize);//6
		
		//contains
		boolean contains = mentors.contains("Abiram");
		System.out.println(contains);//true
		
		//remove
		
		mentors.remove(3);
		System.out.println("List after removing name from index 3: "+mentors);// Abiram is removed  [Ramya, Helan, Yamuna, Celine, Britto]
		
		
		//get
		
		String getMentor = mentors.get(0);//indext 0
		System.out.println("name at Index0: "+getMentor); //Ramya
		
		
		//sorting
		
		Collections.sort(mentors);
		System.out.println("List after sorting: "+mentors);//[Britto, Celine, Helan, Ramya, Yamuna]
		
		//Print list one by one
		System.out.println("****for loop");
		
		for (int i =0; i<mentors.size();i++)
		{
			System.out.println(mentors.get(i));
		}
		
		
		System.out.println("****for each loop");
		
		for(String name: mentors)
		{
			System.out.println(name);
		}
		
		
	/* for loop
		Britto
		Celine
		Helan
		Ramya
		Yamuna
		****for each loop
		Britto
		Celine
		Helan
		Ramya
		Yamuna */
		
		
	

	}

}
