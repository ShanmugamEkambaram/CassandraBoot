package com.xerago.service;

import com.xerago.dto.RevenueRequestDto;
import com.xerago.dto.RevenueResponseDto;

public interface RevenueService {

	public RevenueResponseDto revenueCalculation(RevenueRequestDto revenueRequestDto);
    
}
