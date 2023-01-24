package model;

public class invoiceline {
    private String itemName;
    private int invoiceNum;
    private float itemPrice;
    private int count;

    public invoiceline() {
    }
    public invoiceline(int invoiceNum, String itemName, float itemPrice, int count) {
        this.itemName = itemName;
        this.invoiceNum = invoiceNum;
        this.itemPrice = itemPrice;
        this.count = count;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    @Override
    public String toString() {

        return
                getItemName() + "," + getItemPrice() + "," + getCount();

    }
}
