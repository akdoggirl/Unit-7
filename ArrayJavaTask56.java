public class ArrayJavaTask56
{
    public static void main (String [] args)
    {
        boolean array [] = new boolean [100];
        
        for(int x = 0; x < 100; x++)
       {
            if(x % 2 == 0)
           {
              array[x] = (false);
           }
           else
           {
              array[x] = (true);
           }
       } 
       for(int y = 0; y<100; y++)
       {
           System.out.println(array[y]);
       }
    }
}