package com.wipro.pday4;

interface IMobile{
	void model();
	void cost();
	
}

class IPhone implements IMobile{
	@Override
	public  void model() {
		System.out.println("Model Name is : Iphone15");
	}
	@Override
	public void cost() {
		System.out.println("Cost of Iphone15 is : 180000");
	}
}

class Samsung implements IMobile{
	@Override
	public  void model() {
		System.out.println("Model Name is : Sams235");
	}
	@Override
	public void cost() {
		System.out.println("Cost of Sams235 is : 108000");
	}
}

class Nokia implements IMobile{
	@Override
	public  void model() {
		System.out.println("Model Name is : Nokia235");
		
	}
	@Override
	public void cost() {
		System.out.println("Cost of Nokia235 is : 28000");
	}
}

public class InterFaceImp {
public static void main(String[] args) {
	IMobile [] a=new IMobile[] {
		new Nokia(),new Samsung(), new IPhone()
	};
	
	for(IMobile i: a) {
		i.model();
		i.cost();
		System.out.println();
	}
}
}
