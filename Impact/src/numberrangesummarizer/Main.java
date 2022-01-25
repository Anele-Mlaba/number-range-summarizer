package numberrangesummarizer;

public class Main
{
    public static void main(String[] args)
    {
        String input1 = "1,3,6,7,8,12,13,14,15,21,22,23,24,31"; // client's sample
        String input2 = "2,4,9,8,7,10,100,101,15";   // unordered numbers
        String input3 = "";              // empty string
        String input4 = "2,2,2,4,4,6,5,7,8,9,0,1,2,2,2,3"; //repeated numbers
        String input5 = "-1,-4,-16,-17,-19,-20,22,23,25,2020,-1000";// negative numbers
        NumberHandler numberHandler = new NumberHandler();
        System.out.println(numberHandler.summarizeCollection(numberHandler.collect(input1)));
        System.out.println(numberHandler.summarizeCollection(numberHandler.collect(input2)));
        System.out.println(numberHandler.summarizeCollection(numberHandler.collect(input3)));
        System.out.println(numberHandler.summarizeCollection(numberHandler.collect(input4)));
        System.out.println(numberHandler.summarizeCollection(numberHandler.collect(input5)));
    }
}
/**
 * package numberrangesummarizer;
 *
 * import java.util.Collection;
 *
 *
 *  * @author Werner
 *  *
 *  * Implement this Interface to produce a comma delimited list of numbers,
 *  * grouping the numbers into a range when they are sequential.
 *  *
 *  *
 *  * Sample Input: "1,3,6,7,8,12,13,14,15,21,22,23,24,31"
 *  * Result: "1, 3, 6-8, 12-15, 21-24, 31"
 *  *
 *  * The code will be evaluated on
 *  *   - functionality
 *  *   - style
 *  *   - robustness
 *  *   - best practices
 *  *   - unit tests
 *
}*/