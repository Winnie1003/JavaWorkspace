package hd;

import java.util.Scanner;

public class EvenGroupSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s = new Scanner(System.in);
		
		while(s.hasNext()) {
			//输入数组的长度
			int n = s.nextInt();
			
			//获取m,m为按照顺序每m个数输出一个平均值
			int m = s.nextInt();
			
			//定义一组数组，从2开始递增有序偶数，长度为n
			int arry[] = new int[n];
			
			//得到数组arry
			for(int i=0;i<arry.length;i++)
				arry[i] = 2*(i+1);
			

			for(int i=0;i<(n/m);i++){//将n个数据分成n/m组
				int sum = 0;//定义每m个数据的和
				for(int j=i*m;j<(i+1)*m;j++)
					sum += arry[j];
				if(i == 0)
					System.out.print(sum/m);
				else
					System.out.print(" "+sum/m);

			}
			
			if(n%m != 0) {
				int sum =0;
			
				for(int k=(n-n%m);k<n;k++)
					sum += arry[k];
				System.out.print(" "+sum/(n%m));
				
			}
			System.out.println("");

		}
		
		
	}

}
