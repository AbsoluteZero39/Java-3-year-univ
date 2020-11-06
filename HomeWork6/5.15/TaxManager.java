package com.company;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaxManager {
    private double mainJobSalary;
    private double additionalJobSalary;
    private double reward;
    private double propertySale;
    private double giftMoney ;
    private double giftProperty;
    private int kidsCount;
    private double help = 0;
    private final double kidsDiscount = 0.1;
    private double incomeTax = 0.2;
    private double propertyTax = 0.15;
    private  double giftsTax = 0.05;
    private Tax[] taxes;

    public TaxManager(double mainJobSalary,double additionalJobSalary, double reward,double propertySale,double giftMoney,double giftProperty,int kidsCount,double help){
        this.mainJobSalary =mainJobSalary;
        this.additionalJobSalary = additionalJobSalary;
        this.reward = reward;
        this.propertySale = propertySale;
        this.giftMoney = giftMoney;
        this.giftProperty = giftProperty;
        this.kidsCount = kidsCount;
        this.help = help;
    }
    public double countTotalTax(){
        List<Tax> taxes = new ArrayList<Tax>();
        double incomeTax = (this.mainJobSalary+this.additionalJobSalary)*this.incomeTax;
        taxes.add(new Tax(incomeTax,"Income tax"));
        double propertyTax = (this.propertySale+this.giftProperty)*this.propertyTax;
        taxes.add(new Tax(propertyTax,"Property tax"));
        double giftsTax = (this.giftMoney+this.reward)*this.giftsTax;
        taxes.add(new Tax(giftsTax,"Gifts tax"));
        double taxToPay = incomeTax + propertyTax +giftsTax;
        double taxWithDiscount = taxToPay - taxToPay*this.kidsCount*this.kidsDiscount - help;
        Tax[] arr = new Tax[taxes.size()];
        this.taxes = taxes.toArray(arr);
        return taxWithDiscount;
    }
    public void outputTaxesInOrder(){
        if(this.taxes.length>0){
            Arrays.sort(this.taxes,Tax::compareTo);
            for(Tax tax:this.taxes){
                out.println("Tax name: "+tax.getTaxName()+ "; tax sum: "+tax.getAmount());
            }
        }
    }

}
