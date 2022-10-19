package com.exception;

public class Product implements Runnable {

	
	public void productCheck(int wt){
		
		if(wt<100) {
			throw new Product("Invalid Weight, weight mut be above 100");
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
