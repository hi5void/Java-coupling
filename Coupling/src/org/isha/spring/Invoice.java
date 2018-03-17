package org.isha.spring;

public class Invoice {
	private String invoiceId;
	private String customerName;
	private String status;
	public Invoice() {
	}
	public Invoice(String invoiceId, String customerName) {
		this.invoiceId = invoiceId;
		this.customerName = customerName;
		this.status = "Raised";
	}
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void cancel() {
		this.status="Cancelled";
	}
	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", customerName=" + customerName + ", status=" + status + "]";
	}
	
	

}
