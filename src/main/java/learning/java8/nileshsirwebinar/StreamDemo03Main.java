package learning.java8.nileshsirwebinar;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Stream;

class Transaction {
    private int accId;
    private String type; // Deposit/Withdraw
    private double amount;

    public Transaction() {
        this(0, "", 0.0);
    }

    public Transaction(int accId, String type, double amount) {
        this.accId = accId;
        this.type = type;
        this.amount = amount;
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction [accId=" + accId + ", type=" + type + ", amount=" + amount + "]";
    }
}

class Account {
    private int accNo;
    private String accType; // Savings/Current
    private List<Transaction> tranList = new ArrayList<>();

    public Account() {
        this(0, "Savings");
    }

    public Account(int accNo, String accType) {
        this.accNo = accNo;
        this.accType = accType;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public List<Transaction> getTranList() {
        return tranList;
    }

    public void setTranList(List<Transaction> tranList) {
        this.tranList = tranList;
    }

    @Override
    public String toString() {
        return "Account [accNo=" + accNo + ", accType=" + accType + ", tranList=" + tranList + "]";
    }
}

public class StreamDemo03Main {
    public static void main(String[] args) {
        Map<String, String[]> friends = new LinkedHashMap<>();
        friends.put("Nilesh", new String[]{"A", "B", "C", "D"});
        friends.put("Amit", new String[]{"P", "Q", "R"});
        friends.put("Nitin", new String[]{"X", "Y"});
        friends.put("Atul", new String[]{"A", "B", "P", "Q", "X", "Y"});

//        friends.forEach((k, v) -> System.out.println(k + " -> " + Arrays.toString(v)));

        // convert map to stream and print all friends
        friends.entrySet() // Set<Entry<K=String,V=String[]>>
                .stream() // Stream<Entry<K=String,V=String[]>>
                .flatMap(stringEntry -> Stream.of(stringEntry.getValue()))
                .distinct()
//                .forEach(System.out::println)
        ;
		/*
		// print all distinct words in the file
		List<String> stopWords = Arrays.asList("", "a", "as", "an", "the", "is", "are", "of", "to");
		Path path = Paths.get("src/sunbeam.txt");
		try(Stream<String> strm2 = Files.lines(path)) {
			// ???
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		// ???
		*/

        // print all debit/credit amounts of all transactions (+ve or -ve)
        List<Account> accList = new ArrayList<>();

        Account acc1 = new Account(1, "Savings");
        acc1.getTranList().add(new Transaction(1, "Deposit", 1000.00));
        acc1.getTranList().add(new Transaction(1, "Withdraw", 500.00));
        accList.add(acc1);

        Account acc2 = new Account(2, "Savings");
        acc2.getTranList().add(new Transaction(2, "Deposit", 800.00));
        acc2.getTranList().add(new Transaction(2, "Withdraw", 500.00));
        acc2.getTranList().add(new Transaction(2, "Deposit", 700.00));
        accList.add(acc2);

        Account acc3 = new Account(3, "Savings");
        acc3.getTranList().add(new Transaction(3, "Deposit", 400.00));
        accList.add(acc3);

        accList.stream()
                .flatMap(account -> account.getTranList().stream())
                .map(transaction -> transaction.getType().equalsIgnoreCase("Deposit") ? transaction.getAmount() : -transaction.getAmount())
                .reduce(Double::sum).ifPresent(
                val -> System.out.println(val)
        );
//                .forEach(System.out::println);
    }
}