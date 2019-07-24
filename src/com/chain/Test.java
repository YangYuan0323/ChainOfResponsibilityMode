package com.chain;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Leader teacher1 = new ClassAdviser();
		Leader teacher2 = new Dean();
		Leader teacher3 = new DepartmentHead();
		
		teacher1.setNext(teacher2);
		teacher2.setNext(teacher3);
		teacher1.handleRequest(8);
		
	}

}
