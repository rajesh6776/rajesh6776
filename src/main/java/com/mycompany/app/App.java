package com.mycompany.app;

/**
 * Hello world! check
 */
public class App
{

    private final String message = "Hello World! For - Auto Update";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        return message;
    }

}
