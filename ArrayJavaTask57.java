public class ArrayJavaTask57
{
    public static void main (String [] args)
    {
        int array [] = new int [10];
        
        for(int x = 0; x < 10; x++)
        {
            array[x] = (int) (Math.random()*20);
            
            System.out.print(x);
        }
    }
}