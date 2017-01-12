import java.util.Scanner;


public class ArvoreNatal {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nArvores = scanner.nextInt();
        int arvores[] = new int[nArvores];
        
        for(int i = 0; i < nArvores; i++) {
            arvores[i] = scanner.nextInt();
        }
        
        int j = 1;
        for(int tamanho : arvores) {
            System.out.println("CASE #" + j + ":");
            for(int passo=0; passo< tamanho; passo++) {
                for(int i=0; i < tamanho-passo-1; i++) {
                    System.out.print(" ");
                }
                for(int i=0; i < 1+passo*2; i++) {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            j++;
        }
        
    }

}
