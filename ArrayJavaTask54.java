public class ArrayJavaTask54
{
    public static void main (String [] args)
    {
       int array [] = new int[11];
       
       array[0] = 1;
       array[1] = 5;
       array[2] = 9;
       array[3] = 51;
       array[4] = 12;
       array[5] = -4;
       array[6] = 0;
       array[7] = 23;
       array[8] = 35;
       array[9] = 18;
       array[10] = 12;
       
       int evens = 0;
       int odds = 0;
       for(int b = 0; b<11; b++)
       {
           System.out.println(array[b]);
       }
       for(int x = 0; x < 11; x++)
       {
           if(array[x]%2 == 0)
           {
               evens++;
           }
           else
           {
               odds++;
           }
       }
       System.out.println("The number of even numbers is:" + evens);
       System.out.println("The number of odd numbers is:" + odds);
    }
}