package org.isha.spring;

public class HibernateDAO implements InvoicingDAO{
	public void save(Invoice newInvoice) {
		System.out.println("hibernate stubs");
	}

	@Override
	public void delete(Invoice oldInvoice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Invoice invoiceToCancel) {
		// TODO Auto-generated method stub
		
	}

}
