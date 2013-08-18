package com.jolat.euler.launcher;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.jolat.euler.exception.YouFuckedUpException;

public class EutilsTest
{

	@Before
	public void setUp() throws Exception
	{
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void testSquare()
	{
		assertEquals( 1, Eutils.square( 1 ) );
		assertEquals( 4, Eutils.square( 2 ) );
		assertEquals( 9, Eutils.square( 3 ) );
		assertEquals( 16, Eutils.square( 4 ) );
		assertEquals( 25, Eutils.square( 5 ) );
		assertEquals( 36, Eutils.square( 6 ) );
		assertEquals( 1, Eutils.square( -1 ) );
		assertEquals( 4, Eutils.square( -2 ) );
		assertEquals( 9, Eutils.square( -3 ) );
		assertEquals( 0, Eutils.square( 0 ) );
	}

	@Test
	public void testPythagoreanTriplet() throws YouFuckedUpException
	{
		assertTrue( Eutils.isPythagoreanTriplet( 3, 4, 5 ) );
		assertFalse( Eutils.isPythagoreanTriplet( 5, 6, 7 ) );
		assertTrue( Eutils.isPythagoreanTriplet( 200, 375, 425 ) );
	}

	@Test
	public void testPythagoreanTriplet_YouFuckedUpBGreaterThanA()
	{
		try
		{
			assertTrue( Eutils.isPythagoreanTriplet( 4, 3, 5 ) );
			fail( "You fucked up! You broke it. 4 > 3 but a can't be > b" );
		}
		catch( YouFuckedUpException e )
		{
		}
	}

	@Test
	public void testPythagoreanTriplet_YouFuckedUpBGreaterThanC()
	{
		try
		{
			assertTrue( Eutils.isPythagoreanTriplet( 3, 5, 4 ) );
			fail( "You fucked up! You broke it. 5 > 4 but b can't be > c" );
		}
		catch( YouFuckedUpException e )
		{
		}
	}

	@Test
	public void testIsPrime()
	{
		assertFalse( Eutils.isPrime( 1 ) );
		assertTrue( Eutils.isPrime( 2 ) );
		assertTrue( Eutils.isPrime( 3 ) );
		assertFalse( Eutils.isPrime( 4 ) );
		assertTrue( Eutils.isPrime( 5 ) );
		assertFalse( Eutils.isPrime( 6 ) );
		assertTrue( Eutils.isPrime( 7 ) );
		assertFalse( Eutils.isPrime( 8 ) );
		assertFalse( Eutils.isPrime( 9 ) );
		assertFalse( Eutils.isPrime( 10 ) );
		assertTrue( Eutils.isPrime( 11 ) );
		assertFalse( Eutils.isPrime( 12 ) );
		assertTrue( Eutils.isPrime( 13 ) );
		assertFalse( Eutils.isPrime( 14 ) );
		assertFalse( Eutils.isPrime( 15 ) );
		assertFalse( Eutils.isPrime( 16 ) );
		assertTrue( Eutils.isPrime( 17 ) );
	}

	@Test
	public void testIsPrime2()
	{
		assertFalse( Eutils.isPrime2( 1 ) );
		assertTrue( Eutils.isPrime2( 2 ) );
		assertTrue( Eutils.isPrime2( 3 ) );
		assertFalse( Eutils.isPrime2( 4 ) );
		assertTrue( Eutils.isPrime2( 5 ) );
		assertFalse( Eutils.isPrime2( 6 ) );
		assertTrue( Eutils.isPrime2( 7 ) );
		assertFalse( Eutils.isPrime2( 8 ) );
		assertFalse( Eutils.isPrime2( 9 ) );
		assertFalse( Eutils.isPrime2( 10 ) );
		assertTrue( Eutils.isPrime2( 11 ) );
		assertFalse( Eutils.isPrime2( 12 ) );
		assertTrue( Eutils.isPrime2( 13 ) );
		assertFalse( Eutils.isPrime2( 14 ) );
		assertFalse( Eutils.isPrime2( 15 ) );
		assertFalse( Eutils.isPrime2( 16 ) );
		assertTrue( Eutils.isPrime2( 17 ) );
	}

	public void testGetSumOfTheSquaresFromOneToX()
	{
		assertEquals( 1, Eutils.getSumOfTheSquaresFromOneTo( 1 ) );
		assertEquals( 5, Eutils.getSumOfTheSquaresFromOneTo( 2 ) );
		assertEquals( 14, Eutils.getSumOfTheSquaresFromOneTo( 3 ) );
		assertEquals( 30, Eutils.getSumOfTheSquaresFromOneTo( 4 ) );
		assertEquals( 55, Eutils.getSumOfTheSquaresFromOneTo( 5 ) );
		assertEquals( 91, Eutils.getSumOfTheSquaresFromOneTo( 6 ) );
	}

	public void testGetSumOfNumbersFromOneTo()
	{
		assertEquals( 1, Eutils.getSumOfNumbersFromOneTo( 1 ) );
		assertEquals( 3, Eutils.getSumOfNumbersFromOneTo( 2 ) );
		assertEquals( 6, Eutils.getSumOfNumbersFromOneTo( 3 ) );
		assertEquals( 10, Eutils.getSumOfNumbersFromOneTo( 4 ) );
		assertEquals( 15, Eutils.getSumOfNumbersFromOneTo( 5 ) );
		assertEquals( 21, Eutils.getSumOfNumbersFromOneTo( 6 ) );
		assertEquals( 28, Eutils.getSumOfNumbersFromOneTo( 7 ) );
		assertEquals( 36, Eutils.getSumOfNumbersFromOneTo( 8 ) );
		assertEquals( 45, Eutils.getSumOfNumbersFromOneTo( 9 ) );
		assertEquals( 55, Eutils.getSumOfNumbersFromOneTo( 10 ) );
	}

	public void testGetDivisors()
	{
		final List<Long> values = Eutils.getDivisors( 36 );

		assertEquals( Long.valueOf( 1 ), values.get( 0 ) );
		assertEquals( Long.valueOf( 36 ), values.get( 1 ) );
		assertEquals( Long.valueOf( 2 ), values.get( 2 ) );
		assertEquals( Long.valueOf( 18 ), values.get( 3 ) );
		assertEquals( Long.valueOf( 3 ), values.get( 4 ) );
		assertEquals( Long.valueOf( 12 ), values.get( 5 ) );
		assertEquals( Long.valueOf( 4 ), values.get( 6 ) );
		assertEquals( Long.valueOf( 9 ), values.get( 7 ) );
		assertEquals( Long.valueOf( 6 ), values.get( 8 ) );
		assertEquals( Long.valueOf( 6 ), values.get( 9 ) );
	}
}
