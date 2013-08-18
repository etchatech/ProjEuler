package com.jolat.euler.scratchpapaer;

import java.util.List;

import com.jolat.euler.launcher.Eutils;

public class Soulution012
{
	public static void main( String[] args )
	{
		Long starter = 8L;// 12375L;
		Long value = Eutils.getSumOfNumbersFromOneTo( starter );
		System.out.println( value );
		List<Long> divisorList = Eutils.getDivisors( value );
		for( int i = 0; i < divisorList.size(); i += 2 )
		{
			long firstNum = divisorList.get( i );
			long secondNum = divisorList.get( i + 1 );
			System.out.println( i + ". " + firstNum + " * " + secondNum + " = " + ( firstNum * secondNum ) );
		}
		System.out.println();
		System.out.println( Eutils.countDivisorsIncluding1( value ) );
	}
}
