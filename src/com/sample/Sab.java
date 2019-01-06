package com.sample;

public class Sab extends Abs {

	@Override
	public void add() {
		int a=10+5;
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		Sab s=new Sab();
		//s.add();
		s.sub();
		s.add();
		
	}

}
