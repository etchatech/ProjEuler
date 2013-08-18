package com.jolat.euler.solutions;

import com.jolat.euler.exception.YouFuckedUpException;
import com.jolat.euler.launcher.AbstractCommand;
import com.jolat.euler.launcher.Eutils;

public class Solution009 extends AbstractCommand
{
	
	@Override
	public String execute ()
	{
		String answer = "";
		for ( int a = 1; a < 500; a++ )
		{
			for ( int b = a; b < 500; b++ )
			{
				for ( int c = b; c < 500; c++ )
				{
					try
					{
						if ( Eutils.isPythagoreanTriplet ( a, b, c ) )
						{
							if ( a + b + c == 1000 )
							{
								answer += "a=" + a + "; b=" + b + "; c=" + c;
								answer += " - product of the three is "
										+ ( a * b * c );
								break;
							}
						}
					}
					catch ( YouFuckedUpException e )
					{
						e.printStackTrace ();
					}
				}
			}
		}
		return answer;
	}
	
	@Override
	public String getSolutionDetails ()
	{
		return "A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,\n\na2 + b2 = c2\nFor example, 32 + 42 = 9 + 16 = 25 = 52.\n\nThere exists exactly one Pythagorean triplet for which a + b + c = 1000.\nFind the product abc.";
	}
	
	public static void main ( String[] args )
	{
		new Solution009 ();
	}
	
}
