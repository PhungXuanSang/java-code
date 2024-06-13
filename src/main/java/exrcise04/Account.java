package exrcise04;

public class Account {
    private String id  ;
    private String name;
    private int balance;

    public Account(int balance, String name, String id) {
        this.balance = balance;
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

}
