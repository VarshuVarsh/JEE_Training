package com.example.demo.model;

import org.hibernate.validator.constraints.Range;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class BloodDonor {

    @Range(min=11111, max= 99999 , message="Enter only 5 digits")
	long phoneNumber;
	String firstName;
	String bloodGroup;
}
