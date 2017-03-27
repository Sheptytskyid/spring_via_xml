package ua.goit.offline.spring;

import java.util.Collection;

public class Checker {

    private Collection<Validator> validator;

    public Checker(Collection<Validator> validators) {
        this.validator = validators;
    }

    public boolean check(String str) {
        return validator.stream().allMatch(v -> v.isValid(str));
    }
}