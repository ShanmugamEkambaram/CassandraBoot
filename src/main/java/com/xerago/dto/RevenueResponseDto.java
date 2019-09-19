package com.xerago.dto;

public class RevenueResponseDto {

	private String programType;
	private String productName;

	public RevenueResponseDto() {

	}

	public RevenueResponseDto(String programType, String productName) {
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
