import java.util.ArrayList;
import java.util.Scanner;

public class JavaTask50
{
    public static void main (String [] args)
    {
        ArrayList<String> words = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        
        boolean x = true;
        
        System.out.println("Would you like to continue? (true or false). You must do this every time.");
        System.out.println("If true, enter whatever word you would like in your array");
        System.out.println("When you are done entering words, simply say 'false' and the program will finish");
        
        
         while(x==true)
          {
              if(sc.next().equals("false"))
        {
         System.out.println("The array is finished");
          x=false;
        }
         else 
         {
             words.add(sc.next());
             System.out.println(words);
          }
        }
    }
}
