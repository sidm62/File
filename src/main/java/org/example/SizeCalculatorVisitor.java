package org.example;

public class SizeCalculatorVisitor implements FileSystemVisitor {

    private double totalSizeMB = 0.0;

    public double getTotalSizeMB() {
        return totalSizeMB;
    }

    @Override
    public void visit(File file) {
        totalSizeMB += file.getSizeMB();
    }

    @Override
    public void visit(Directory directory) {
        for (FileSystemElement child : directory.getChildren()) {
            child.accept(this);
        }
    }
}
