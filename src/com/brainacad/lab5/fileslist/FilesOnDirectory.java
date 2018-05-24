package com.brainacad.lab5.fileslist;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;

public class FilesOnDirectory implements IFilesOnDirectory {

//    private String mask= ".txt";
    private String path;
    private HashMap<Integer, File> hashMap;
    private final FilenameFilter mask = new FileMask(".txt");

    public FilesOnDirectory(String path) {
        this.path = path;
        hashMap = new HashMap<>();
        addFilestoHashMap();
    }

    private void addFilestoHashMap() {
        File folder = new File(path);
        if (folder.isDirectory()) {
            int i = 0;
            for (File file : folder.listFiles(mask)){
                if (file.isFile()) {
                    hashMap.put(i, file);
                    i++;
                }
            }
        }
    }

    @Override
    public HashMap<Integer, File> getHashMap() {
        return hashMap;
    }
}


