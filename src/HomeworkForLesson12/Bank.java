package HomeworkForLesson12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bank {

    Map <Account, Client> clientMap = new HashMap<>();
    Map<Client, ArrayList<Account>> accountMap = new HashMap<>();

    public static void main(String[] args) {

        Bank bank = new Bank();
        Account ivanovAcc = new Account(334455, "Иван Иванов");
        Account petrovAcc = new Account(445566, "Петр Петров");
        Account petrovAcc2 = new Account(556677, "Петр Петров");
        Account smirnovAcc = new Account(667788, "Олег Смирнов");

        Client ivanov = new Client("Иван Иванов", 21);
        Client petrov = new Client("Петр Петров", 32);
        Client smirnov = new Client("Олег Смирнов", 16);

        bank.addToAccountMap();
        bank.addToClientMap();

        System.out.println(bank.clientMap);
        System.out.println(bank.getClient(ivanovAcc));
        System.out.println("==============================");
        System.out.println(bank.accountMap);
        System.out.println(bank.getAccount(petrov));
        System.out.println();
        }

        public   Object getClient(Account account){

        return clientMap.get(account);
        }

        public ArrayList<Account> getAccount (Client client){

            return accountMap.get(client);
        }

//    Map <Account, Client> clientMap
//    Map <Client, ArrayList<Account>> clientMap
//    Map <Client, ArrayList<Account>> clientMap
//    ArrayList<Client> list
        public  void addToClientMap() {
            Client ivanov = new Client("Иван Иванов", 21);
            Client petrov = new Client("Петр Петров", 32);
            Client smirnov = new Client("Олег Смирнов", 16);

            Account ivanovAcc = new Account(334455, "Иван Иванов");
            Account petrovAcc = new Account(445566, "Петр Петров");
            Account petrovAcc2 = new Account(556677, "Петр Петров");
            Account smirnovAcc = new Account(667788, "Олег Смирнов");

            clientMap.put(ivanovAcc, ivanov);
            clientMap.put(petrovAcc, petrov);
            clientMap.put(petrovAcc2, petrov);
            clientMap.put(smirnovAcc, smirnov);
        }

        public void addToAccountMap(){
            Client ivanov = new Client("Иван Иванов", 21);
            Client petrov = new Client("Петр Петров", 32);
            Client smirnov = new Client("Олег Смирнов", 16);

            Account ivanovAcc = new Account(334455, "Иван Иванов");
            Account petrovAcc = new Account(445566, "Петр Петров");
            Account petrovAcc2 = new Account(556677, "Петр Петров");
            Account smirnovAcc = new Account(667788, "Олег Смирнов");

            ArrayList<Account> listAccIvanov = new ArrayList<>();
            ArrayList<Account> listAccPetrov = new ArrayList<>();
            ArrayList<Account> listAccSmirnov = new ArrayList<>();

            listAccIvanov.add(ivanovAcc);
            listAccPetrov.add(petrovAcc);
            listAccPetrov.add(petrovAcc2);
            listAccSmirnov.add(smirnovAcc);

            accountMap.put(ivanov, listAccIvanov);
            accountMap.put(petrov, listAccPetrov);
            accountMap.put(smirnov, listAccSmirnov);

        }

        }

