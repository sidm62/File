package org.example;

public class Main {
    public static void main(String[] args) {

        Directory run = new Directory("run");

        File file1 = new File("o.pdf", 2.5);
        File file2 = new File("word.jpg", 0.5);
        run.addElement(file1);
        run.addElement(file2);

        Directory run2 = new Directory("run2");
        File file3 = new File("photo.jpg", 5.5);
        File file4 = new File("photo.pdf", 6.5);

        run2.addElement(file3);
        run2.addElement(file4);

        run.addElement(run2);

        SizeCalculatorVisitor visitor = new SizeCalculatorVisitor();
        run.accept(visitor);

        System.out.println("Total File size: " +  visitor.getTotalSizeMB() +"Mb");

        SearchVisitor pisitor = new SearchVisitor("pdf");
        run.accept(pisitor);
        System.out.println(".pdf:");
        for (File f : pisitor.getMatchedFiles()) {
            System.out.println("File: "+ f.getName() + " File Size: " + f.getSizeMB() );
        }
    }
}