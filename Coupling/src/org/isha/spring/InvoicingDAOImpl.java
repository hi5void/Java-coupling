package org.isha.spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InvoicingDAOImpl implements InvoicingDAO {
	private static final String INSERT_STMT = "insert into INVOICES (INVOICE_ID, CUSTOMER_NAME) values(?, ?) ";
			
	private static final String DRIVER_URL ="org.hsqldb.jdbcDriver";
	private static final String DATABASE_URL ="jdbc:hsqldb:file:invoicedb.dat;shutdown=true;";
	private static final String CREATE_STMT ="create table INVOICES(INVOICE_ID varchar(255),CUSTOMER_NAME varchar(255))";
	
	public InvoicingDAOImpl() {
		try {
			Class.forName(DRIVER_URL);
			createTables();
		}catch(ClassNotFoundException e){
			throw new DatabaseUnavailableException();
			
		}
	}

	private static void createTables() {
		try {
			Connection conn = null;
			PreparedStatement createTable = null;
			try {
				conn = DriverManager.getConnection(DATABASE_URL,"sa","");
				createTable = conn.prepareStatement(CREATE_STMT);
				createTable.executeUpdate();
			}finally {
				if(createTable!=null) 
					createTable.close();
				if(conn!=null)
					conn.close();
			
			}
		}catch(SQLException e) {
		
		 }
	}
	public void save(Invoice newInvoice) {
		try {
			Connection conn = null;
			PreparedStatement insert = null;
			try {
				conn = DriverManager.getConnection(DATABASE_URL,"sa","");
				insert = conn.prepareStatement(INSERT_STMT);
				insert.setString(1,newInvoice.getInvoiceId());
				insert.setString(2, newInvoice.getCustomerName());
				insert.executeUpdate();
			} finally {
				if(insert!=null)
					insert.close();
				if(conn!=null)
					conn.close();
			  }
		} catch (SQLException e) {
			
		}
	}
	public void delete(Invoice oldInvoice) {
		System.out.println("delete part");
	}
	public void update(Invoice updateInvoice) {
		System.out.println("update");
	}
}
