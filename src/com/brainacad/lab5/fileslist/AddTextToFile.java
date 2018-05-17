package com.brainacad.lab5.fileslist;

import java.io.FileWriter;
import java.io.IOException;

public class AddTextToFile implements IAddTextToFile {

    private IFilesOnDirectory list;
    private String phrase;

    @Override
    public void addTextToFile() throws IOException {

        for (int i = 0; i < list.getHashMap().size(); i++) {
            FileWriter addLastLine = new FileWriter(list.getHashMap().get(i),true);
            addLastLine.write( phrase + ", path is: " + list.getHashMap().get(i).getAbsolutePath());
            addLastLine.append("\r\n");
            addLastLine.close();
        }
    }

    public AddTextToFile(IFilesOnDirectory list, String phrase) throws IOException {
        this.list = list;
        this.phrase = phrase;
        addTextToFile();
    }
}
