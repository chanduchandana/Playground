import java.util.Scanner;
class Main {
	public static void main (String[] args){
         // Get the value n
	     Scanner in  = new Scanner(System.in);
	     int n = in.nextInt();
      	int sum=0,count;
         // Run for loop until it reaches the given number
	     for( count = 1; count <= n; count = count + 1)
	     {
	         sum=sum+count;
         }
	            System.out.println(sum);   
	        
             // Increase the count by step 1
	         count = count + 1;
	     }
	}
