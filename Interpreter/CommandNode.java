package Interpreter;

import java.text.ParseException;

public class CommandNode extends Node {
    private Node node;

    public void parse(Context context) throws ParseException {
        if (context.currentTolen().equals("repeat")) {
            node = new RepeatCommandNode();
            node.parse(context);
        } else {
            node = new PrimitiveCOmmandNode();
            node.parse(context);
        }
    }
    
    public String toString() {
        return node.toString();
    }
}
