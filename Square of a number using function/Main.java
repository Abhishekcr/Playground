import java.util.Scanner;
class Main
{
  public static int sqr (int m)
  {
    int s = m * m;
    return s;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int sqre = sqr(n);
      System.out.print(sqre);
    
	} 
}