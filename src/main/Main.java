package main;

import main.models.Bank;
import main.models.Client;
import main.models.Company;
import main.models.Resident;
import main.models.Restaurant;
import main.models.School;
import main.models.StatueLiberty;

import java.util.ArrayList;

//https://www.youtube.com/watch?v=UQP5XqMqtqQ
public class Main {
    public static void main(String[] args) {

        ArrayList<Client> clients = new ArrayList<>();
        clients.add(new Bank());
        clients.add(new Company());
        clients.add(new Resident());
        clients.add(new Restaurant());
        clients.add(new School());
        clients.add(new StatueLiberty());

        MessagingVisitor visitor = new MessagingVisitor();
        visitor.sendMessage(clients);

//        for (Client client : clients) {
//            if (client instanceof Bank) visitor.visitBank((Bank) client);
//            else if (client instanceof Company) visitor.visitCompany((Company) client);
//            else if (client instanceof Restaurant) visitor.visitRestaurant((Restaurant) client);
//            else if (client instanceof Resident) visitor.visitResident((Resident) client);
//        }

//        for (Client client : clients) {
//            client.accept(visitor);
//        }
    }
}
