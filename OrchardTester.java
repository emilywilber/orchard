    
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
        Position threeZero = new Position(3, 0);
        Position threeOne = new Position(3, 1);
        Position zeroTwo = new Position(0,2);
        Position twoFive = new Position(2, 5);
        
        Orchard ouch = new Orchard(4, 6, arr);
        //System.out.println(ouch); //just seeing if i contstructed the array right
        
        System.out.println("expected vs returned");
        System.out.println("false -> " + ouch.willFruit(male)); // should be false bc male
        System.out.println("false -> " + ouch.willFruit(threeZero)); 
        System.out.println("false -> " + ouch.willFruit(threeOne)); 
        System.out.println("true -> " + ouch.willFruit(zeroTwo)); 
        System.out.println("true -> " + ouch.willFruit(twoFive)); 
        System.out.println();
        
        System.out.println("Array: " + ouch.nonFruitingPlant());
    }
}
