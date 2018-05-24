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
    public void addFilesOnListWithMask(String maskStr) {
        File folder = new File(path);
        if (folder.isDirectory()) {

            for (File file : folder.listFiles(new FileMask(maskStr)))
             {
                if (file.isFile()) {
                    list.add(file);
                }
            }
        }
    }

    @Override
    public List<File> getList(){
        return list;
    }

}


