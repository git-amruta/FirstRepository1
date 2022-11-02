package com.cjc.in.controller;

import java.io.IOException;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.in.model.Document;
import com.cjc.in.service.DocumentService;

@RestController
@RequestMapping("/docApi")
public class DocumentController {
	
	@Autowired
	private DocumentService service;
	
	@PostMapping("/saveDocuments")
	public ResponseEntity<String> saveDocuments(
			@RequestPart MultipartFile f1,
			@RequestPart MultipartFile f2,
			@RequestPart MultipartFile f3,
			@RequestPart MultipartFile f4) throws IOException{
		
		Document doc=new Document();
		doc.setAdhar(f1.getBytes());
		doc.setPan(f2.getBytes());
		doc.setSign(f3.getBytes());
		doc.setPhoto(f4.getBytes());
		
		service.saveDocuments(doc);
		
		 return new ResponseEntity<String>("Inserted....!!",HttpStatus.OK);
		
		
	}

}

