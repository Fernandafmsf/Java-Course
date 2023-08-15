package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

    public class Program {

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);


            System.out.println("Enter product data");
            System.out.print("Name: ");
            String name=sc.nextLine();//pega a variavel

            System.out.print("Price:");
            double price=sc.nextDouble();

            /*
            System.out.print("Quantity in stock: ");
            int quantity=sc.nextInt();
            */

            Product product = new Product(name,price){
            };

            //usando getters e setters
            product.setName("Computer");
            System.out.println("Updated product: "+product.getName());
            product.setPrice(1200);
            System.out.println("Updated price: "+product.getPrice());

            //USANDO O METODO PARA EXIBIR OS DADOS
            System.out.println(product.toString());

            System.out.println("Enter the number of products to be added in stock: ");
             int quantity = sc.nextInt();
            product.AddProduct(quantity);

            //Não é necessário usar '.toString', automaticamente se entende que esse metodo está sendo chamado
            System.out.println("Updated data: "+product);

            System.out.println("Enter the number of products to be removed from stock:");
            quantity=sc.nextInt();
            product.RemoveProducts(quantity);

            System.out.println("Updated data: "+product);

            sc.close();
        }

    }

