package com.amazonaws.lambda.demo;

public class LambdaFunctionHandler {

    public String handleRequest(String intent) {
        String output = null;
        Wolfram wolfram = new Wolfram();
        output = wolfram.compute(intent);
        return output;
    }
}
