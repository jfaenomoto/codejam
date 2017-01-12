import java.util.Scanner;

// https://code.google.com/codejam/contest/6254486/dashboard#s=p0
public class CountingSheep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            boolean[] seenDigit = { false, false, false, false, false, false, false, false, false, false };
            int n = scanner.nextInt();
            int originalN = n;
            int timesPassedHere = 1;
            while (true) {
                if(originalN == 0) {
                    System.out.println("Case #" + (i+1) + ": INSOMNIA");
                    break;
                }
                String nAsString = Integer.toString(n);
                for (int j = 0; j < nAsString.length(); j++) {
                    seenDigit[nAsString.charAt(j) - '0'] = true;
                }
                boolean seenAllDigits = true;
                for (int j = 0; j < seenDigit.length; j++) {
                    if (!seenDigit[j]) {
                        seenAllDigits = false;
                        break;
                    }
                }
                if (seenAllDigits) {
                    System.out.println("Case #" + (i + 1) + ": " + nAsString);
                    break;
                }
                timesPassedHere = timesPassedHere + 1;
                n = originalN * timesPassedHere;
            }

        }
    }
    
}
