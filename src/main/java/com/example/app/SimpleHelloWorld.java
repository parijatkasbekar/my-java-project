package com.example.app;

import static spark.Spark.*;

public class SimpleHelloWorld {
    public static void main(String[] args) {
        port(8080);
        get("/", (req, res) -> "Hello World, secured with HTTPS!");
    }
}