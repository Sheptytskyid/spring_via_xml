package ua.goit.offline.spring;

import java.util.Collection;

public class SimpleValidator implements Validator{

    private Collection<String> wrongWords;

    public boolean isValid (String str) {
        return str != null && !wrongWords.contains(str);
    }

    public void create() {
        System.out.println("Created with: " + wrongWords);
    }

    public void setWrongWords(Collection<String> wrongWords) {
        this.wrongWords = wrongWords;
    }
}
