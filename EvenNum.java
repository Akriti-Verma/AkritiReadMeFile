package logical;

import java.util.Scanner;

public class EvenNum {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int num = sc.nextInt();
//
//		for (int i = 2; i <= num; i++) {
//			if (i % 2 == 0) {
//				System.out.print(i + " ");
//			}
//		}
		
		int num=12;
		for(int i=2;i<= num;i++) {
			if(i%2==0) {
				System.out.println(i +" is a even num");
			}
		}
	}

}
