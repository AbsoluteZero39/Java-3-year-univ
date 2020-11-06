package com.company;

public class Tax implements Comparable<Tax> {
    private double amount;
    private String taxName;
    public Tax(double amount,String taxName){
        this.amount = amount;
        this.taxName = taxName;
    }
    public double getAmount() {
        return amount;
    }
    public String getTaxName() {
        return taxName;
    }
    @Override
    public int compareTo(Tax o) {
        if(this.amount<o.amount)
            return -1;
        else if(o.amount<this.amount)
            return 1;
        return 0;
    }
}
