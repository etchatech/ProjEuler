package com.jolat.euler.launcher;

import com.jolat.euler.solutions.Solution001;
import com.jolat.euler.solutions.Solution002;
import com.jolat.euler.solutions.Solution003;
import com.jolat.euler.solutions.Solution004;
import com.jolat.euler.solutions.Solution005;
import com.jolat.euler.solutions.Solution006;
import com.jolat.euler.solutions.Solution007;
import com.jolat.euler.solutions.Solution008;

public class Main
{

	public Main( Command[] solutions, boolean dispDetails )
	{

		for( Command solution : solutions )
		{
			printOutSolution( dispDetails, solution );
		}
	}

	public static void printOutSolution( boolean dispDetails, Command solution )
	{
		displayDetails( dispDetails, solution );

		printAnswer( solution );

		if( dispDetails )
		{
			System.out.println( "--------------------------" );
		}
	}

	public static void displayDetails( boolean dispDetails, Command solution )
	{
		if( dispDetails )
		{
			System.out.println( "" + solution.getClass().getSimpleName()
					+ " : \n" + solution.getSolutionDetails() );
		}
	}

	public static void printAnswer( Command solution )
	{
		String answer = solution.execute();
		if( answer == null )
		{
			System.out.println( "You didnt set the answer again stupid!" );
		}

		System.out.println( "Answer:" + answer );
	}

	public static void main( String[] args )
	{
		Command[] solutions =
		{ new Solution001(), new Solution002(),
				new Solution003(), new Solution004(), new Solution005(),
				new Solution006(), new Solution007(), new Solution008() };
		Class<?>[] c = Command.class.getClasses();
		System.out.println( c );
		new Main( solutions, true );

	}
}
