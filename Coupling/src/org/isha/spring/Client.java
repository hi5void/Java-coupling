package org.isha.spring;

public class Client {
	public static void main(String[] args) {
		Invoice invoice = new Invoice("01","BABU");
		InvoiceService invoiceService = new InvoiceService();
		invoiceService.raiseInsvoice(invoice);
	}

}
