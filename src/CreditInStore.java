import java.util.Scanner;

// https://code.google.com/codejam/contest/351101/dashboard#s=p0
public class CreditInStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();
        
        for(int i = 0; i < numCases; i++) {
            
            int credit = scanner.nextInt();
            int numProducts = scanner.nextInt();
            int storesPrices[] = new int[numProducts];
            
            for(int l=0 ; l < numProducts; l++) {
                storesPrices[l] = scanner.nextInt();
            }
            boolean keepGoing = true;
            for (int j = 0; (j <= numProducts && keepGoing); j++ ) {
                for ( int k = j + 1; k < numProducts; k++) {
                    if (storesPrices[j] + storesPrices[k] == credit) {
                        keepGoing = false;
                        System.out.printf("CASE #%d: %d %d\n", i+1, j+1, k+1);
                        break;
                    }
                }
            }
        }
    }
}
