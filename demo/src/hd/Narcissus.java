package hd;

import java.util.Scanner;

public class Narcissus {
	
	static int m,n;
	static int g,s,b;
	static int narcissus,num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			m = sc.nextInt();
			n = sc.nextInt();
			for (int i=m;i<=n;i++) {
				g = i%10;
				s = i/10%10;
				b = i/100;
				
				//����ˮ�ɻ���
				narcissus = g*g*g+s*s*s+b*b*b;
				
				if (i == narcissus) {
					if(num == 0)
						System.out.print(i);
					else
						System.out.print(" "+i);
					num++;
					
				}
			}
			if(num == 0) {
				System.out.println("no");
			}else {
				System.out.println("");
			}
			num = 0;
		}
		
	}
	


}
