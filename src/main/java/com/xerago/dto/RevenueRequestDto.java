package com.xerago.dto;

public class RevenueRequestDto {

	private String programType;
	private String productName;

	public RevenueRequestDto() {

	}

	public RevenueRequestDto(String programType, String productName) {
		super();
		this.programType = programType;
		this.productName = productName;
	}

	public String getProgramType() {
		return programType;
	}

	public void setProgramType(String programType) {
		this.programType = programType;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}
