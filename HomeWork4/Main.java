package com.company;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product(1,"Carrot",10131324,"Farm",5,7,300);
        product1.getname();
        product1.setprice(6);
        product1.getprice();
        String word = new String();
        word = Product.idtoString(product1);
        Product p_array[] = new Product[8];
        p_array[1] = new Product(2,"Potato",40231334,"Farm",3,30,50);
        p_array[2] = new Product(3,"Carrot",30431324,"Factory",7,10,100);
        p_array[3] = new Product(4,"Oil",51141324,"Factory",12,180,15);
        p_array[0] = product1;
        p_array[4] = new Product(5,"Carrot",30431324,"Space",100,3,5);
        p_array[5] = new Product(6,"Carrot",30121324,"MLP",50,14,500);
        p_array[6] = new Product(7,"Sugar",20434324,"Bricle Berry",7,10,1000);
        p_array[7] = new Product(8,"Carrot",12435324,"USA",25,5,100);
        Product.ForName(p_array,"Carrot");
        out.println();
        Product.ForName_underPrice(p_array,"Carrot",25);
        out.println();
        Product.more_days(p_array,15);

    }
}
