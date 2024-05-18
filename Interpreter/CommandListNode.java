package Interpreter;

import java.text.ParseException;
import java.util.ArrayList;

public class CommandListNode {
    private ArrayList list = new ArrayList();

    public void parse(Context context) throws ParseException {
        while (true) {
            if (context.currentToken() == null) {
                throw new ParseException("Missing 'end'");
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
                break;
            } else {
                Node commandNode = new CommandNode();
                CommandNode.parse(context);
                list.add(commandNode);
            }
        }
    }
    
    public String toString() {
        return list.toString();
    }
    
}
