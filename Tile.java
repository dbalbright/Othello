
/**
 * Write a description of class Tile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tile
{
    // Display
    final char BLANK = ' ';
    final char WHITE = 'O';
    final char BLACK = 'X';
    
    // Number representation
    final int OPEN = 0;
    final int PLAYER1 = 1;
    final int PLAYER2 = -1;

    // 0 = empty, 1 = white, 2 = black
    private int state = 0;

    public void setState( int player )
    {
        state = player;
    }
    
    public int state()
    {
        return state;
    }

    public void flip()
    {
        state *= -1;
    }
    
    public boolean isOpp( int p )
    {
        return state == -1 * p ? true : false;
    }

    public String toString()
    {
        String display = "";

        if ( state == 0 )
            display += BLANK;
        else if ( state == 1 )
            display += WHITE;
        else if ( state == -1 )
            display += BLACK;

        return display;
    }
}
