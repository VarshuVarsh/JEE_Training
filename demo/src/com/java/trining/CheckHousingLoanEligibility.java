package com.java.trining;

public class CheckHousingLoanEligibility {
	public boolean  test(double salary) {
		System.out.println("Eligible for home loan");
		if(salary > 50000.00) {
			return true;
		}else {
			return false;
		}
	}
}
