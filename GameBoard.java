
/**
 * Write a description of class GameBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameBoard
{
    private Tile[][] board;

    public GameBoard( int height, int width )
    {
        if ( height > 0 && width > 0 )
            board = new Tile[height][width];
    }

    public int count( int player )
    {
        int count = 0;

        for ( int y = 0; y < board.length; y++ )
        {
            for ( int x = 0; x < board[y].length; x++ )
            {
                if ( board[y][x].state() == player )
                    count++;
            }
        }
        
        return count;
    }
    
    public void place( int player, int x, int y )
    {
        if ( isLegal( player, x, y ) )
            board[y][x].setState( player );
    }
    
    private boolean isLegal( int p, int x, int y )
    {
        if ( board[y][x].state() != 0 )
            return false;
        
        for ( int i = -1; i <= 1; i++ )
        {
            for ( int j = -1; j <= 1; j++ )
            {
                if ( i == 0 && j == 0 )
                    continue;
                
                if ( board[y+i][x+j].isOpp(p) ) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private void flip( int p, int x, int y )
    {
        for ( int i = -1; i <= 1; i++ )
        {
            for ( int j = -1; j <= 1; j++ )
            {
                if ( i == 0 && j == 0 )
                    continue;
                
                if ( board[y+i][x+j].isOpp(p) ) {
                    for ( int ii = 1 * i, int jj = 1 * j; ii < 
                }
            }
        }
    }
    
    private int flipL
    
    private void flanks( int p, int x, int y )
    {
        for ( int i = -1; i <= 1; i++ )
        {
            for ( int j = -1; j <= 1; j++ )
            {
                if ( i == 0 && j == 0 )
                    continue;
                
                if ( board[y+i][x+j].isOpp(p) ) {
                    
                }
            }
        }
    }
    
    private int pConvert( int p )
    {
        return p == 2 ? -1 : p;
    }
    
    
}