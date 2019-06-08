import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
     Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    int m=3;
    for(int sc=1; sc<=n; sc++)
    {
      System.out.print(sc);
    if(sc%m==0)
    {
      System.out.print(",");
    }}
  }
}