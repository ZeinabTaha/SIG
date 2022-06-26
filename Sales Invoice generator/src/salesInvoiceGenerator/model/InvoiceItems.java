/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salesInvoiceGenerator.model;

/**
 *
 * @author pc
 */
public class InvoiceItems {

    private Invoice invoiceNumber;
    private String itemName;
    private double itemPrice;
    private int count;
    private double itemTotal;

    public InvoiceItems(Invoice invoiceNumber, String itemName, double itemPrice, int count) {
        this.invoiceNumber = invoiceNumber;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Invoice getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Invoice invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getItemTotal() {
        itemTotal = count * itemPrice;
        return itemTotal;
    }

    @Override
    public String toString() {
        return "InvoiceItems{" + "itemName=" + itemName + ", itemPrice=" + itemPrice + ", count=" + count + '}';
    }

    

}
