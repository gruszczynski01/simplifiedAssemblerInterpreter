package data_set;

import excepions.EmptyStackException;

import java.util.ArrayList;

public class Stack {
    private static ArrayList<String> stack = new ArrayList<String>();
    public static void pushToStack(String value) {
        stack.add(value);
    }
    public static String popFromStack() throws EmptyStackException {
        if (!stack.isEmpty()) {
            String value = stack.remove(stack.size()-1);
            System.out.println(value);
            return value;
        } else {
            throw new EmptyStackException("???");
        }
    }

}
