package org.isha.spring;

public class InvoiceService {
	public void raiseInsvoice(Invoice invoice) {
		InvoicingDAOImpl dao = new InvoicingDAOImpl();
		dao.save(invoice);
	}
}
