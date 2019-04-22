package day1_1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int rem,reverse=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int n = sc.nextInt();
		while (n!=0) {
			rem=n%10;
			reverse=(reverse*10)+rem;
			n=n/10;
		}
		System.out.println("reversed number is:"+reverse);
		
		
	}

}
