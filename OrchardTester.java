
/**
 * tests
 *
 * @author Emily Wilber
 * @version March 22, 2019
 */
public class OrchardTester
{
    public static void main(String[] args) {
        String[] arr = {  "male", "female", "female", "female", "female", "female",
                        "female", "female", "female", "female",   "male", "female",
                        "female", "female", "female", "female", "female", "female",
                        "female", "female", "female", "female", "female", "female"};
                       
        Position male = new Position(1, 4);
        Position leftTest = new Position(2, 0);
        
        
        Orchard ouch = new Orchard(4, 6, arr);
        //System.out.println(ouch); //just seeing if i contstructed the array right
        
        System.out.println("expected vs returned");
        System.out.println("false" + ouch.willFruit(male)); // should be false bc male
    }
}
