package com.sample;

public class Sample implements Demo 
{
		
	

	@Override
	public void add() {
System.out.println("Addition done");		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Sample s=new Sample();
		s.add();
	}

}
