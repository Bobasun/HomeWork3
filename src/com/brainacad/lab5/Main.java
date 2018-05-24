package com.brainacad.lab5;

import com.brainacad.lab5.console.IUIPath;
import com.brainacad.lab5.console.UserInputPath;
import com.brainacad.lab5.fileslist.*;

import java.io.FilenameFilter;
import java.io.IOException;


public class Main {

    public static void main(String[] args)  {
        while (true) {

            IUIPath userInput = new UserInputPath();
            IFilesOnDirectory list = new FilesOnDirectory(userInput.getPath());
            AddTextToFile attf = new AddTextToFile(list, userInput.getPhrase());

            if (!list.getHashMap().isEmpty()) {
                System.out.println("Text had been added to file.");
                break;
            }
            System.out.println("Oops, may be you wrote incorrect path.\nTry again");
        }
    }
}