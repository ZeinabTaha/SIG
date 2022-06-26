/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salseInvoiceGenerator.controller;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import salesInvoiceGenerator.model.Invoice;
import salesInvoiceGenerator.model.InvoiceItems;
import salesInvoiceGenerator.view.InvoiceFram;

/**
 *
 * @author pc
 */
public class ActionHandler implements ActionListener {

    private InvoiceFram invoiceFrame;

    public ActionHandler(InvoiceFram invoiceFrame) {
        this.invoiceFrame = invoiceFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println("Action Handling called");
    }

    }
