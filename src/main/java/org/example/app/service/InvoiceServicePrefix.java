package org.example.app.service;

import org.example.app.Repository.InvoiceRepositoryInterface;
import org.example.app.entity.Invoice;

public class InvoiceServicePrefix implements InvoiceServiceInterface {

    private static long lastNumeber = 122L;//garage michel
    private InvoiceRepositoryInterface invoiceRepository ;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void createInvoice(Invoice invoice) {
        invoice.setNumber(String.valueOf("INV "+(++lastNumeber)));
        invoiceRepository.create(invoice);
    }
}
