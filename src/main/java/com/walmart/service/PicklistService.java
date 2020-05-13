package com.walmart.service;

import com.walmart.dto.RequestDTO;
import com.walmart.dto.ResponseDTO;
import com.walmart.model.PicklistModel;



public interface PicklistService extends CRUD<PicklistModel> {
	
	public ResponseDTO imageReturn(RequestDTO requestDto);

}
