package com.company;
import java.util.Arrays;
import static java.lang.System.out;

public class Product {
    public int id;
    public String name;
    public int UPC;
    public String creator;
    public int price;
    public int fresh_time;
    public int amount;
    public Product (int id, String name, int UPC, String creator, int price, int fresh_time, int amount)
    {
        this.id = id;
        this.name = name;
        this.UPC = UPC;
        this.creator = creator;
        this.price = price;
        this.fresh_time = fresh_time;
        this.amount = amount;
    }

    public void getid(){
        out.println(id);
    }
    public void getname(){
        out.println(name);
    }
    public void getUPC(){
        out.println(UPC);
    }
    public void getcreator(){
        out.println(creator);
    }
    public void getprice(){
        out.println(price);
    }
    public void getfresh_time(){
        out.println(fresh_time);
    }
    public void getamount(){
        out.println(amount);
    }
    public void setid(int id){
        this.id = id;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setUPC(int UPC){
        this.UPC = UPC;
    }
    public void setcreator(String creator){
        this.creator = creator;
    }
    public void setprice(int price){
        this.price = price;
    }
    public void setfresh_time(int fresh_time){
        this.fresh_time = fresh_time;
    }
    public void setamount(int amount){
        this.amount = amount;
    }
    static String idtoString (Product object){
        String word = new String();
        word = Integer.toString(object.id);
        return word;
    }
    static void ForName (Product[] arr, String name){
        int n = arr.length;
        for(int i = 0; i<n;++i){
            if (arr[i].name == name){
                out.println("ID: " + arr[i].id +"| Name: "+ arr[i].name + "| UPC: "+arr[i].UPC + "| Creator: "+arr[i].creator +"| Price: "+ arr[i].price +"$|  Time left until get spoilt: "+ arr[i].fresh_time +"| Amount: "+ arr[i].amount);
            }
        }
    }
    static void ForName_underPrice (Product[] arr, String name, int price){
        int n = arr.length;
        for(int i = 0; i<n;++i) {
            if (arr[i].name == name && arr[i].price <= price) {
                out.println("ID: " + arr[i].id +"| Name: "+ arr[i].name + "| UPC: "+arr[i].UPC + "| Creator: "+arr[i].creator +"| Price: "+ arr[i].price +"$|  Time left until get spoilt: "+ arr[i].fresh_time +"| Amount: "+ arr[i].amount);
            }
        }
    }
    static void more_days (Product arr[], int days){
        int n = arr.length;
        for(int i = 0; i<n;++i){
            if (arr[i].fresh_time > days){
                out.println("ID: " + arr[i].id +"| Name: "+ arr[i].name + "| UPC: "+arr[i].UPC + "| Creator: "+arr[i].creator +"| Price: "+ arr[i].price +"$|  Time left until get spoilt: "+ arr[i].fresh_time +"| Amount: "+ arr[i].amount);
            }
        }
    }

}
