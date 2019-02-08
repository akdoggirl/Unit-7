import java.util.ArrayList;

public class JavaTask52
{
    public static void main (String [] args)
    {
        ArrayList<Integer> nums = new ArrayList<>();
        
        nums.add(56);
        nums.add(22);
        nums.add(45);
        nums.add(13);
        nums.add(78);
        nums.add(38);
        nums.add(267);
        nums.add(655);
        nums.add(26);
        nums.add(27);
        nums.add(38);
        nums.add(462);
        
        int numOfEvens = 0;
        int numOfOdds = 0;
        
        System.out.println(nums);
        
        for(int x = 0; x < nums.size(); x++)
        {
            if(nums.get(x) %2 == 0)
            {
                numOfEvens++;
            }
            else
            {
               numOfOdds++;
            }
        }
        System.out.println("The number of even numbers is:" + numOfEvens);
        System.out.println("The number of odd numbers is:" + numOfOdds);
    }
}