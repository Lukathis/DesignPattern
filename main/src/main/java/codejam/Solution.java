package codejam;

import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            BigInteger n = in.nextBigInteger();
            int l = in.nextInt();

            BigInteger[] list = new BigInteger[l];
            for (int j = 0; j < l; j++) {
                list[j] = in.nextBigInteger();
            }

            BigInteger min = list[0];
            int minIndex = 0;
            for (int j = 1; j < l - 1; j++) {
                if (min.compareTo(list[j]) > 0) {
                    min = list[j];
                    minIndex = j;
                }
            }

            TreeSet<BigInteger> resultSet = new TreeSet<>();
            BigInteger[] commonDividers = new BigInteger[l];

            BigInteger g = list[0].divide(list[0].gcd(list[1]));
            resultSet.add(g);

            for (int k = 0; k < l; k++) {
                BigInteger current = list[k];
                commonDividers[getIndex(l, minIndex + k)] = g;
                g = current.divide(g);
                if (resultSet.size() < 26) {
                    resultSet.add(g);
                }
            }

            Map<BigInteger, Integer> decipher = new HashMap<>();
            int index = 0;
            for (BigInteger bi : resultSet) {
                decipher.put(bi, index);
                index++;
            }

            System.out.print("Case #" + i + ": ");
            for (int k = 0; k < l; k++) {
                System.out.print((char)(65 + decipher.get(commonDividers[getIndex(l, minIndex + k)])));
            }
            System.out.println((char)(65 + decipher.get(g)));

        }
    }

    public static int getIndex(int length, int i) {
        if (i >= 0 && i < length) {
            return i;
        } else if (i < 0) {
            return i + length;
        }
        return i - length;
    }
}
