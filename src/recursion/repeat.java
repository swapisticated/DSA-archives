package recursion;
import java.util.Scanner;
import java.io.*;

public class repeat {
    /*package whatever //do not write package name here */


        public static void main (String[] args) {
            String s = "hello geeks";
            System.out.print(firstRepeat(s));

        }
        public static String firstRepeat(String s){

            int n = s.length();

            for(int i=0; i<n; i++){
                for(int j=0 ; j<i ;j++){
                    if(s.charAt(i)==s.charAt(j)){
                        return Character.toString(s.charAt(i));
                    }
                }
            }
            return "-1";
        }

    }
