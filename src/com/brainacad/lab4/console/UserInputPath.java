package com.brainacad.lab4.console;

import java.util.Scanner;

public class UserInputPath implements IUIPath {

    private String path,mask;

    public UserInputPath(){
        getPathFromUser();
    }

    @Override
    public void getPathFromUser() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter path:");
        path = sc.nextLine();
        System.out.print("Enter mask:");
        mask = sc.nextLine();

    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public String getMask() {
        return mask;
    }


}
