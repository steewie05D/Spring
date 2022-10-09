package org.example.app.Repository;
import org.example.app.entity.Invoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceRepositoryMemory implements InvoiceRepositoryInterface {

    private static List<Invoice> invoices=new ArrayList<>();

    public void create (Invoice invoice){
        invoices.add(invoice);
        System.out.println("Invoice added with numer "+invoice.getNumber()+"for "+invoice.getCustomerName());

    }


}
