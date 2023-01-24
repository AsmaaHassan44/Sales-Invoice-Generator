package model;
import java.util.ArrayList;
public class Invoiceheader {
    private int invoiceNum;
    private String invoiceDate, invoiceDate1;
    private String customerName;
    ArrayList<invoiceline> InvoiceLines = new ArrayList<invoiceline>();


    public Invoiceheader() {
    }

    public ArrayList<invoiceline> getInvoiceLines() {
        for (invoiceline invoiceLine11 : InvoiceLines) {
            invoiceLine11.toString();
        }
        return InvoiceLines;
    }

    public void setInvoiceLines(ArrayList<invoiceline> invoice_Lines) {
        InvoiceLines = invoice_Lines;
    }
    public Invoiceheader(int invoiceNum, String invoiceDate, String customerName, ArrayList<invoiceline> invoice_Lines) {
        this.invoiceNum = invoiceNum;
        this.invoiceDate = invoiceDate;
        this.customerName = customerName;
        InvoiceLines = invoice_Lines;
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getInvoiceDate() {

        return invoiceDate = invoiceDate.replace("-", "/");
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void print() {
        System.out.println("Invoice" + getInvoiceNum() + "Num");
        System.out.println("{");
        System.out.println("Invoice" + getInvoiceNum() + "Date (" + getInvoiceDate().toString() + ")," + getCustomerName());
        for (invoiceline line : InvoiceLines) {
            System.out.println(line);
        }
        System.out.println("}");

    }
}
