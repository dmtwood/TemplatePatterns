package com.dimidev.templatepattern.conversion;

public class ConversionApp {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FileConversionTemplate convertor = new ConvertAviToMpg();
        convertor.convertFile();

        System.out.println();

        convertor = new ConvertCsvToXls();
        convertor.convertFile();

        System.out.println();

        convertor = new ConvertWavToMP3();
        convertor.convertFile();
    }
}
