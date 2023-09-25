
/**
 * Write a description of class whiles here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class whiles
{
   public void run() {
       int i = 0;
       while (i<15) {
           System.out.println("i is "+i+" but is less than 15");
           i++;
       }
       int k = 6;
       while (k>5) {
           System.out.println("k is "+k+" and is greater than 5");
           k++;
       } 
       int a = 0;
       int b = 0;
       while (a<10 & b<=20) {
           System.out.println("a is "+a+" and is less than 10");
           a++;
           System.out.println("b is "+b+" and is less than or equal to 20");
           b++;
       }
   }
   public static void main(String[] args)
   {
       whiles hw = new whiles();
       hw.run();
   }
}
