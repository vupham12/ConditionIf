package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so: \n");
		int n = 0;
		n = sc.nextInt();
		if (n >0) 
		{
			System.out.println("là số dương :"+n);
		}
		else if(n < 0)
		{
		    System.out.println("là số âm :"+n	);
		}
		else
			System.out.println("khong phai so duong cung khong phai so am");
		
			if (n%3==0)
			{
				System.out.println(" chia hết cho 3");
		}
			else if (n%5==0)
			{
				System.out.println("chia hết cho 5");
			}
			System.out.println("nhập month :");
			int month; 
			month = sc.nextInt();
			switch(month) {
			// các tháng 1,3,5,7,8,10 và 12 có 31 ngày.
			case 1:
			case 3:
			case 5:
			case 7:	
			case 8:
			case 10:
			case 12:
				System.out.println("tháng "+ month+"có 31 ngày");
			}
			
		

	}

}
