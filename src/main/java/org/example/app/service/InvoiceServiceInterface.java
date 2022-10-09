package org.example.app.service;

import org.example.app.Repository.InvoiceRepositoryInterface;
import org.example.app.entity.Invoice;

public interface InvoiceServiceInterface {

    void  createInvoice(Invoice invoice);
    void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
}
