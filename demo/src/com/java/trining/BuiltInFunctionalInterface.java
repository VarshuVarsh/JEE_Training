package com.java.trining;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class BuiltInFunctionalInterface {

	public void usingPredicate() {
		CheckHousingLoanEligibility eligible = new CheckHousingLoanEligibility();
		Predicate<Double> CheckHousingLoloanEligibility = (salaryPerMonth) -> {
			boolean result = false;
			if (salaryPerMonth > 3000) {
				result = true;
			}
			return result;
		};
		System.out.println("Ramesh with Salary 20000 is Eligible :" +eligible.test(20000.00));
		System.out.println("Suresh with Salary 80000 is Eligible :" +eligible.test(80000.00));

	}

	public void usingConsumer() {
		List<String> names = new ArrayList<>();
		names.add("Anand");
		names.add("ZAhir");
		names.add("Mahi");
		names.add("Varshu");
		Consumer<String> print = (name) -> System.out.println(name);
		names.forEach(print);
	}

	public void usingFunction() {
		Function<Double, Double> currencyConverter = (inr) -> inr / 70;
		System.out.println("INR to USD" + currencyConverter.apply(100.00));

	}

	public static void main(String[] args) {
		BuiltInFunctionalInterface obj = new BuiltInFunctionalInterface();
	obj.usingPredicate();
	obj.usingConsumer();
	obj.usingFunction();
	}
}