package com.dimidev.templatepattern.conversion;

public class ConvertWavToMP3 extends FileConversionTemplate {
    @Override
    protected int estimateDestFileSize() {
        // TODO Auto-generated method stub
        return 1234;
    }
    @Override
    protected void addMetaInfo() {
        // TODO Auto-generated method stub
        System.out.println("Adding MP3 Tag info");
    }
    @Override
    protected void convert() {
        // TODO Auto-generated method stub
        System.out.println("Converting Wav to MP3....done!");
    }
}
