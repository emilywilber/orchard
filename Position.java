
/**
 * Holds row and col
 *
 * @author Emily Wilber
 * @version March 22, 2019
 */
public class Position
{
    private int row;
    private int col;
    
    /**
     * Constructor for objects of class Position
     */
    public Position(int row, int col)
    {
        this.row = row;
        this.col = col;
    }
    
    public int getRow() {
        return row;
    }
    
    public int getCol() {
        return col;
    }
    
    public String toString()
    {
        return "[row: " + row +", col: " + col + "]";
    }
}
