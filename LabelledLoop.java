
public class LabelledLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//nested loops
		loop1: for(int i = 1; i <= 5; i++) // outer loop, rows
		{
			loop2: for(int j = 1; j <= 5; j++) // inner loop, columns
			{
				System.out.print(i); // 11111
									//  22222
				
				if(j == 5)
				{
					break loop1;
				}
			}
			
			System.out.println();
		}

	}

}
