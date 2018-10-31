package com.example.java.gettingstarted.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.java.gettingstarted.products.Productss;

@RestController
@RequestMapping("/api")

public class controller {
	//@Autowired
	private static final String template = "Hello, %s!";
	//productssRepository productsrepo;
	
	@GetMapping("/products")
	public Productss listing(String productName, String descritpion, String url)
	//public List<Productss> getAllProducts(String productName)
	
	{
		productName = "DuraCell";
		descritpion = "Batteries";
		url = "https://dura.com";
		
		
		
				
	    //return productsrepo.findByProductName(productName);
		return new Productss(productName, descritpion, url);
		
	}
	
	

}
