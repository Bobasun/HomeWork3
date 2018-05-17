package com.brainacad.lab3;

import com.brainacad.lab3.console.IUIPath;
import com.brainacad.lab3.console.UserInputPath;
import com.brainacad.lab3.fileslist.FilesOnDirectory;
import com.brainacad.lab3.fileslist.IFilesOnDirectory;


public class Main {

    public static void main(String[] args) {

        while (true) {
            System.out.println("Please enter some path:");
            IUIPath userInput = new UserInputPath();
            IFilesOnDirectory list = new FilesOnDirectory(userInput.getPathFromUser());

                list.addFilesToList();
                list.showListOfFiles();

            if (list.getPath()!=null ){
                break;
            }
            System.out.println("Oops, may be you wrote incorrect path.\nTry again");
        }
    }
}