package com.nt.beans;

public class car {
	private String regNo;
	private String engineNo;
	private String model;
	private int engineCC;
	private String owner;
	private String color;
	private String type;
	private String fuelType;
	private String company;
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "car [regNo=" + regNo + ", engineNo=" + engineNo + ", model=" + model + ", engineCC=" + engineCC
				+ ", owner=" + owner + ", color=" + color + ", type=" + type + ", fuelType=" + fuelType + ", company="
				+ company + "]";
	}
	
	
	
	
	
	
	
	

}
