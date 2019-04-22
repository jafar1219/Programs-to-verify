package day1_1;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		int rem=0,arm=0,temp;
		int n = sc.nextInt();
		temp=n;
		while (temp!=0) {
			rem=temp%10;
			arm=arm+(rem*rem*rem);
			temp=temp/10;
		}
	System.out.println("armstrong no is :"+arm);
	
	
	}
}
