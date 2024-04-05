public class InvoiceTest {
    public static void main(String[] args) {
        // Create Invoice objects
        Invoice invoice1 = new Invoice("01", "David", 5, 10.99);
        Invoice invoice2 = new Invoice("02", "Veloza", -3, -7.99);

        // Display invoice information
        displayInvoice(invoice1);
        displayInvoice(invoice2);
    }

    // Method to display invoice information
    public static void displayInvoice(Invoice invoice) {
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: $" + invoice.getPricePerItem());
        System.out.println("Invoice Amount: $" + invoice.getInvoiceAmount());
        System.out.println();
    }
}
