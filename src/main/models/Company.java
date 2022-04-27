package main.models;

import main.Visitor;

public class Company extends Client{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
