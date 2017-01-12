import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// https://code.google.com/codejam/contest/6224486/dashboard#s=p1
public class InfiniteHouseOfPancakes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 1; i <= t; i++) {
            
            int dinners = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < dinners; j++) {
                list.add(scanner.nextInt());
            }
            System.out.println("Case #" + (i) + ": "+ findOptimized(list));
        }
    }
    
    public static int findOptimized(List<Integer> list) {
        Collections.sort(list);
        if (list.get(list.size() - 1) <= 3) {
            return list.get(list.size() - 1);
        } 
        
        List<Integer> newList = new ArrayList<>(list);
        int max = newList.remove(list.size() - 1);
        float result = ((float) max) / 2;
        newList.add((int) Math.floor(result));
        newList.add((int) Math.ceil(result));
        int resultSpecial = findOptimized(newList);
        if (max == 9) {
            List<Integer> yetAnotherList = new ArrayList<>(list);
            yetAnotherList.remove(list.size() - 1);
            yetAnotherList.add(6);
            yetAnotherList.add(3);
            int anotherSpecialResult = findOptimized(yetAnotherList);
            if (anotherSpecialResult < resultSpecial) {
                resultSpecial = anotherSpecialResult;
            }
        }
        if(max > resultSpecial + 1) {
            return resultSpecial + 1;
        }else {
            return max;
        }
    }
    
}
