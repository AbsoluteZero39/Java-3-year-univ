package com.company;
import static java.lang.System.out;
public class Main {

    public static void main(String[] args) {
	TaxManager taxManager = new TaxManager(20000,0,0,15000,3000,50000,2,0);
	out.println(taxManager.countTotalTax());
	taxManager.outputTaxesInOrder();
    }
}
