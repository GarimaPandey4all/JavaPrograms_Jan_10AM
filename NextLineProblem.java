import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NextLineProblem {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		//Scanner sc = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter any integer:");
		//int a = sc.nextInt();
		int a = Integer.parseInt(br.readLine());
		
		System.out.println("Enter any string:");
		String b = br.readLine();
		//String b = sc.nextLine(); // it can take string input till you enter the enter button
		//String b = sc.next(); // it can take string input till you enter the space
		
		//System.out.println("Enter any Contact");
		//long c = sc.nextLong();
		
		System.out.println("You have entered "+a+" "+b);

	}

}
