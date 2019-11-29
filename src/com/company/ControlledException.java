package com.company;

public class ControlledException {

    public void printAndWait() throws InterruptedException {
        System.out.println("The next line in 5s");
        Thread.sleep(5000);
        System.out.println("Times fly by");
    }

    public static void main(String[] args) {
        ControlledException controlledException=new ControlledException();
        try {
            controlledException.printAndWait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
