package com.tiy.ptboat;

public class PTBoatGame {
	
	public static void main(String[] args)
	{
	    
		
		PTBoatGame game = new PTBoatGame();
		game.addBoat("a", 3);
		game.addBoat("b", 4);
		game.addBoat("c", 2);
		game.addBoat("d", 1);
		game.addBoat("e", 7);
		game.addBoat("f", 5);
		
		game.guess("d", 1);
		game.guess("a", 1);
		game.guess("c", 1);
		game.guess("c", 1);
		game.guess("d", 1);
		game.guess("f", 5);
		
		
		// Create a PTBoatGame instance

	    // Add 6 PTBoats

	    // Take six guesses and output the following string for each
	    // If the guess hit a pt boat...
	    // Guess number # at row <row>, column <column> hit a PTBoat

	    // If the guess missed all boats
	    // Guess number # missed

	}
	
	private PTBoat[] ptBoats;
	private int numberOfBoats = 0;
	private int count = 0; 

	public PTBoatGame() 
	
	{
	
		ptBoats = new PTBoat[6];
	
	}

	public void addBoat(String row, int column)
	{
		

		ptBoats[numberOfBoats] = new PTBoat(row, column);
		numberOfBoats++;
		
		
	    // Add a new boat to the ptBoats array

	    // You will need to use the numberOfBoats
	    // value to tell you what element of the
	    // array to initialize

	    // remember to increment the numberOfBoats 
	    // before you leave
	}
	
	
	

	public boolean guess(String row, int column)
	{
		count++;
		
	    for (int i= 0; i < ptBoats.length; i++)
	    	
	    {
	    	if (ptBoats[i].isHit(row, column))
	    	{
	    		System.out.println("Guess #: " + count  + " HIT" + " row: " + row + " column: " + column);
	    		return true;
	    	
	    	}
	    	
	    }
	    System.out.println("Guess #: " + count + " MISS");
	    return false;
	    	
		// Check to see if the guess hit any of the ships.
	    // Return true only if a ship was hit

	} 

	
}