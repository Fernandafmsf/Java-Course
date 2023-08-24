package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);
        System.out.println("How many products do you want to inform:");
        int n = sc.nextInt();

        //criando um vetor do tipo produto
        Product[] vect=new Product[n];
        double totalPrice=0;

        for(int i=0;i< vect.length;i++){
            System.out.print("Product name:");
            String name = sc.next();
            System.out.print("Product price: ");
            double price= sc.nextDouble();
            //pegando cada item do vetor e armazenando um objeto
            vect[i]=new Product(name,price);
            totalPrice = totalPrice + vect[i].getPrice();
        }
        double averagePrice = totalPrice/vect.length;
        System.out.println("Average price: "+averagePrice);

        sc.close();
    }
}