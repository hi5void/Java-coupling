package org.isha.spring;

public class InvoiceService {
	public void raiseInsvoice(Invoice invoice) {
		InvoicingDAO dao = new InvoicingDAO();
		dao.save(invoice);
	}
}
