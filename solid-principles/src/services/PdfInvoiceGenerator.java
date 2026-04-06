package services;

import interfaces.InvoiceGenerator;

/**
 * SRP: This class only generates PDF invoices.
 * OCP: To support a new format (e.g., HTML invoice), create a new class
 *      implementing InvoiceGenerator — no need to modify this class.
 * LSP: Any InvoiceGenerator implementation can replace this without
 *      breaking the system.
 */
public class PdfInvoiceGenerator implements InvoiceGenerator {

    @Override
    public void generateInvoice(String fileName) {
        // Simulate generating a PDF invoice
        System.out.println("PDF Invoice generated: " + fileName);
    }
}
