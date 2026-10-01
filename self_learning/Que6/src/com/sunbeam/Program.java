package com.sunbeam;


class ECommerceException extends Exception {

    public ECommerceException(String message) {
        super(message);
    }
}


class PaymentException extends ECommerceException {

    public PaymentException(String message) {
        super(message);
    }
}


class InventoryException extends ECommerceException {

    public InventoryException(String message) {
        super(message);
    }
}


class ShippingException extends ECommerceException {

    public ShippingException(String message) {
        super(message);
    }
}

class Order {

    public void makePayment(double amount) throws PaymentException {

        if (amount <= 0) {
            throw new PaymentException("Invalid payment amount.");
        }

        System.out.println("Payment successful.");
    }

    public void checkInventory(int quantity) throws InventoryException {

        int availableQuantity = 5;

        if (quantity > availableQuantity) {
            throw new InventoryException(
                    "Insufficient inventory. Only "
                    + availableQuantity + " items available.");
        }

        System.out.println("Inventory available.");
    }

    public void shipOrder(String address) throws ShippingException {

        if (address == null || address.isEmpty()) {
            throw new ShippingException("Shipping address is missing.");
        }

        System.out.println("Order shipped to: " + address);
    }
}

public class Program {

    public static void main(String[] args) {

        Order order = new Order();

        try {

            order.makePayment(1000);

            order.checkInventory(3);

            order.shipOrder("Pune, Maharashtra");

            System.out.println("Order completed successfully.");

        }
        catch (PaymentException e) {
            System.out.println("Payment Error: " + e.getMessage());
        }
        catch (InventoryException e) {
            System.out.println("Inventory Error: " + e.getMessage());
        }
        catch (ShippingException e) {
            System.out.println("Shipping Error: " + e.getMessage());
        }
    }
}
