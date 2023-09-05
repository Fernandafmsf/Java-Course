import java.util.Locale;
import java.util.Scanner;

//Construa uma função que calcule a média dos itens de uma Array e retorne esse valor. Depois, construa outra função que verfique quantos alunos estão acima da media de idades e retorne isso.
public class Main {

    public static double media(double[] notas){
        double acumularNotas=0;
        for (int i=0;i<notas.length;i++){
            acumularNotas+=notas[i];
        }
        return acumularNotas/notas.length;
    }


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa de medias ");
        System.out.print("Quantas notas irá informar:");
        int quantidade=sc.nextInt();
        double[] notasPassadas = new double[quantidade];

        for(int i=0; i<notasPassadas.length;i++){
            System.out.print("Informe a nota:");
            notasPassadas[i]=sc.nextDouble();
        }

        System.out.println("Media:"+media(notasPassadas));

        sc.close();
    }
}