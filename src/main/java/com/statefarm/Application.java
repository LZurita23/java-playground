package com.statefarm;

public class Application {
    public static void main(String[] args) {
        String name = args[0];
        String email = args[1];



        if(args[0].equals("") && args[1].equals("")) {
            System.out.println("Please provide a name and an email.");
        }else if (args[0].equals("")) {
            System.out.println("Please provide a name.");
        }else if (args[1].equals("")){
            System.out.println("Please provide an email.");
        }else {
            System.out.println(args[0] + " <" + args[1] + ">");
        }
    }

}
