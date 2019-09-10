package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
//classe d exception de produit gratuit c-a-d prix=0
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProduitGratuitException extends RuntimeException {
	
	

	public ProduitGratuitException(String msg)
	{
		
		super(msg);
	}

}
