package com.jolat.euler.solutions;

import com.jolat.euler.launcher.Command;

/**
 * Problem 1 05 October 2001 If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6
 * and 9. The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * @author jasonoliverlat
 */
public class Solution001 implements Command
{
	public String	OUTPUT	= null;
	
	/**
	 * My solution is to literally just do a mod for each number and add the solution
	 */
	@Override
	public String execute ()
	{
		Integer answer = new Integer ( 0 );
		for ( int i = 3; i < 1000; i++ )
		{
			if ( i % 3 == 0 )
			{
				answer += i;
			}
			else if ( i % 5 == 0 )
			{
				answer += i;
			}
			
		}
		return answer.toString ();
	}
	
	@Override
	public String getSolutionDetails ()
	{
		return "If we list all the natural numbers below 10 that are multiples of 3 or 5, we \n"
				+ "get 3, 5, 6 and 9. The sum of these multiples is 23. \n"
				+ "\n"
				+ "Find the sum of all the multiples of 3 or 5 below 1000.";
	}
}
