import java.util.Scanner;

public class ArrayJavaTask55
{
    public static void main (String [] args)
    {
        String array [] = new String [8];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter 8 words or phrases that you would like in your list now");
        
        for(int x = 0; x<8; x++)
        {
            sc.next();
        }
        for(int y = 0; y < 8; y++)
        {
            if(array[y].length()>5)
            {
                System.out.println(array[y]);
            }
            else
            {
                System.out.print("");
            }
        }
    }
}