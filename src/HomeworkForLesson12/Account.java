package HomeworkForLesson12;

import java.util.Objects;

public class Account {
    private int accountNumber;
    private String clientName;

    protected Account(int num, String name){
        accountNumber = num;
        clientName = name;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountNumber == account.accountNumber && Objects.equals(clientName, account.clientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, clientName);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", clientName='" + clientName + '\'' +
                '}';
    }
}

