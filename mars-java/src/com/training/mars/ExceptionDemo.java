package com.training.mars;



public class ExceptionDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int a=5;
		int b=10;
		
		try { 
			show();
			if(a>b) {
				System.out.println("a is greater");
			} else {
				throw new MyException("Lesser value");
			}
		}
		catch(ArithmeticException e) {
			System.out.println("exception thrown from show method");
		} catch (MyException e) {
			System.out.println("inside catch block");
			System.out.println(e.getMessage());
		}
	}

	private static void show() throws ArithmeticException {
		int a=5;		
		int b=a/0;
		System.out.println("Value of b is: " + b);
		
	}
	
	
}
