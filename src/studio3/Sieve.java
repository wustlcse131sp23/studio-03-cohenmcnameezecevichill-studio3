package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Choose a top limit: ");
		int n = in.nextInt();
		boolean[] primes = new boolean[n];
		for (int  i = 0; i < n; i++)
		{
			primes[i] = true;
		}	
		for (int i = 2; (int)(Math.pow(i, 2)) < n; i++)
		{
			if (primes[i] == true)
			{
				for (int k = (i*i); k < n; k+=i)
				{
					primes[k] = false;
				}
			}
			
		}
		for (int i = 2; i<n;i++)
		{
			if (primes[i] == true)
			{
				System.out.println(i);
			}
		}
	}
}


