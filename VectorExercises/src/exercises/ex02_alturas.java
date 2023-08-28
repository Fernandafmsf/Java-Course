package exercises;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.

public class ex02_alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas:");
        int totalPessoas = sc.nextInt();

        String[] nome = new String[totalPessoas];
        int[] idade = new int[totalPessoas];
        double[] altura = new double[totalPessoas];

        double alturaTotal=0;
        double mediaAltura =0;
        int totalMenor=0;
        double porcentagemMenor=0;

        for(int i=0; i<altura.length;i++){
            System.out.println("Dados da "+(i+1)+" pessoa:");
            System.out.print("Nome:");
            nome[i]=sc.next();
            System.out.print("Idade:");
            idade[i]=sc.nextInt();
            System.out.print("Altura:");
            altura[i]=sc.nextDouble();

            alturaTotal+=altura[i];

            if(idade[i]<16) {
                totalMenor += 1;
            }
        }
        mediaAltura=alturaTotal/totalPessoas;
        System.out.printf("Altura Media: %.2f ",mediaAltura);

        //necessario fazer casting
        porcentagemMenor= ((double) totalMenor*100)/totalPessoas;
        System.out.print("\nPessoas com menos de 16: "+porcentagemMenor+ "%");


        for(int i=0;i<idade.length;i++){
            if(idade[i]<16) {
                System.out.println(nome[i]);
            }

        }

        sc.close();
    }
}
