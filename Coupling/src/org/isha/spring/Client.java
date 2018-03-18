package org.isha.spring;

public class Client {
	public static void main(String[] args) {
		
		InvoiceService invoiceService = new InvoiceService();
		InvoicingDAO dao = new InvoicingDAOImpl();
		invoiceService.setDao(dao);
		
		Invoice invoice = new Invoice("01","BABU");
		invoiceService.raiseInvoice(invoice);
	}

}
