package org.example.app.controller;

import org.example.app.service.InvoiceServiceInterface;
import org.example.app.entity.Invoice;

public class InvoiceControllerWeb implements InvoiceControllerInterface {

  private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    @Override
    public void createInvoice(){
     //System.out.println("what is customer name!");
      //  Scanner sc = new Scanner(System.in);
        String customerName = "Tesla";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);

        invoiceService.createInvoice(invoice);
    }
}
