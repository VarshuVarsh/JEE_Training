package com.java.trining;

import java.util.function.*;
import java.util.stream.*;
import com.java.trining.*;

public class CreditCard {
	private long cardNumber;
	private String cardHolderName;
	private long phoneNumber;
	private double creditLimit;

	public CreditCard() {
		super();
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public CreditCard(long cardNumber, String cardHolderName, long phoneNumber, double creditLimit) {
		super();
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.phoneNumber = phoneNumber;
		this.creditLimit = creditLimit;

	}
}
