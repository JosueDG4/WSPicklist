package com.walmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




import com.walmart.dto.RequestDTO;
import com.walmart.dto.ResponseDTO;
import com.walmart.service.PicklistService;



@RestController
@RequestMapping("/picklist")
public class PicklistController {
	
	
	@Autowired 
	private PicklistService service; 
	
	@PostMapping(value="/findImages", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> findClientId( @RequestBody RequestDTO requestDTO){
	
		ResponseDTO per = new ResponseDTO();
		per =  service.imageReturn(requestDTO);
		return new ResponseEntity<Object>(per, HttpStatus.OK);
	}
	
	

}
