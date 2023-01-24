package controller;
import model.invoiceline;
import model.Invoiceheader;

import java.io.*;
import java.util.ArrayList;

import static controller.ReadFromInvoiceLine.*;

public class ReadFromInvoiceHeader {

    public static void read(String csvFile) {
        try {
            String invoiceCSV = "resources/InvoiceLine.csv";
            ArrayList<invoiceline> Liness, Headerlines = new ArrayList<>();
            Liness = ReadFromInvoiceLine.read(invoiceCSV);
            Invoiceheader header = new Invoiceheader();
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] tempArr;

            while ((line = br.readLine()) != null) {

                tempArr = line.split(delimiter);
                int i = tempArr.length;

                Headerlines.clear();
                for (invoiceline l : Liness) {

                    if (Integer.parseInt(tempArr[0]) == l.getInvoiceNum()) {
                        Headerlines.add(l);
                    }
                }


                header = new Invoiceheader(Integer.parseInt(tempArr[i - 3]), tempArr[i - 2], tempArr[i - 1], Headerlines);
                header.print();
            }

            br.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
