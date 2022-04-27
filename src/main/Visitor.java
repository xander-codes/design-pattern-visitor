package main;

import main.models.Bank;
import main.models.Company;
import main.models.Resident;
import main.models.Restaurant;
import main.models.School;
import main.models.StatueLiberty;

public interface Visitor {
    void visit(Bank bank);
    void visit(Company company);
    void visit(Restaurant restaurant);
    void visit(Resident resident);
    void visit(School school);
    void visit(StatueLiberty statueLiberty);
}
