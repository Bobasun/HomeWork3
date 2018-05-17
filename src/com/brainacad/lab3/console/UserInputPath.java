package com.brainacad.lab3.console;

import java.util.Scanner;

public class UserInputPath implements IUIPath {
private String userInput;
    @Override
    public String getPathFromUser() {
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextLine();
        return userInput;
    }
}
