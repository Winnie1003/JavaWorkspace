package info;

public class Ninenine {
	public static void main(String args[]) {
		//print every column
		for(int i=1;i<=9;i++) {
			
			//print every row
			for(int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}
