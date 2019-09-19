package com.xerago.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xerago.dto.RevenueRequestDto;
import com.xerago.dto.RevenueResponseDto;
import com.xerago.repository.Employee;
import com.xerago.repository.EmployeeRepository;
import com.xerago.service.RevenueService;

@Service("revenueService")
public class RevenueServiceImpl implements RevenueService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public RevenueResponseDto revenueCalculation(RevenueRequestDto revenueRequestDto) {
		List<Employee> employees = employeeRepository.findAll();
		System.out.println(employees.toString());
		return new RevenueResponseDto();
	}

}
