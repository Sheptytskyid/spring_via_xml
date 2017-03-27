package ua.goit.offline.spring;

import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class TextFileValidator implements Validator {
    private Resource resource;
    private Set<String> invalidWords;

    public TextFileValidator(Resource resource) {
        this.resource = resource;
    }

    public void init() {
        invalidWords = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()))) {
            while (reader.ready()){
                invalidWords.add(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean isValid(String str) {
        return str != null && !invalidWords.contains(str);
    }
}
