package data_set;

import excepions.UnknownValueException;

public class Register {
    private String value;

    public String getValue() throws UnknownValueException {
        if (value == "???") {
            throw new UnknownValueException("???");
        }
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Register(String value) {
        this.value = value;
    }
}
