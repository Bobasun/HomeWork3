package com.brainacad.lab5.fileslist;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;

public class FilesOnDirectory implements IFilesOnDirectory {

    private String mask= ".txt";
    private String path;
    private StringBuilder sb = new StringBuilder();
    private HashMap<Integer, File> hashMap;

    public FilesOnDirectory(String path) {
        this.path = path;
        hashMap = new HashMap<>();
        addFilestoHashMap();
    }


    @Override
    public void addFilestoHashMap() {
        File folder = new File(path);
        if (folder.isDirectory()) {
            int i = 0;
            for (File file : folder.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.endsWith(mask);
                }
            })) {
                if (file.isFile()) {
                    hashMap.put(i, file);
                    i++;
                }
            }
        } else {
            path = null;
        }
    }

    @Override
    public String getPath() {
        return this.path;
    }

    @Override
    public HashMap<Integer, File> getHashMap() {
        return hashMap;
    }
}


