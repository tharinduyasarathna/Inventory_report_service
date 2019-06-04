package com.repgen.inventorycloud.service;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.repgen.inventorycloud.modal.CriticalItem;

@Service
public class CriticalStockServiceImpl implements CriticalStockService{
	
	@Override
	public String ctriticalItems(){
		
		RestTemplate restTemplate=new RestTemplate();
		HttpHeaders httpHeaders=new HttpHeaders();

//		//extract token from context
//		OAuth2AuthenticationDetails oAuth2AuthenticationDetails =(OAuth2AuthenticationDetails)
//				SecurityContextHolder.getContext().getAuthentication().getDetails();

//		System.out.println(">>>>"+oAuth2AuthenticationDetails.getTokenValue());
//		httpHeaders.add("Authorization","bearer".concat(oAuth2AuthenticationDetails.getTokenValue()));

		//
		ResponseEntity<String> responseEntity;
		HttpEntity<String> httpEntity=new HttpEntity<>("",httpHeaders);
		 responseEntity=restTemplate.exchange("http://localhost:8080/item/"
				 ,HttpMethod.GET,httpEntity, String.class);


				
				// CriticalItem[] criticalItems = responseEntity.getBody();
		 String response = "response is " + responseEntity.getBody().toString();
		 
		return response;
	}

}
