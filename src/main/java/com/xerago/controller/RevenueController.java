package com.xerago.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xerago.dto.RevenueRequestDto;
import com.xerago.dto.RevenueResponseDto;
import com.xerago.service.RevenueService;

@RestController
@RequestMapping(value = "/revenue")
public class RevenueController {

	@Autowired
	RevenueService revenueService;

	@PostMapping("/details")
	public RevenueResponseDto revenueDetails(@RequestBody RevenueRequestDto revenueRequestDto) {
		return revenueService.revenueCalculation(revenueRequestDto);

	}

	@GetMapping
	public RevenueRequestDto revenueDetails() {
		return new RevenueRequestDto("Darment Credit Card", "Credit Card");

	}

}
