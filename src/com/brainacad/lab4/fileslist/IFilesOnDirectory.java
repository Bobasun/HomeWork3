package com.brainacad.lab4.fileslist;

import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

public interface IFilesOnDirectory {
    void addFilesOnListWithMask(String mask);
    public List<File> getList();


}
