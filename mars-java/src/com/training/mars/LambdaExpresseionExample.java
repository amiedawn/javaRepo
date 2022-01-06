package com.training.mars;

public class LambdaExpresseionExample {

	public static void main(String[] args) {
		int width = 20;
		// needs to be assigned to a functional interface type (in this case, it it Draw)
		Draw s = () -> {
			System.out.println("Displaying: " + width);
		};
		
		s.draw();

	}

}
