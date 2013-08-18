package com.jolat.euler.launcher;

import java.util.ArrayList;
import java.util.List;

import com.jolat.euler.exception.YouFuckedUpException;

public class Eutils
{
	public static long square( long x )
	{
		return x * x;
	}

	public static boolean isPythagoreanTriplet( int a, int b, int c )
			throws YouFuckedUpException
	{
		String exceptionMessage = "";
		if( a > b )
		{
			exceptionMessage += "You can't have a > b\n";
		}
		if( b > c )
		{
			exceptionMessage += "You can't have b > c";
		}
		if( !exceptionMessage.equals( "" ) )
		{
			throw new YouFuckedUpException( "Oh you fucked up.\n"
					+ exceptionMessage );
		}
		return( square( a ) + square( b ) == square( c ) );
	}

	public static boolean isPrime( long positiveInteger )
	{
		boolean isPrime = true;
		if( positiveInteger == 2 )
		{
			return true;
		}

		if( positiveInteger >= 2 & positiveInteger % 2 != 0 )
		{
			long i = 3;
			while( i * i <= positiveInteger && isPrime )
			{
				if( positiveInteger % i == 0 )
				{
					isPrime = false;
				}
				i += 2;
			}
		}
		else
		{
			isPrime = false; // 1, 0 or negative number
		}

		return isPrime;
	}

	public static boolean isPrime2( long positiveInteger )
	{

		if( positiveInteger < 2 || positiveInteger % 2 == 0 )
		{
			if( positiveInteger == 2 )
			{
				return true;
			}
			return false;
		}
		for( long i = 3; i * i <= positiveInteger; i += 2 )
		{
			if( positiveInteger % i == 0 )
			{
				return false;
			}
		}
		return true;
	}

	public static long getSumOfTheSquaresFromOneTo( long limit )
	{
		Long sumOfTheSq = 0l;
		for( long i = 1; i <= limit; i++ )
		{
			sumOfTheSq += Eutils.square( i );
		}
		return sumOfTheSq;
	}

	public static long getSumOfNumbersFromOneTo( long limit )
	{
		return limit * ( limit + 1 ) / 2;
	}

	public static boolean isDivisible( long number, long divisor )
	{
		return number % divisor == 0;
	}

	/**
	 * this will always return an even number of values
	 * 
	 * @param number
	 * @return
	 */
	public static List<Long> getDivisors( long number )
	{
		final List<Long> divisors = new ArrayList<Long>();
		divisors.add( 1L );
		divisors.add( number );
		for( long i = 2; i <= Math.sqrt( number ); i++ )
		{
			if( Eutils.isDivisible( number, i ) )
			{
				divisors.add( i );
				divisors.add( number / i );
			}
		}
		return divisors;
	}

	public static long countDivisorsIncluding1( long number, long whatWasI )
	{
		long counter = countDivisorsIncluding1( number );
		if( counter > 250 )
		{
			System.out.println( "number=" + number + "; divisors=" + counter + "; iWas=" + whatWasI );
		}
		return counter;
	}

	public static long countDivisors( long number )
	{
		long result = 0;
		for( long i = 1; i * i <= number; i++ )
		{
			if( number % i == 0 )
			{
				result += 2;
				if( number / i == i )
					result--;
			}
		}
		return result;
	}

	public static long countDivisorsIncluding1( long number )
	{
		return countDivisors( number ) + 1;
	}

	public static boolean isEven( long number )
	{
		return number % 2 == 0;
	}

	public static boolean isOdd( long number )
	{
		return !isEven( number );
	}

	public static long countCollatzProblem( long number )
	{
		int counter = 0;
		while( number != 1 )
		{
			number = Eutils.isEven( number ) ? number / 2 : ( number * 3 ) + 1;
			counter++;
		}

		return counter;
	}
}
