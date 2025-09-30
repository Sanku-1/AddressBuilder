package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        System.out.println("Please provide the following information:");
        Scanner addressScanner = new Scanner(System.in);
        StringBuilder billingAddress = new StringBuilder();
        System.out.println("Full name:");
        billingAddress.append(addressScanner.nextLine()).append("\n").append("\n");
        System.out.println("Billing Street:");
        billingAddress.append("Billing address: \n").append(addressScanner.nextLine()).append("\n");
        System.out.println("Billing City:");
        billingAddress.append(addressScanner.nextLine()).append(", ");
        System.out.println("Billing State:");
        billingAddress.append(addressScanner.nextLine()).append(" ");
        System.out.println("Billing Zip:");
        billingAddress.append(addressScanner.nextLine()).append("\n");
        System.out.println("Shipping Street:");
        billingAddress.append("Shipping address: \n").append(addressScanner.nextLine()).append("\n");
        System.out.println("Shipping City:");
        billingAddress.append(addressScanner.nextLine());
        System.out.println("Shipping State:");
        billingAddress.append(addressScanner.nextLine());
        System.out.println("Shipping Zip:");
        billingAddress.append(addressScanner.nextLine());

        String addressInformation = billingAddress.toString();
        System.out.println(addressInformation);



    }
}
