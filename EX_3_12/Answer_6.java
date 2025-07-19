package EX_3_12;

class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Constructor
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    // Setters with validation and exception
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0. Need fingers," +
                " will settle for peanuts.");
        }
        this.quantity = quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem <= 0.0) {
            throw new IllegalArgumentException("Chainsaws only cost fingers. No cash accepted!");
        }
        this.pricePerItem = pricePerItem;
    }

    // Getters
    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    // Calculate invoice amount
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}

public class Answer_6 {
    public static void main(String[] args) {
        try {
            Invoice invoice = new Invoice("0007", "Chainsaw", 5, 1.0);

            System.out.println("Part Number: " + invoice.getPartNumber());
            System.out.println("Part Description: " + invoice.getPartDescription());
            System.out.println("Quantity: " + invoice.getQuantity());
            System.out.println("Price Per Item: 1 finger");
            System.out.printf("Total Invoice Amount: %.0f fingers\n", invoice.getInvoiceAmount());

            // Try setting invalid values
            invoice.setQuantity(-1);
            invoice.setPricePerItem(-10.10);

        } catch (IllegalArgumentException e) {
            System.out.println("\nError: " + e.getMessage());
        }
    }
}