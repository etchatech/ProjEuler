package com.jolat.euler.solutions;

import com.jolat.euler.launcher.AbstractCommand;

public class Solution003 extends AbstractCommand
{
	
	@Override
	public String execute ()
	{
		final long value = 600851475143L;
		return recurse ( value ).toString ();
	}
	
	public Long recurse ( long value )
	{
		Long finalValue = 0L;
		Long[] primes =
		{ 2L, 3L, 5L, 7L, 11L, 13L, 17L, 19L, 23L, 31L, 37L,
				41L, 43L, 47L, 53L, 59L, 61L, 67L, 71L, 73L, 79L, 83L, 89L, 97L };
		for ( Long prime : primes )
		{
			if ( value % prime == 0 && value != prime )
			{
				// System.out.println("Dividing by " + prime + " --> " + value);
				return recurse ( value / prime );
			}
		}
		
		for ( long i = value / primes[primes.length - 1]; i >= 2; i-- )
		{
			if ( value % i == 0 )
			{
				System.out.println ( " Currently entering recursion : " + i );
				finalValue = recurse ( i );
				System.out.println ( " - Returning finalValue as " + finalValue );
				if ( finalValue == 0 )
				{
					return i;
				}
				break;
			}
		}
		if ( finalValue == 0 )
		{
			return value;
		}
		return finalValue;
	}
	
	@Override
	public String getSolutionDetails ()
	{
		
		return "The prime factors of 13195 are 5, 7, 13 and 29.\n\n"
				+ "What is the largest prime factor of the number 600851475143 ?";
	}
	
	public static void main ( String[] args )
	{
		new Solution003 ();
	}
}
