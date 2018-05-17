package com.brainacad.lab4.fileslist;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

public class FilesOnDirectory implements IFilesOnDirectory {


    private String path;
    private List<File> list;

    public FilesOnDirectory(String path) {
        list = new ArrayList<>();
        this.path = path;
    }


    @Override
    public void addFilesOnListWithMask(String mask) {
        File folder = new File(path);
        if (folder.isDirectory()) {

            for (File file : folder.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.contains(mask);
                }
            })) {
                if (file.isFile()) {
                    list.add(file);
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
    public void showListOfFiles(){
        for (File file: list) {
            System.out.println(file);
        }
        if (list.isEmpty()) System.out.println("No files in directory!");
    }

}


