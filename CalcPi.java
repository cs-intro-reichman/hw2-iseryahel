// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]); // getting the numbers 
		double m = 1.0;
		double total = 0.0;
		for (int i = 0 ; i <= num-1; i++) // running the numer of timees 
		{
			total = total + Math.pow(-1, i)/ m; // calculate the formoula 
			m = m + 2; // eash time we divide by another 2 

		}
		System.out.println("pi acording to Java: " + Math.PI + "\npi, approximated:    " + total*4);

	}
}
