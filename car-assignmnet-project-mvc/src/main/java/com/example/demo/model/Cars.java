package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Cars implements Comparable<Cars> {

	private int yearofManufacture;
	private long distanceTraveled;
	private String modelName;
	private String colour;
	private String status;
	public Cars() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cars(int yearofManufacture, long distanceTraveled, String modelName, String colour,String status) {
		super();
		this.yearofManufacture = yearofManufacture;
		this.distanceTraveled = distanceTraveled;
		this.modelName = modelName;
		this.colour = colour;
		this.status = status;
	}
	public int getYearofManufacture() {
		return yearofManufacture;
	}
	public void setYearofManufacture(int yearofManufacture) {
		this.yearofManufacture = yearofManufacture;
	}
	public long getDistanceTraveled() {
		return distanceTraveled;
	}
	public void setDistanceTraveled(long distanceTraveled) {
		this.distanceTraveled = distanceTraveled;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String ModelName) {
		this.modelName = ModelName;
	}
	public String getcolour() {
		return colour;
	}
	public void setcolour(String colour) {
		this.colour = colour;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	@Override
	public String toString() {
		return "Cars [YearofManufacture=" + yearofManufacture + ", DistanceTraveled=" + distanceTraveled + ", Model="
				+ modelName + ", Colour=" + colour + ", Status=" +  status + "]";
	}
	@Override
	public int compareTo(Cars o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
