package ua.goit.offline.spring;

import java.util.regex.Pattern;

public class RegexpValidator implements Validator {

    private String value;
    private Pattern pattern;

    public void compile() {
        pattern = pattern.compile(value);
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isValid(String str) {
        return !pattern.matcher(str).matches();
    }
}
