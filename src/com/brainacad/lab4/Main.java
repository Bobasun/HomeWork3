package com.brainacad.lab4;

import com.brainacad.lab4.console.IUIPath;
import com.brainacad.lab4.console.UserInputPath;

import com.brainacad.lab4.fileslist.FilesOnDirectory;
import com.brainacad.lab4.fileslist.IFilesOnDirectory;


public class Main {

    public static void main(String[] args) {

        while (true) {

            IUIPath userInput = new UserInputPath();
            IFilesOnDirectory list =  new FilesOnDirectory(userInput.getPath());

                list.addFilesOnListWithMask(userInput.getMask());

            if (!list.getList().isEmpty() ){
                System.out.println(list.getList());
                break;
            } else {
                System.out.println("No files in dir");
            }
            System.out.println("Oops, may be you wrote incorrect path.\nTry again");
        }
    }
}