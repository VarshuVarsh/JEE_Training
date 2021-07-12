package com.java.trining;

import java.util.List;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import com.java.trining.CreditCard;
import static java.util.stream.Collectors.*;

public class CreditCardService {

	private List<CreditCard> cards;

	public CreditCardService(List<CreditCard> cards) {
		super();
		this.cards = cards;

	}

	public List<CreditCard> getCards() {
		return cards;
	}

	// using filter and map
	public void usingFilterAndMap() {
		
		// using filter alone
		
		List<CreditCard> creditLimitMoreThan5Lakh = this.cards.stream().filter((card) -> card.getCreditLimit()>500000)
				.collect(toList());
		creditLimitMoreThan5Lakh.forEach(System.out::println);
		
		// using filter and map - 2 intermediate operator and one
		
		List<String> nameOfMoreThan5Lakh = this.cards.stream().filter(card-> card.getCreditLimit() < 500000.0).map(card -> card.getCardHolderName()).collect(toList());
		System.out.println("Credit Limit less than 5 lakh");
		nameOfMoreThan5Lakh.forEach(System.out::println);
	}

	// collect to map
	public void collectingToUtilMap() {
		Map<String, Long> teleCallingList = this.cards.stream().filter(card -> card.getCreditLimit() < 500000)
				.collect(toMap(CreditCard::getCardHolderName, CreditCard::getPhoneNumber));
		System.out.println("teleCallingList::" + teleCallingList);
	}

	// finding minimum credit card limit
	public void findMinimumCreditLimit() {
		Optional<CreditCard> minCard = this.cards.stream().min(Comparator.comparing(CreditCard::getCreditLimit));

		// isPresent and get => look at code with these statement
		if (minCard.isPresent()) {
			System.out.println("Minimum Credit Limit: " + minCard.get().getCreditLimit());
		}
	}

	//finding maximum credit card limit
	public void findMaximumCreditLimit() {

		// Optional, Comparator.Comparing => look at code with these statements
		Optional<CreditCard> maxCard = this.cards.stream().max(Comparator.comparing(CreditCard::getCreditLimit));

		// isPresent and get => look at code with these statement
		if (maxCard.isPresent()) {
			System.out.println("Maximum Credit Limit: " + maxCard.get().getCreditLimit());
		}

	}
}
