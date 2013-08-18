package com.jolat.euler.solutions;

import com.jolat.euler.launcher.AbstractCommand;
import com.jolat.euler.launcher.Eutils;

public class Solution010 extends AbstractCommand
{
	
	@Override
	public String execute ()
	{
		long sumToTwoMil = 2;
		for ( int i = 3; i <= 2000000; i += 2 )
		{
			if ( Eutils.isPrime ( i ) )
			{
				sumToTwoMil += i;
			}
		}
		return "" + sumToTwoMil;
	}
	
	@Override
	public String getSolutionDetails ()
	{
		return "The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.\n\nFind the sum of all the primes below two million.";
	}
	
	public static void main ( String[] args )
	{
		new Solution010 ();
	}
}
