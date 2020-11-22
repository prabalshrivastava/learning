package learning.coding.pramati;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Shaktimaan {


    // Complete the shaktimaan function below.
    static int shaktimaan(List<Integer> power) {
        int chargeNeeded = 0;
        int maxChargeNeeded = 0;
        for (Integer integer : power) {
            if (integer >= -100 && integer <= 100) {
                if (chargeNeeded < 0 && chargeNeeded < maxChargeNeeded) {
                    maxChargeNeeded = chargeNeeded;
                }
                chargeNeeded += integer;
            }
        }
        return -(maxChargeNeeded - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int powerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> powerTemp = new ArrayList<>();

        IntStream.range(0, powerCount).forEach(i -> {
            try {
                powerTemp.add(bufferedReader.readLine().replaceAll("\\s+$", ""));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> power = powerTemp.stream()
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int res = shaktimaan(power);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
