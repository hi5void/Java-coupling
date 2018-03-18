package org.isha.spring;


public class InvoiceService {
	private InvoicingDAO dao;

	public void setDao(InvoicingDAO dao) {
		this.dao = dao;
	}

	public void raiseInvoice(Invoice invoice) {
		InvoicingDAO dao = new InvoicingDAOImpl();
		dao.save(invoice);
	}
}
