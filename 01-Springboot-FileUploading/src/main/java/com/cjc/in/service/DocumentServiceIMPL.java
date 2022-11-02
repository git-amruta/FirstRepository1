package com.cjc.in.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.in.model.Document;
import com.cjc.in.repository.DocumentRepository;

@Service
public class DocumentServiceIMPL implements DocumentService{
	@Autowired
    private DocumentRepository repo;
	@Override
	public Document saveDocuments(Document doc) {
		repo.save(doc);
		
		return doc;
		
	}

}
