
public class Comparisons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		CompareTo()
		
		String str1 = "Java Example";
		String str2 = new String("Java Example");
		String str3 = "Java Degree";
		
//		ASCII Character Table
//		
//		A - 65 to Z - 90
//		a - 97 to z - 122
		
//		str1 = abe;
//		str2 = abc;
//		
//		a - a = 97 - 97 = 0
//		b - b = 98 - 98 = 0
//		c - b = 99 - 98 = 1
//		c - d = 99 - 100 = -1
//		c - e = 99 - 101 = -2
//		e - c = 101 - 99 = 2
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		
//		equals() vs equalsIgnoreCase()
		
//		String str1 = "hello";
//		String str2 = "Hello";
//		
//		if(str1.equals(str2)) {
//			System.out.println("Both the Strings are Same");
//		}
//		else {
//			System.out.println("Both the Strings are not Same");
//		}
//		
//		if(str1.equalsIgnoreCase(str2))
//		{
//			System.out.println("Both the Strings are Same");
//		}
//		else {
//			System.out.println("Both the Strings are not Same");
//		}
		
		
//		== vs equals()
//		String str1 = "HELLO";
//		String str2 = "HELLO";
//		String str1 = new String("HELLO"); //new - to allocate dynamic memory
//		String str2 = new String("HELLO");
//		String str2 = str1;	
		
//		System.out.println(str1 == str2); // false: reference comparison
//		System.out.println(str1.equals(str2)); // true: content comparison

	}

}
