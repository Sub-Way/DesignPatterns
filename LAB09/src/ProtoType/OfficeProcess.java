/* 2013112015 ¿”¡¯º∑ */
package ProtoType;

import java.util.*;
import java.io.*;

class OfficeProcess
{	
	private static Customer customerPrototype;
	Vector customers = new Vector();
	private static OfficeProcess officeProcess = new OfficeProcess(); 

	private OfficeProcess(){	
		super();
	}

	public void getAndProcessCustomers()
	{
		Customer customer;  
		String customerName = "not yet assigned";

		BufferedReader bufReader =  new BufferedReader( new InputStreamReader( System.in ) );

		try {	
			System.out.println( "Enter customer names or '-quit'" );

			while( !"-quit".equals( customerName ) ) {				
				customerName = bufReader.readLine();    

				if( !"-quit".equals( customerName ) )  
				{	
					customer = (Customer)OfficeProcess.customerPrototype.clone(); 

					customer.setName( customerName );  
					System.out.println( "... more interaction to get information about " + customerName + "... : Stored in database" );
					this.customers.addElement( customer ); 
				}
			}
		}
		catch( IOException e ){
			System.out.println( e ); 
		}

		System.out.println( "\nThe customers entered during this session: " );
		for( int customersIndex = 0; customersIndex < customers.size(); ++customersIndex ){
			customer = (Customer)this.customers.elementAt( customersIndex );
			customer.print();
		} 
	}

	public static Customer getCustomerPrototype(){
		return customerPrototype;
	}

	public static OfficeProcess getOfficeProcess(){
		return officeProcess;
	}

	public void setCustomerPrototype( Customer customer ) {
		customerPrototype = customer;	
	}
}