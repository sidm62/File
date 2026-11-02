package org.example;

interface FileSystemElement {
   String getName();
   void accept(FileSystemVisitor visitor);
}
