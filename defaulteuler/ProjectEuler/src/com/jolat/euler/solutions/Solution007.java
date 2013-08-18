package com.jolat.euler.solutions;

import com.jolat.euler.launcher.AbstractCommand;
import com.jolat.euler.launcher.Eutils;

public class Solution007 extends AbstractCommand
{
	
	@Override
	public String execute ()
	{
		long i = 3;
		long ctr = 1;// count 2 to start with
		do
		{
			if ( Eutils.isPrime ( i ) )
			{
				ctr++;
				System.out.println ( i + " - " + ctr );
			}
			i += 2;
		}
		while ( ctr <= 10000L );
		i -= 2;
		return i + " is the 10 001st prime number.";
	}
	
	@Override
	public String getSolutionDetails ()
	{
		return "By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13. \n\n What is the 10 001st prime number?";
	}
	
	public static void main ( String[] args )
	{
		new Solution007 ();
	}
}
