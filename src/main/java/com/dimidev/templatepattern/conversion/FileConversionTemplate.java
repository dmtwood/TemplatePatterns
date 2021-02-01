package com.dimidev.templatepattern.conversion;

public abstract class FileConversionTemplate {
    public final void convertFile() {
        selectSourceFile();
        selectTargetDir();
        int size = estimateDestFileSize();
        if (hasEnoughFreeSpace(size)) {
            addMetaInfo();
            convert();
        }
        else System.out.println("Not enough free space");
    }
    private boolean hasEnoughFreeSpace(int size) {
        // TODO Auto-generated method stub
        //compare with target directory here
        return size < 123;
    }
    private void selectSourceFile() {
        System.out.println("Enter source file:");
    }
    private void selectTargetDir() {
        System.out.println("Enter target directory:");
    }
    protected abstract int estimateDestFileSize();
    protected abstract void addMetaInfo();
    protected abstract void convert();
}
