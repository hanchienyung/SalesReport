package me.cy.demospringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class SalesReport {
    double totalAmountDue = 0;
    double salesTax = 0.0;
    String customer_number;
    String customer_name;
    String sales_amount;
    String taxCode;
    String displayString;

    @RequestMapping("/")
    public String ShowSales() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Do you want to continue?  Y/N")
        System.out.println("Enter Customer Number, Customer Name, SalesAmount, TaxCode");

        customer_number = keyboard.next();
        customer_name = keyboard.next();
        sales_amount = keyboard.next();
        taxCode = keyboard.next();

        switch (taxCode) {
            case "0":
                salesTax = 0.0;
                break;

            case "1":
                salesTax = .03;
                break;

            case "2":
                salesTax = .05;
                break;

        }

        totalAmountDue = (Double.parseDouble(sales_amount)) + (salesTax * (Double.parseDouble(sales_amount)));


        System.out.println("Customer_number " + "Customer_name " + "Sales_amount " + "Sales_tax " + "TotalAmountDue");
        System.out.println(customer_number + "  "+ customer_name + "  " + sales_amount + "  " + salesTax + "   " +totalAmountDue);


        displayString = "Customer_number " + "Customer_name " + "Sales_amount " + "Sales_tax " + "TotalAmountDue<br/>";
        displayString = displayString +  customer_number + "  "+ customer_name + "  " + sales_amount + "  " + salesTax + "   " +totalAmountDue;


        return displayString;

    }
}
