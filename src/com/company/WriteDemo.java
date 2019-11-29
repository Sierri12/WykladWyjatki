package com.company;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteDemo {
    public static void main(String[] args) {
        String[] words={"Ala","ma","kota"};

        //blok try with resources
        try(PrintWriter out =new PrintWriter("E://test.txt")){
            for (String s : words)
                out.println(s);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
