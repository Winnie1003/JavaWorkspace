package info;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        while(cin.hasNextInt())
        {
        	int sum = 0;
        	int i;
            int end = cin.nextInt();
            for(i=1;i<=end;i++) {
            	sum += i;
            }
            System.out.println(sum);
            System.out.println("");
        }
    }
}


