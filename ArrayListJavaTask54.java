import java.util.ArrayList;

public class ArrayListJavaTask54
{
    public static void main (String [] args)
    {
        ArrayList<Integer> nums = new ArrayList<>();
        
        nums.add(1);
        nums.add(5);
        nums.add(9);
        nums.add(51);
        nums.add(12);
        nums.add(-4);
        nums.add(0);
        nums.add(23);
        nums.add(35);
        nums.add(18);
        nums.add(12);
        
        System.out.println(nums);
        
        int evens = 0;
        int odds = 0;
        
        for(int x = 0; x < 11; x++ )
        {
            if(nums.get(x)%2 == 0)
            {
                evens++;
            }
            else
            {
                odds++;
            }
        }
        System.out.println("The total number of even numbers is:" + evens);
        System.out.println("The total number of odd numbers is:" + odds);
    }
}