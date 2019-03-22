import java.util.ArrayList;
/**
 * trees
 *
 * @author Emily Wilber
 * @version March 22, 2019
 */
public class Orchard
{
    // each array element is either "male" or "female"
    private String[][] plants;

    /**
     * Constructor for objects of class Orchard
     */
    public Orchard(int row, int col, String[] arr)
    {
        plants = new String[row][col];
        int index = 0;
        
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                plants[r][c] = arr[index];
                index++;
            } 
        }
    }

    /**
     * precondition: Position pos is in the plants array.
     * @return true if the plant as pos is a female plant and is close
     *              enough to a male plant to produce fruit, false otherwise.
     */
    public boolean willFruit(Position pos)
    {
        int row = pos.getRow();
        int col = pos.getCol();
        String plant = plants[row][col];
        
        if (plant.equals("female")) {
            for (int r = row - 2; r <= row+ 2; r++) {
                if (r >= 0 && r < plants.length) {
                    for (int c = col - 2; c <= col + 2; col++) {
                        if (c >= 0 && c < plants.length) {
                            if (plants[r][c].equals("male")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    /**
     * @return  an ArrayList containing all positions of female plants 
     *          that will not produce fruit
     */
    public ArrayList<Position> nonFruitingPlant()
    {
        return null;
    }
    
    public String toString() {
        String twoDim = "";
        for (String[] row: plants) {
            for (String col: row) {
                twoDim += col + " ";
            }
            twoDim += "\n";
        }
        return twoDim;
    }
}
