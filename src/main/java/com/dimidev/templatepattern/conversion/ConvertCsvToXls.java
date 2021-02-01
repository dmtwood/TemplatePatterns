package com.dimidev.templatepattern.conversion;

public class ConvertCsvToXls extends FileConversionTemplate{

    @Override
    protected int estimateDestFileSize() {
        // TODO Auto-generated method stub
        return 120;
    }

    @Override
    protected void addMetaInfo() {
        // TODO Auto-generated method stub
        System.out.println("Adding Xls metadata");
    }

    @Override
    protected void convert() {
        // TODO Auto-generated method stub
        System.out.println("Converting from Csv to Xls....DONE!");
    }
}
