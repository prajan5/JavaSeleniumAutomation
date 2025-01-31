package stringPractice;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "Company has Many Projects";
		System.out.println("****split(Delimiter)*********");
		
		
		//trim will not remove space in between words so split()
		//storing in the string array ctrl2
		
		String[] split = s.split(" ");//removes space
		for (int i =0; i<split.length;i++)
		{
			System.out.print(split[i]);//CompanyhasManyProjects
		}
		
		String[] split1 = s.split("a");//removes a
		for (int i =0; i<split1.length;i++)
		{
			System.out.print(split1[i]);//Compny hs Mny Projects
		}
		
		System.out.println("****replace(char old char, char new char)*********");
		/*Returns a string resulting from replacing all occurrences of oldChar 
		in this string with newChar.*/ 
		String data = "Master in Computer";
		String replace = data.replace('e','9');
		System.out.print(replace);//Mast9r in Comput9r
		
		
		System.out.println("****replaceAll(String regex, String replacement)*********");
		/*Replaces each substring of this string that matches the given regular
		 expression with thegiven replacement. 
		 *  String java.lang.String.replaceAll(String regex, String replacement)*/ 
		
		String data1 = "There are 100 Items in The Basket";
		String replaceall = data1.replaceAll("[a-z]", "S1");
		
		System.out.print(replaceall);//TS1S1S1S1 S1S1S1 100 IS1S1S1S1 S1S1 TS1S1 BS1S1S1S1S1
		
		System.out.println();
		//retain a-z, numbers and numbers replaced		
		String replaceall1 = data1.replaceAll("[^a-z]", "S1");
		System.out.print(replaceall1);//S1hereS1areS1S1S1S1S1S1temsS1inS1S1heS1S1asket
		System.out.println();
		//retain a-z, A-Z, 0-9 . so spaces will be removed with s1
		String replaceall2 = data1.replaceAll("[^a-zA-Z0-9]", "S1");//ThereS1areS1100S1ItemsS1inS1TheS1Basket
		System.out.print(replaceall2);
		System.out.println();
		
		
		System.out.println("***toLowerCase()*********");
	
		String slower = data1.toLowerCase();
		System.out.print(slower);
		
		System.out.println();

		System.out.println("***toUpperCase()*********");
		String supper = data1.toUpperCase();
		System.out.print(supper);
		
		
		
		System.out.println("***substring(int beginning index)*********");
		//There are 100 Items in The Basket
		String substring= data1.substring(14);
		System.out.print(substring);//Items in The Basket
		System.out.println();
		
		System.out.println("***substring(int beginning index, int ending index)*********");
		String substring1= data1.substring(14,18);//18 position will be excluded. ending index-1
		System.out.print(substring1);//Item
		
		
		//convert string to int
		System.out.println("***convert string to integer*********");
		//Mostly values in web page will be String
		String value = "60000";
		int parseInt = Integer.parseInt(value);
		System.out.print(parseInt);
		
		
		
		
		
		
	}
	
	

}
