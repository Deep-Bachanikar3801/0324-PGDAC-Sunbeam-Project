package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Category extends BaseEntity{
	@Column(length = 20)
	private String categoryName;
	
	 
	@OneToMany
	(mappedBy = "bookCategory",
	cascade = CascadeType.ALL)
	private List<BookDetails> books = new ArrayList<BookDetails>();
	  
}