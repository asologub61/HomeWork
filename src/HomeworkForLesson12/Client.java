package HomeworkForLesson12;

import java.util.Objects;

public class Client {
    private String clientName;
    private int clientAge;

    protected Client(String name, int age){
         clientName = name;
         clientAge = age;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return clientAge == client.clientAge && Objects.equals(clientName, client.clientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientName, clientAge);
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", clientAge=" + clientAge +
                '}';
    }
}
