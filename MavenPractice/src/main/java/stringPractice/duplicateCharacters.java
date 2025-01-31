package stringPractice;

import java.util.Arrays;

public class duplicateCharacters {

	public static void main(String[] args) {
		String string1 = "ramya rajan";
		
		 String string2 = "Great responsibilityy";    
	         
	            
	        //Converts given string into character array    
	        char string[] = string1.toCharArray();    
	            
	      
	        System.out.println("Duplicate characters in a given string: ");    
	        //Counts each character present in the string    
	        for(int i = 0; i <string.length-1; i++)     
	          {    
	        	  
	        	  for(int j = i+1; j <string.length; j++) 
	        	  {    
	                  if(string[i] == string[j]) 
	                  { 
	               
	                	 System.out.print(string[i]);   
	                    //Set string[j] to 0 to avoid printing visited character    
	                  
	                }  }  
	            }    
	             
	          }}
	        
	
	          
		

	


