package org.Posts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.zip.DataFormatException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Date agora = new Date();
        SimpleDateFormat dt = new SimpleDateFormat("dd/mm/yyy HH:mm:ss");


        Post p1 =  new Post(dt.parse(String.valueOf(agora)) , "Traveling to New Zealand", "i´m going to visist...", 12);
        p1.addComment(new Comment("Have a nice trip!"));
        p1.addComment(new Comment( "Wow thats awesome"));

        System.out.println(p1.toString());

    }
}
