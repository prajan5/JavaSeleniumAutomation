package arraysPractice;

import java.util.Arrays;

public class DuplicateArray2 {

	public static void main(String[] args) {
		int[]duparray = {20,40,5,25,20,45,10,80,45,60,60,25,80,80};
		int count ;
		System.out.println("Duplicate numbers in the array are:");
		for (int i = 0;i<duparray.length;i++ )
		{
			count = 1;
			for (int j=i+1;j<duparray.length;j++)
			{
				if (duparray[i]==duparray[j])
					
				{
					count ++;
					duparray[j]=00;
				}
			}
			
		     if(count>1 && duparray[i]!=00)    
           
			   System.out.println(duparray[i]);
		}
		
	
		
		
		//Method2
		System.out.println("Duplicate numbers in the array using single loop:");
		       int[]duparray1 = {20,40,5,25,20,45,10,80,45,60,60,25,80,80};
		        int cont;
				Arrays.sort(duparray1);
				System.out.println(Arrays.toString(duparray1));
				//[5, 10, 20, 20, 25, 25, 40, 45, 60, 80, 80]
				
				for (int k = 0;k<duparray1.length-1;k++ )
				{
					cont=1;
					if (duparray1[k]==duparray1[k+1])
							
						{
							cont ++;
							duparray1[k+1]=00;
						}
					
					if(cont>1 && duparray1[k]!=00)    
				           
						   System.out.println(duparray1[k]);
					     
				}
				
		
	
	}

}
