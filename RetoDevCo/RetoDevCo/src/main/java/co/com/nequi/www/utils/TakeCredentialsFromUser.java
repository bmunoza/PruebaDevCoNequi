package co.com.nequi.www.utils;

public class TakeCredentialsFromUser {



    private static String user;
    private static String password;

    private TakeCredentialsFromUser() {
    }

    public static void takeCredentialsFromUser(){
        user = System.getProperty("US");
        password = System.getProperty("CO");
    }

    public static String userInformation(){
        return user;
    }

    public static String passwordInformation(){
        return password;
    }



}
