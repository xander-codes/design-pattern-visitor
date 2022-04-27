package main.models;

import main.Visitor;

public class Restaurant extends Client {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
