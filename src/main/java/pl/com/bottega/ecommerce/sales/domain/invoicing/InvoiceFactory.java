package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

public class InvoiceFactory {
	
	
	public static Invoice createInvoice(Id generate, ClientData client) {
		// TODO Auto-generated method stub
		return new Invoice(generate, client);
	}
}
