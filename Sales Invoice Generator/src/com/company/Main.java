package com.company;
import controller.ReadFromInvoiceHeader;

public class Main {
    public static void main(String[] args) {
        String csvFile = "resources/InvoiceHeader.csv";
        ReadFromInvoiceHeader.read(csvFile);

    }
}
