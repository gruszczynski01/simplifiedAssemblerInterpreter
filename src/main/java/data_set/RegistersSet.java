package data_set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RegistersSet {
    private static Register eax = new Register("???");
    private static Register ebx = new Register("???");
    private static Register ecx = new Register("???");
    private static Register edx = new Register("???");
    private static HashMap<String, Register> REGISTERS = new HashMap<String, Register>();

    public static HashMap<String, Register> getREGISTERS() {
        return REGISTERS;
    }

    public RegistersSet() {
        REGISTERS.put("%eax",eax);
        REGISTERS.put("%ebx",ebx);
        REGISTERS.put("%ecx",ecx);
        REGISTERS.put("%edx",edx);
    }

}
