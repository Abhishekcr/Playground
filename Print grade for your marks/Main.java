import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
   Scanner in = new Scanner (System.in);
      int m = in.nextInt();
      if(m>=85)
      {
        System.out.print("A");
      }
      else if(m>=75)
      {
         System.out.print("B");
      }
      else if(m>=65)
      {
         System.out.print("C");
      }
      else if(m>=55)
      {
         System.out.print("D");
      }
      else if(m>=45)
      {
         System.out.print("E");
      }
      else if(m<45)
      {
         System.out.print("Fail");
      }
    }
}