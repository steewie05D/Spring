package org.example.app.Repository;

import org.example.app.entity.Invoice;

public class InvoiceRepositoryDataBase implements InvoiceRepositoryInterface {

    public void create (Invoice invoice) {
        /*(...)
        PrepareStatement pstmt=connexion.prepareStatement("Insert into FACTURE (NUMBER,CUSTOMERNAME) VALUES(?,?)");
            pstmt.excuteUpdate();
         */
        System.out.println(("DataBase: Invoice added withe number "+invoice.getNumber()+" for "+invoice.getCustomerName()));
    }

}
