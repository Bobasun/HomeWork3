package com.brainacad.lab5.fileslist;

import java.io.File;
import java.util.HashMap;


public interface IFilesOnDirectory {
    void addFilestoHashMap();
    String getPath();
    HashMap<Integer,File> getHashMap();


}
