package com.jolat.euler.launcher;

public abstract class AbstractCommand implements Command
{

	public AbstractCommand()
	{
		Main.displayDetails( true, this );
		Long start = System.currentTimeMillis();
		Main.printAnswer( this );
		Long end = System.currentTimeMillis();
		System.out.println( "--------------------------" );
		System.out.println( totalTime( start, end ) );
	}

	private String totalTime( Long start, Long end )
	{
		Long total = end - start;
		String seconds = Long.valueOf( total / 1000L ).toString();
		String millis = Long.valueOf( total % 1000L ).toString();
		millis = millis.length() > 2 ? millis : millis.length() > 1 ? "0"
				+ millis : "00" + millis;
		return seconds + "." + millis + "(s)";
	}
}
