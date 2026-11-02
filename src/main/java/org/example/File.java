package org.example;

public class File implements FileSystemElement {

    private final String name;
    private final double sizeMB;

    public File(String name, double sizeMB) {
        this.name = name;
        this.sizeMB = sizeMB;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getSizeMB() {
        return sizeMB;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);

    }
}
