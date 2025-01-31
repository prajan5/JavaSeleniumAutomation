package collectionListUnderstanding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FindMissingElementsList {

	public static void main(String[] args) {
	
		int array[] = { 1,3, 4, 10, 6, 8,12};
		
		List<Integer> listnum = new ArrayList<Integer>();
		List<Integer> missingNumlist = new ArrayList<Integer>();
		
		for (Integer k : array)
		{
			listnum.add(k);
		}
		Collections.sort(listnum);//
		System.out.println(listnum);//[1, 3, 4, 6, 8, 10]
		
		for (int i = 1;i<listnum.size();i++)
		{
			if(listnum.get(i)- listnum.get(i-1) !=1)//[1, 3, 4, 6, 8, 10, 12]
			{
				missingNumlist.add(listnum.get(i-1)+1);
		
			}
			
			
		
	     }
		
		System.out.println("Missing numbers in the list ="+missingNumlist);
		
		

}}
