package com.simactivation.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simactivation.dto.SimDetailsDTO;
import com.simactivation.entity.Customer;
import com.simactivation.service.CustomerServices;
import com.simactivation.validation.ValidateIdProof;

@RestController
@RequestMapping(value = "/customer/idproof")
@Validated
public class IdProofValidationController {
	@Autowired
	private CustomerServices customerServices;
	
	
	@PutMapping(value = "/validate")
	public ResponseEntity<String> validateIdproof(@Valid @RequestBody ValidateIdProof val){
		Customer customer = customerServices.VerifyIdProof(val.getIdNumber());
		if(customer == null)
		{
			return ResponseEntity.ok("Invalid details");
		}
		else {
			if(customer.getFirstName().matches(val.getFirstname()) && 
					customer.getLastName().matches(val.getLastname())&&
					customer.getDateOfBirth().equals(val.getDobDate()))
			{
				SimDetailsDTO simdetailsdto  = customerServices.verifysimstatus(customer.getSimId());
				
				
				if(simdetailsdto.getSimStatus().matches("active"))
					return ResponseEntity.ok("Sim status is active");
				else if(simdetailsdto.getSimStatus().matches("inactive"))
				{
					customerServices.updatesimstatus("active", customer.getSimId());
					return ResponseEntity.ok("sim status is activated");
				}
				else
				{
					return ResponseEntity.ok("Enter Valid Details");
				}
			}
			else if(customer.getFirstName().matches(val.getFirstname()) && 
				customer.getLastName().matches(val.getLastname()))
			{
				
				return ResponseEntity.ok("Incorrect date of birth details");
			}
			else {
				return ResponseEntity.ok("Invalid Details");
			}
				
			}	
		}

	}

