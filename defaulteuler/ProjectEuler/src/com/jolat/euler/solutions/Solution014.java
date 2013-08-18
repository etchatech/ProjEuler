package com.jolat.euler.solutions;

import com.jolat.euler.launcher.AbstractCommand;
import com.jolat.euler.launcher.Eutils;

public class Solution014 extends AbstractCommand
{

	@Override
	public String execute()
	{
		long chainLength = 0;
		long currentI = 0;
		for( long i = 1; i < 1000000; i++ )
		{
			long result = Eutils.countCollatzProblem( i );
			if( result > chainLength )
			{
				chainLength = result;
				currentI = i;
			}
		}
		return "i=" + currentI + "; chainLenth is a whopping " + chainLength;
	}

	@Override
	public String getSolutionDetails()
	{
		return "The following iterative sequence is defined for the set of positive integers:\n"
				+ "n --> n/2 (n is even)\n"
				+ "n --> 3n + 1 (n is odd)\n"
				+ "Using the rule above and starting with 13, we generate the following sequence:\n"
				+ "13 --> 40 --> 20 --> 10 --> 5 --> 16 --> 8 --> 4 --> 2 -->1\n"
				+ "It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.\n"
				+ "Which starting number, under one million, produces the longest chain?\n"
				+ "NOTE: Once the chain starts the terms are allowed to go above one million.\n";
	}

	public static void main( String[] args )
	{
		new Solution014();
	}
}
