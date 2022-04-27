package main.models;

import main.Visitor;

public abstract class Client {
    public String name, address, number;

    public abstract void accept(Visitor visitor);
}
