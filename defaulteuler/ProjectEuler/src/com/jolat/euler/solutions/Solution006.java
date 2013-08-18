package com.jolat.euler.solutions;

import com.jolat.euler.launcher.AbstractCommand;
import com.jolat.euler.launcher.Eutils;

public class Solution006 extends AbstractCommand
{

	@Override
	public String execute()
	{
		final long limit = 100l;
		final long answer = Eutils.getSumOfTheSquaresFromOneTo( limit )
				- Eutils.square( Eutils.getSumOfNumbersFromOneTo( limit ) );
		return Long.toString( answer );
	}

	@Override
	public String getSolutionDetails()
	{
		return "The sum of the squares of the first ten natural numbers is,\n\n"
				+ "12 + 22 + ... + 102 = 385\n\n"
				+ "The square of the sum of the first ten natural numbers is,\n\n"
				+ "(1 + 2 + ... + 10)2 = 552 = 3025\n\n"
				+ "Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025  385 = 2640.\n\n"
				+ "Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.";
	}

	public static void main( String[] args )
	{
		new Solution006();
	}
}
