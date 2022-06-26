/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salesInvoiceGenerator.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author pc
 */
public class Invoice {

    private int number;
    private String date;
    private String customerName;
    private double totalAmount = 0;
    private ArrayList<InvoiceItems> items;

    public Invoice(int number, String date, String customerName) {
        this.number = number;
        this.date = date;
        this.customerName = customerName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalAmount() {
        for (InvoiceItems items : getItems()) {
            totalAmount = totalAmount + items.getItemTotal();
        }
        return totalAmount;
    }

    public ArrayList<InvoiceItems> getItems() {
        if (items == null) {
            items = new ArrayList<>();
        }
        return items;
    }

    @Override
    public String toString() {
        return "Invoice{" + "number=" + number + ", date=" + date + ", customerName=" + customerName + '}';
    }
}
