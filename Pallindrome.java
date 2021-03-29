package NestedLoops;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int r=2*n-1;
		for(int i=1;i<=r;i++) {
			if(i<=n) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
			}
			else {
				for(int k=1;k<=r-i+1;k++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
