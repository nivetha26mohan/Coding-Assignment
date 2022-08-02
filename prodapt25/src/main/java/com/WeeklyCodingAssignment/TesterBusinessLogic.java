package com.WeeklyCodingAssignment;
public class TesterBusinessLogic {
	public static void main(String[] args) {
		BusinessLogic bl=new BusinessLogic();
		bl.addBooks();
		System.out.println("\nAfter adding the Books ");
		bl.displayBooks();
		bl.updateBooks(3,1114,"Playing It My Way","Sachin Tendulkar");
		System.out.println("\nAfter Updating the book ");
		bl.displayBooks();
		}
}
