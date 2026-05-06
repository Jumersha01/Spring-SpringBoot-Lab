package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("is")
public class InvoiceService {
    @Autowired
	Product product;
    
    @Autowired
	TaxCalculator taxCalculator;
    
    public void printInvoice() {
    	double total = this.product.price*this.product.quantity;
    	double tax = this.taxCalculator.calculateTAx(total);
    	double finalAmount = total+tax;
    	System.out.println("Invoice: \n"+"Product: "+this.product.name+"\nQuantity: "+this.product.quantity+"\nTotal (before tax): "+total+"\nTax: "+tax+"\nFinal Amount: "+finalAmount);
    }
	
  
}
