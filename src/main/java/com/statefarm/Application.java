package com.statefarm;

public class Application {

    public static void main(String[] args) {

        if(args.length < 1) {
            System.out.println("Please provide a name and an email.");
        }else if(args.length == 1 && args.length != 2){
            System.out.println("Please provide an email for " + args[0]);
        }else {
            System.out.println(args[0] + " <" + args[1] + ">");
        }
    }

}
