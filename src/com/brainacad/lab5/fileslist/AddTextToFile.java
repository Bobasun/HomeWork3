package com.brainacad.lab5.fileslist;

import java.io.FileWriter;
import java.io.IOException;

public class AddTextToFile {

    private IFilesOnDirectory list;
    private String phrase;


    private void addTextToFile() {
        try{
        for (int i = 0; i < list.getHashMap().size(); i++) {
            FileWriter addLastLine = new FileWriter(list.getHashMap().get(i), true);
            addLastLine.write(phrase + ", path is: " + list.getHashMap().get(i).getAbsolutePath());
            addLastLine.append("\r\n");
            addLastLine.close();
        }}
        catch(IOException e){
            System.err.println("Error");
        }
    }

    public AddTextToFile(IFilesOnDirectory list, String phrase) {
        this.list = list;
        this.phrase = phrase;
        addTextToFile();
    }
}
