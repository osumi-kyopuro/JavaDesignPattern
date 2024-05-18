package Interpreter;

import java.text.ParseException;

import javax.swing.text.AbstractDocument.Content;

public abstract class Node {
    public abstract void parse(Content content) throws ParseException;
}
