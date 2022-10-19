package com.exception;

import com.exception1.ProductException;

public class Product {

	
	public void productCheck(int wt){
		
		if(wt<100) {
			throw new ProductException("Invalid Weight, weight mut be above 100");
		}
		else {
			System.out.println("Product is ready for dispatch");
		}
	}

}
