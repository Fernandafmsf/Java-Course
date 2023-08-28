package exercises;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.
public class ex03_numerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros vai digitar:");
        int n =sc.nextInt();

        int[] vect = new int[n];
        int quantidadePares=0;

        for(int i=0; i<vect.length;i++){
            System.out.print("Digite um numero:");
            vect[i]=sc.nextInt();
        }
        System.out.println("Numeros pares:");
        for(int i=0;i<vect.length;i++){
            if(vect[i]%2==0){
                System.out.print(vect[i]+" ");
                quantidadePares+=1;
            }
        }
        System.out.print("\nQuantidade de pares: "+ quantidadePares);


        sc.close();
    }
}
