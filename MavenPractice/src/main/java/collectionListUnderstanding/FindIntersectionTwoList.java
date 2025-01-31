package collectionListUnderstanding;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionTwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare an array for {3, 2, 11, 4, 6, 7}
		int[] arr1 = {3, 2, 11, 4, 6, 7,7};
		//Declare another array for {1, 2, 8, 4, 9, 7}
		int[] arr2 = {1, 2, 8, 4, 9, 7,7};
		
		int count ;
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		for(Integer i: arr1)
		{
			list1.add(i);
		}
		
		List<Integer> list2 = new ArrayList<Integer>();
		for(Integer i: arr2)
		{
			list2.add(i);
		}
		
		System.out.println("List1: "+list1);//List1: [3, 2, 11, 4, 6, 7]
		System.out.println("List2: "+list2);//List2: [1, 2, 8, 4, 9, 7]
		
		for (int j=0;j<list1.size();j++)
		{
			count =1;
			for(int k=0;k<list2.size();k++)
			{
				if (list1.get(j)==list2.get(k))
				{
					count++;
					list2.set(k, 00);
				}
			}
			if (count>1 && list1.get(j)!=00)
			{
				//printing only one occurance
				System.out.println(list1.get(j));
			}
		}
		
		

	}

}
