package codejam;

import java.util.*;
import java.io.*;

public class QualificationProblem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = Integer.parseInt(in.nextLine()); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            String m = in.nextLine();
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            for (int index = 0; index < m.length(); index++) {
                if ('4' != m.charAt(index)) {
                   sb1.append(m.charAt(index));
                   if (sb2.length() != 0) {
                       sb2.append(0);
                   }
                } else {
                    sb1.append("2");
                    sb2.append("2");
                }
            }
            System.out.println("Case #" + i + ": " + sb1.toString() + " " + sb2.toString());
        }
    }

}
