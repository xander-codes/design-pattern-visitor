package main;

import main.models.Bank;
import main.models.Client;
import main.models.Company;
import main.models.Resident;
import main.models.Restaurant;
import main.models.School;
import main.models.StatueLiberty;

import java.util.List;

public class MessagingVisitor implements Visitor {

    public void sendMessage(List<Client> clients) {
        for (Client client : clients) {
            client.accept(this);
        }
    }

    public void visit(Bank bank) {
        System.out.println("hello from bank...");
    }

    public void visit(Company company) {
        System.out.println("hello from company...");
    }

    public void visit(Restaurant restaurant) {
        System.out.println("hello from restaurant...");
    }

    public void visit(Resident resident) {
        System.out.println("Hello from resident...");
    }

    public void visit(School school) {
        System.out.println("Hello from school...");
    }

    public void visit(StatueLiberty statueLiberty) {
        System.out.println("Hello from THE statue...");
    }
}
