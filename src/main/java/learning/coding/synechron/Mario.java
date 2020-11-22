package learning.coding.synechron;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class Mario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        List<List<Integer>> input = new LinkedList<>();
        for (int i = 0; i < testCases; i++) {
            int numOfBlocks = scanner.nextInt();
            LinkedList<Integer> blocks = new LinkedList<>();
            for (int j = 0; j < numOfBlocks; j++) {
                blocks.add(scanner.nextInt());
            }
            input.add(blocks);
        }
//        out.println(input);
//        out.println("");
//        out.println("");
        for (List<Integer> list : input) {
            List<List<Integer>> possibleListOfPaths = getPossibleListOfPaths(list);
            int max = 0;
            for (List<Integer> possibleListOfPath : possibleListOfPaths) {
                if (possibleListOfPath.size()>max)
                    max = possibleListOfPath.size();
            }

            out.println(max-1);
        }
    }

    public static List<List<Integer>> getPossibleListOfPaths(List<Integer> blocks) {
        List<List<Integer>> possiblePaths = new LinkedList<>();
        for (int i = 0; i < blocks.size(); i++) {
            for (int k = 0; k <= blocks.size(); k++) {
                LinkedList<Integer> currentPath = new LinkedList<>();
                for (int j = k; j <= i; j++) {
                    currentPath.add(blocks.get(j));
                }
                possiblePaths.add(currentPath);
            }
        }
//        out.println(possiblePaths);
        return possiblePaths;
    }
}