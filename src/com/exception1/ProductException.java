package com.exception1;

import java.util.Scanner;

import com.exception.Product;

public class ProductException extends RuntimeException {


	private static final long serialVersionUID = 1L;

	public ProductException(String message) {
		super(message);
	}
	
	public static void main(String[] args) {
	
		Product p=new Product();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product weight-");
	int	productwt=sc.nextInt();
	
   try {
	   p.productCheck(productwt);
   } catch(Exception e) {
	   System.out.println(e);
   }

	}

}
