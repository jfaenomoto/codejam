import java.util.Scanner;

// https://code.google.com/codejam/contest/6224486/dashboard#s=p0
public class StandingOvation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 1; i <= t; i++) {
            int smax = scanner.nextInt();
            String crowd = scanner.next();
            int peopleApplauding = 0;
            int friendsToInvite = 0;
            for (int shynessLevel = 0; shynessLevel < crowd.length(); shynessLevel++) {
                int peopleApplaudingOnShynessLevel = crowd.charAt(shynessLevel) - '0';
                if (peopleApplauding < shynessLevel) {
                    friendsToInvite++;
                    peopleApplauding++;
                }
                peopleApplauding += peopleApplaudingOnShynessLevel;
            }
            System.out.println("Case #" + (i) + ": " + friendsToInvite);
        }
    }
}
