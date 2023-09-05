import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("How many lines do you want:");
        int m = sc.nextInt();
        System.out.print("How many columns do you want:");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print("Digite um numero: ");
                matriz[i][j]=sc.nextInt();
            }
            System.out.println("Fim da "+ (i+1) + " linha");
        }

        System.out.print("Insira um numero: ");
        int x =sc.nextInt();
        for(int i=0;i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                if(matriz[i][j]==x){
                    System.out.println("Position: "+i+", " +j+": ");
                    if(j>0) {
                        System.out.println("Left: " + matriz[i][j-1]);
                    }if(i>0){
                        System.out.println("Up: "+matriz[i-1][j]);
                    }if(j<matriz[i].length-1){//entender melhor esse menos 1 depois
                        System.out.println("Right: "+matriz[i][j+1]);
                    }if(i<matriz.length-1){//quando se trata do 'i' o length tem sempre que ser só da matriz
                        System.out.println("Down: "+matriz[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}
