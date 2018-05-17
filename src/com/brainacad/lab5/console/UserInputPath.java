package com.brainacad.lab5.console;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class UserInputPath implements IUIPath {

    private String path,phrase;

    public UserInputPath(){
        getPathFromUser();
    }

    @Override
    public void getPathFromUser() throws NoSuchElementException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter path: ");
        path = sc.nextLine();
        System.out.println("Please, enter phrase: ");
        phrase = sc.nextLine();
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public String getPhrase() {
        return phrase;
    }


}
