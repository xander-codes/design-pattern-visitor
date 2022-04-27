package main.models;

import main.Visitor;

public class StatueLiberty extends Client {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
