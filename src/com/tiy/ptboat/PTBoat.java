package com.tiy.ptboat;

public class PTBoat 
{
	String row;
	int column;

	public PTBoat (String row, int column)
	{
		this.row = row;
		this.column = column;
	}
	
	public boolean isHit(String row, int column)
	{
	
		return (this.row.equals(row) && this.column == column);
		
		//for strings use the above
		
	}
	
	// Provide a constructor
}
