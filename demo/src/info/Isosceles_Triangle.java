package info;

public class Isosceles_Triangle {
	public static void main(String args[]) {
		int tier = 4;
		for(int i=1;i<=tier;i++) {
			
			//print blank space every row
			for(int n=1;n<=tier-i;n++)
				System.out.print(" ");
			//print * every row	
			for(int j=1;j<=2*i-1;j++)
				System.out.print("*");
				System.out.println();
		}
		
	}
}
