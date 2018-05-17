package com.brainacad.lab4;

import com.brainacad.lab4.console.IUIPath;
import com.brainacad.lab4.console.UserInputPath;

import com.brainacad.lab4.fileslist.FilesOnDirectory;
import com.brainacad.lab4.fileslist.IFilesOnDirectory;


public class Main {

    public static void main(String[] args) {

        while (true) {

            IUIPath userInput = new UserInputPath();
//            userInput.getPathFromUser();
//            FilenameFilter mask = new FileNameMask(userInput.getMask());
            IFilesOnDirectory list =  new FilesOnDirectory(userInput.getPath());

                list.addFilesOnListWithMask(userInput.getMask());
                list.showListOfFiles();

            if (list.getPath()!=null ){
                break;
            }
            System.out.println("Oops, may be you wrote incorrect path.\nTry again");
        }
    }
}