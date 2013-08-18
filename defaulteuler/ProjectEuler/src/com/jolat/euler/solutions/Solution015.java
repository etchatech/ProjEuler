package com.jolat.euler.solutions;

import com.jolat.euler.launcher.AbstractCommand;

public class Solution015 extends AbstractCommand
{

	@Override
	public String execute()
	{
		final int values[][] = populateGrid();

		for( int i = 0; i < values.length; i++ )
		{
			for( int j = 0; j < values[i].length; j++ )
			{
				values[i][j] = 1;
			}
		}

		return null;
	}

	private int[][] populateGrid()
	{
		final int values[][] = new int[21][21];

		for( int i = 0; i < values.length; i++ )
		{
			for( int j = 0; j < values[i].length; j++ )
			{
				if( i == 0 && j == 0 )
				{
					values[i][j] = 1;
				}
				else if(i>0 && j > 0)
				{
					values[i][j] = values[i-1][j] + 1;
				}
			}
		}

		return values;
	}

	@Override
	public String getSolutionDetails()
	{
		return "Starting in the top left corner of a 2x2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.\n"
				+
				"How many such routes are there through a 20x20 grid?";
	}

	public static void main( String[] args )
	{
		new Solution015();
	}
}
