package com.wipro.pday4;

public class Iphone10 {
	public static void main(String[] args) {
		IMobile[] a =new IMobile[] {
			new IPhone(), new Samsung(), new Nokia(), new IPhone(),new IPhone(),new Samsung(), new Nokia(),new IPhone(), new Samsung(), new Nokia()
	};
	for(IMobile e : a) {
		if(e instanceof IPhone) {
			e.model();
			e.cost();
			System.out.println();
		}
	}
	}
}
