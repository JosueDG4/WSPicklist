package com.walmart.service.imp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Service;

import com.walmart.dto.RequestDTO;
import com.walmart.dto.ResponseDTO;
import com.walmart.model.PicklistModel;
import com.walmart.service.PicklistService;


@Service
public class PicklistServiceImp implements PicklistService{

	private static FileInputStream fileInputStreamReader;


	public PicklistModel save(PicklistModel t) {
		// TODO Auto-generated method stub
		return null;
	}

	public PicklistModel update(PicklistModel t) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public PicklistModel findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<PicklistModel> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public String imageReturn() {
		// TODO Auto-generated method stub
		return null;
	}

	 private static String encodeFileToBase64Binary(File file){
         String encodedfile = null;
         try {
             fileInputStreamReader = new FileInputStream(file);
             byte[] bytes = new byte[(int)file.length()];
             fileInputStreamReader.read(bytes);
             encodedfile = new String (Base64.encodeBase64(bytes),"UTF-8");
         } catch (FileNotFoundException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         } catch (IOException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }

         return encodedfile;
     }
	
	
	public ResponseDTO imageReturn(RequestDTO requestDto) {
		
		String nameImage = requestDto.getImage();
		System.out.println(nameImage);
		//String rutaServer = "C:/Users/vn08w1y/Documents/PROYECTO PICKLIST/PRUEBAS DESARROLLO/imagenes/";
		String rutaServer = "C:/Users/vn08w1y/Documents/PROYECTO PICKLIST/img_thumb/";
		String rutaServerComodin = "C:/Users/vn08w1y/Documents/PROYECTO PICKLIST/PRUEBAS DESARROLLO/comodin/";
		File imageBase64 =  new File(rutaServer+nameImage);
		File imageComodinSC = new File (rutaServerComodin+"sc.jpg");
		ResponseDTO response = new ResponseDTO();
		String encodstring;
		
		if (imageBase64.exists()){
			System.out.println("Imagen existe en el servidor central");
			encodstring = encodeFileToBase64Binary(imageBase64);
	        System.out.println(encodstring);     							
			response.setImageReponse(encodstring);
			
		}else{
			System.out.println("Imagen no existe en el servidor central");
			encodstring = encodeFileToBase64Binary(imageComodinSC);
			response.setImageReponse(encodstring);
		}

		return response;
	}
	
	
	
	

}
