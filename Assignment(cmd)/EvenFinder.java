package com.ojas.corejava.basic;

public class EvenFinder {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			String evenOdd;
				 evenOdd = (num % 2 == 0) ? "True" : "False";
				 System.out.println(evenOdd);
			}
			catch (NumberFormatException e) {
				System.out.println(e+"error");
			}
		

	}

}
