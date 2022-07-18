package com.prodapt.basics;

public class SimpleInterest {
		static int si,principal,rate,time,amount;
		void calculation(int principal,int rate,int time) {
			si=(principal*rate*time)/100;
			amount=si+principal;
			System.out.println("Simple Interest is Rs."+si);
			System.out.println("Amount to be paid after Loan duration ends is Rs."+amount);
		}
		
}
