package com.wipro.pday4;

import java.util.Scanner;

public class BinaryToDecimal {
	
	public static int BtoD(int n) {
		int res=0;
		int multi = 1;
		while(n!=0) {
			res+=(n%10)*multi;
			multi*=2;
			n/=10;
		}
		return res;
	}
	
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	System.out.println(BtoD(n));
}
}
