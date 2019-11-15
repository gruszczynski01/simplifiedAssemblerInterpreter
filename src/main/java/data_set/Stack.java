package data_set;

import java.util.ArrayList;

public class Stack {
    private static ArrayList<Integer> stack = new ArrayList<Integer>();
    public static void pushToStack(int value) {
        stack.add(value);
    }
    public static int popFromStack() {
        if (!stack.isEmpty()) {
            int value = stack.remove(stack.size()-1);
            System.out.println(value);
            return value;
        } else {
            System.out.println("ERROR - DO ZMANINY ZGODNIE Z ZALOZENIAMI");
            //TU WYJĄTEK
            return -1;
        }
    }

}
