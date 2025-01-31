package collectionListUnderstanding;
import java.util.ArrayList;
import java.util.Collections;

public class MissingElementList {


	

			public static void main(String[] args) {
			int [] array = {1, 2, 3, 4, 10, 6, 8,12,14,16,18};
			
			ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
			
			//Convert to List
			
			for (Integer i:array)
			{
				arrayList1.add(i);
			}
			Collections.sort(arrayList1);
			System.out.println(arrayList1);//[1, 2, 3, 4, 6, 8, 10, 12, 14, 16,18]
			
			int listsize = arrayList1.size();

			
				for (int j = 0; j<listsize-1;j++)
				
				{
						
					if (arrayList1.get(j)+1!=(arrayList1.get(j+1)))
				{
					
					System.out.println(arrayList1.get(j)+1);//
				}
			}
			

		}

	

}
