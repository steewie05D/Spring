package org.example.app.controller;

import org.example.app.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {

    void createInvoice();
    void setInvoiceService(InvoiceServiceInterface invoiceService);

}
