package org.example;


import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private final String pattern;
    private final List<File> matchedFiles = new ArrayList<>();

    public SearchVisitor(String pattern) {
        this.pattern = pattern;
    }
    public List<File> getMatchedFiles() {
        return matchedFiles;
    }


    @Override
    public void visit(File file) {
        if (file.getName().contains(pattern)) {
            matchedFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        for (FileSystemElement child :directory.getChildren()) {
            child.accept(this);
        }
    }
}
