package org.example.app.service;
import org.example.app.Repository.InvoiceRepositoryInterface;
import org.example.app.entity.Invoice;

public class InvoiceServiceNumber implements InvoiceServiceInterface {

    private static long lastNumber=0L;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    private InvoiceRepositoryInterface invoiceRepository;

   public void  createInvoice(Invoice invoice){
       invoice.setNumber(String.valueOf(++lastNumber));
       invoiceRepository.create(invoice);

   }
}
