import java.util.Scanner;
class Main
{
	public static int square(int n)
    {
	 int sq=n*n;
      return sq;
	} 
  	public static void main(String args[] )
    {
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=square(n1);
      n1=n2;
      System.out.println(n1);
    }
}
