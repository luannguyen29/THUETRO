package test;


import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class NewClass {

    public static void main(String[] arg) {
        String[] chu = {"a", "b", "c", "d", "e", "f", "g", "h", "t", "u", "o", "p", "q", "r", "y", "i", "x", "w", "1", "2", "3", "4", "5", "6",
            "7", "8", "9"};
        Random rd = new Random();   // khai bÃ¡o 1 Ä‘á»‘i tÆ°á»£ng Random

        // tráº£ vá»� 1 sá»‘ báº¥t ká»³ cÃ³ kiá»ƒu long
        long longNumber ;
        do
        {
            longNumber = rd.nextLong();
        }while(longNumber<0);
        System.out.println("Sá»‘ vá»«a Ä‘Æ°á»£c sinh ra lÃ  " + longNumber);
        
    }

}
