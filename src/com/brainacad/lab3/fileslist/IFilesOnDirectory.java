package com.brainacad.lab3.fileslist;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public interface IFilesOnDirectory {
    List<File> addFilesToList();
    String getPath();
//    void showListOfFiles ();
}
