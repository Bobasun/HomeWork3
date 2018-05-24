package com.brainacad.lab3.fileslist;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FilesOnDirectory implements IFilesOnDirectory {

    private String path;
    List<File> list;

    public FilesOnDirectory(String data) {
        list = new ArrayList<>();
        this.path = data;
    }

    @Override
    public List<File> addFilesToList() {
        File folder = new File(path);
        if (folder.isDirectory()) {
            for (File file : folder.listFiles()) {
                if (file.isFile()) {
                    list.add(file);
                }
            }
        }
        return list;
    }


    @Override
    public String getPath() {
        return this.path;
    }

//    @Override
//    public void showListOfFiles (){
//        for (File file : list) {
//            System.out.println(file.getAbsolutePath());
//        }
}



