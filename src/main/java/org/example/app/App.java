package org.example.app;
import org.example.app.Repository.InvoiceRepositoryInterface;
import org.example.app.controller.InvoiceControllerInterface;
import org.example.app.service.InvoiceServiceInterface;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
      /*  System.out.println("what is customer name!");
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);

       */
        Scanner sc = new Scanner(System.in);
        System.out.println("quels est la classe de controller  ? ");
        String controllerClass = sc.nextLine();
        System.out.println("quels est la classe de services ? ");
        String serviceClass = sc.nextLine();
        System.out.println("quels est la classe repository ?");
        String repositoryClass = sc.nextLine();

        InvoiceControllerInterface invoiceController=null;
        InvoiceServiceInterface invoiceService=null;
        InvoiceRepositoryInterface invoiceRepository=null;
try {
    invoiceController = (InvoiceControllerInterface) Class.forName(controllerClass).getDeclaredConstructor().newInstance();
    invoiceService = (InvoiceServiceInterface) Class.forName(serviceClass).getDeclaredConstructor().newInstance();
    invoiceRepository = (InvoiceRepositoryInterface) Class.forName(repositoryClass).getDeclaredConstructor().newInstance();
}
catch (Exception e){
    e.printStackTrace();
}
/*
        switch(controllerType){
            case "keybord":
                invoiceController = new InvoiceControllerKeyboard();
                break;
            case "web":
                invoiceController = new InvoiceControllerWeb();
                break;
            case "Douchette":
                invoiceController = new InvoiceControllerDouchette();
                break;
        }

        InvoiceServiceInterface invoiceService=null;
        switch (serviceType){
            case "number" :
                invoiceService = new InvoiceServiceNumber();
                break;
            case "prefix":
                invoiceService=new InvoiceServicePrefix();

        }
        InvoiceRepositoryInterface invoiceRepository=null;
        switch(repositoryType){
            case "memory" :
                invoiceRepository =new InvoiceRepositoryMemory();
                break;
            case "database" :
                invoiceRepository = new InvoiceRepositoryDataBase();

        }

 */
        invoiceController.setInvoiceService((invoiceService));
        invoiceService.setInvoiceRepository(invoiceRepository);

        invoiceController.createInvoice();

    }
}