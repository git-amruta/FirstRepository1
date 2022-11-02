package com.cjc.in.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Document {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int did;
	@Lob
	private byte[]adhar;
	@Lob
	private byte[]pan;
	@Lob
	private byte[]sign;
	@Lob
	private byte[]photo;
	

}
