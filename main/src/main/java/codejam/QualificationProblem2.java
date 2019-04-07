package codejam;

import java.util.*;
import java.io.*;

public class QualificationProblem2 {
     public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = Integer.parseInt(in.nextLine()); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            int n = Integer.parseInt(in.nextLine());
            String m = in.nextLine();
            StringBuilder sb = new StringBuilder();

            for (int index = 0; index < 2 * n - 2; index++) {
                if ('S' == m.charAt(index)) {
                    sb.append("E");
                } else {
                    sb.append("S");
                }
            }
            System.out.println("Case #" + i + ": " + sb.toString());
        }
    }

}
