package main.models;

import main.Visitor;

public class Bank extends Client {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
