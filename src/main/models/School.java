package main.models;

import main.Visitor;

public class School extends Client {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
