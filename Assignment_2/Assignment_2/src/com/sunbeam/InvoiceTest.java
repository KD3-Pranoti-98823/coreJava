package com.sunbeam;


public class InvoiceTest {

    public static void main(String[] args) {

        Invoice invoice = new Invoice(
                "P101",
                "Keyboard",
                2,
                500.0
        );

        System.out.println("Part Number : " + invoice.getPartNumber());
        System.out.println("Part Description : " + invoice.getPartDescription());
        System.out.println("Quantity : " + invoice.getQuantity());
        System.out.println("Price Per Item : " + invoice.getPricePerItem());
        System.out.println("Invoice Amount : " + invoice.getInvoiceAmount());
    }
}
	