package learning.interview.pramati;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;

public class WhichSweetShouldIBring {

    // Complete the whichSweetShouldIBring function below.
    static String whichSweetShouldIBring(List<String> votes) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        AbstractMap.SimpleEntry<String, Integer> max = new AbstractMap.SimpleEntry<>("", 0);
        for (String vote : votes) {
            if (treeMap.containsKey(vote)) {
                Integer noOfVotes = treeMap.get(vote) + 1;
                if ((noOfVotes.equals(max.getValue()) && vote.compareTo(max.getKey()) > 0) || noOfVotes > max.getValue()) {
                    max = new AbstractMap.SimpleEntry<>(vote, noOfVotes);
                }
                treeMap.put(vote, noOfVotes);
            } else {
                treeMap.put(vote, 1);
            }
        }
        return max.getKey();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int votesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> votes = new ArrayList<>();

        IntStream.range(0, votesCount).forEach(i -> {
            try {
                votes.add(bufferedReader.readLine());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        String res = whichSweetShouldIBring(votes);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
