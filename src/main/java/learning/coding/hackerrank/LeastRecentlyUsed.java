package learning.coding.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

import static java.lang.System.out;


class Result {

    /*
     * Complete the 'update' function below.
     *
     * The function is expected to return a STRING.
     */

    public static String update() {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            switch (input.trim().toLowerCase()) {
                case "insert": {
                    while (scanner.hasNextLine()) {
                        int element = scanner.nextInt();
                        insert(deque, element);
                    }
                }
                break;
                case "retrieve": {
                    while (scanner.hasNextLine()) {
                        int element = scanner.nextInt();
                        retrieve(deque, element);
                    }
                }
                break;
            }
        }
        String s = "";
        Iterator<Integer> iterator = deque.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            s = s + + next + ",";
        }
        return s.substring(0,s.length()-1);
    }

    private static void insert(ArrayDeque<Integer> deque, Integer element) {
        //check if the size is exceeding 5 elements if so then call removeLeastRecentlyUsed
        if (deque.contains(element)) {
            retrieve(deque, element);
        } else {
            if (deque.size() < 5) {
                deque.addLast(element);
            } else {
                removeLeastRecentlyUsed(deque);
            }
        }
    }

    private static void removeLeastRecentlyUsed(Deque<Integer> deque) {
        out.println("removed : " + deque.removeFirst());
    }

    private static boolean retrieve(Deque<Integer> deque, Integer element) {
        if (deque.contains(element)) {
            out.println("element exists in deque");
            out.println("removed : " + deque.remove(element));
            deque.addLast(element);
            out.println("added to front : " + element);
            out.println(deque);
            return true;
        } else {
            out.println("element does not exists in deque");
            return false;
        }
    }
}

public class LeastRecentlyUsed {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String result = Result.update();

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
