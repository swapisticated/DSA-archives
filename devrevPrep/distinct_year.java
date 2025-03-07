package devrevPrep;

import java.util.*;

public class distinct_year {
    static public void main(String[] args) {
        String str = "UN was established on 24-10-1945."
                + "India got freedom on 15-08-1947., new new 123-21-2233 ";

        System.out.println(year(str));
    }

    private static int year(String str) {
        String dateString = "";
        Set <String> uniqueStr = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i))){
                dateString += str.charAt(i);
            }
            if(str.charAt(i) == '-'){
                dateString = "";
            }
            if(dateString.length() == 4){
                uniqueStr.add(dateString);
                dateString = "";
            }


        }
        return uniqueStr.size();
    }
}
