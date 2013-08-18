package com.jolat.euler.solutions;

import com.jolat.euler.launcher.Command;

/**
 * 2,3,4,5,6,7,8,9,10 10 - 5 2 9 - 3 8 - 4 2 7 6 - 3 2
 * 
 * @author jasonoliverlat
 */

public class Solution005 implements Command
{
	
	@Override
	public String execute ()
	{
		Long FOUND = Long.MIN_VALUE;
		for ( Long i = 21L; i < 999999999999L; i++ )
		{
			if ( isDivisibleBy20AndBelow ( i ) )
			{
				System.out.println ( "FOUND! " + i );
				FOUND = i;
				break;
			}
		}
		return Long.toString ( FOUND );
	}
	
	public boolean isDivisibleBy20AndBelow ( Long value )
	{
		for ( int i = 2; i <= 20; i++ )
		{
			if ( value % i != 0 )
			{
				return false;
			}
		}
		return true;
	}
	
	@Override
	public String getSolutionDetails ()
	{
		return "2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.\n\n"
				+ "What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?";
	}
	
}
