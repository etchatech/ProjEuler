package com.jolat.euler.solutions;

import com.jolat.euler.launcher.Command;

public class Solution004 implements Command
{
	
	@Override
	public String execute ()
	{
		for ( int i = 999; i > 800; i-- )
		{
			for ( int j = i; j > 800; j-- )
			{
				if ( isPalindrome ( i * j ) )
				{
					int value = i * j;
					System.out.println ( "first number is " + i + " while j is "
							+ j + " resulting in: " + value );
					return Integer.toString ( i * j );
				}
			}
		}
		
		return null;
	}
	
	/**
	 * 997799 is the ceiling
	 * 
	 * @param value
	 * @return
	 */
	private boolean isPalindrome ( Integer value )
	{
		char[] integerValue = Integer.toString ( value ).toCharArray ();
		int max = integerValue.length - 1;
		for ( int i = 0; i < integerValue.length / 2; i++ )
		{
			if ( integerValue[i] == integerValue[max - i] )
			{
				continue;
			}
			else
			{
				return false;
			}
		}
		
		return true;
	}
	
	@Override
	public String getSolutionDetails ()
	{
		return "A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.\n\n"
				+ "Find the largest palindrome made from the product of two 3-digit numbers.";
	}
}
