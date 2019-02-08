import java.util.ArrayList;

public class JavaTask48
{
    public static void main (String [] args)
    {
        ArrayList<Double> nums = new ArrayList<>();
        
        nums.add(12.4);
        nums.add(13.7);
        nums.add(14.9);
        nums.add(15.2);
        nums.add(16.4);
        nums.add(17.5);
        
        System.out.println(nums);
        
        nums.remove(2);
        nums.remove(3);
        
        System.out.println(nums);
    }
}