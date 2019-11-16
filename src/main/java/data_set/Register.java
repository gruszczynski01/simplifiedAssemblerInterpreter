package data_set;

public class Register {
    private String value;

    public String getValue() throws Exception {
        if (value == "???") {
            throw new Exception("???");
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
