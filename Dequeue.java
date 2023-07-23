/*Question 9: Java Dequeue

Skill Mapping: Basic

Description: Solve the HackerRank Problem given as a link below -

https://www.hackerrank.com/challenges/java-dequeue/problem
*/

import java.util.*;
public class Dequeue {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    Deque<Integer> dq = new LinkedList<>();
    HashMap<Integer, Integer> hm = new HashMap<>();
    int max = 0;
    for (int i = 0; i < n; i++) {
        int num = in.nextInt();
        if (i >= m) {
            int first = dq.removeFirst();
            hm.put(first, hm.get(first) - 1);
            if (hm.get(first) == 0)
                hm.remove(first);
        }
        dq.addLast(num);
        hm.put(num, hm.get(num) == null ? 1 : hm.get(num) + 1);
        max = Math.max(max, hm.size());
        if (max == m)
            break;
    }
    System.out.println(max);
    }
}
