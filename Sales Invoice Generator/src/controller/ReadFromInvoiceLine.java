package controller;
import model.invoiceline;
import model.Invoiceheader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
public class ReadFromInvoiceLine {

    public static final String delimiter = ",";

    public static ArrayList<invoiceline> invoice_Lines = new ArrayList<invoiceline>();
    static invoiceline invoice_Line1;

    public static ArrayList<invoiceline> read(String csvFile) {
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            String[] tempArr;

            while ((line = br.readLine()) != null) {
                invoiceline line2 = new invoiceline();
                tempArr = line.split(delimiter);

                int i = tempArr.length;
                invoice_Line1 = new invoiceline(Integer.parseInt(tempArr[i - 4]), tempArr[i - 3], Float.valueOf(tempArr[i - 2]), Integer.parseInt(tempArr[i - 1]));
                invoice_Lines.add(invoice_Line1);
            }
            br.close();
        } catch (java.io.IOException ioe) {
            ioe.printStackTrace();
        }
        return invoice_Lines;
    }

}
