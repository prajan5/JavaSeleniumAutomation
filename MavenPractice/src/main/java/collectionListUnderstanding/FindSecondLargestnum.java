package collectionListUnderstanding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestnum {

	public static void main(String[] args) {
		int num[] = {3, 2, 11, 4, 6, 7};
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(Integer i:num)
		{
			list.add(i);
		}
		Collections.sort(list);
		System.out.println(list);//[2, 3, 4, 6, 7, 11]
		System.out.println(list.get(list.size()-2));//7
		

	}

}
