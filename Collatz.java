// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
    	int N = Integer.parseInt(args[0]);
		String s = args[1];
		for ( int i= 1; i <= N; i++) // running  all seed
		{
			int current = i;
			int steps = 0 ; 
			String temp = s;// putting the string in temporary so i can stop the while
			while (temp.equals("v"))
			{
				System.out.print(current + " ");
				steps++;
				if (current == 1 && steps > 1) // stop if its 1 but not the first 1
				{
					temp = "s";
				}
				if (current % 2 == 0 )
				{
					current = current / 2;
				}
				else
					current = (current * 3) +1;
			}
 				if (s.equals("v")) // if its v er print
				{
					System.out.println("(" + steps +")");
				}
			}
		
			System.out.println( "Every one of the first " + N  + " hailstone sequences reached 1." ) ;
		}
}
