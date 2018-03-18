package com.team06.InstagramClone.Utils;

/**
 * Created by isabellepotvin on 2018-03-07.
 */

public class StringManipulation {

    public static String expandUsername(String username){
        return username.replace(".", " ");
    }

    public static String condenseUsername(String username){
        return username.replace(" ", ".");
    }

    public static String getTags(String string){

        if(string.indexOf("#") > 0){ //if there are tags

            StringBuilder sb = new StringBuilder();
            char[] charArray = string.toCharArray();
            boolean foundWord = false;

            for( char c : charArray){ //iterate through the char array looking for tags
                if(c == '#'){
                    foundWord = true;
                    sb.append(c);
                }else{
                    if(foundWord){
                        sb.append(c);
                    }
                }

                if(c == ' '){
                    foundWord = false;
                }
            }

            String s = sb.toString().replace(" ", "").replace("#", ",#");
            return s.substring(1, s.length());
        }

        return string; //returns nothing if there are no tags
    }

    /*
    In -> some description #tag1 # tag2 #othertag
    Out -> #tag1,#tag2,#tag3
     */

}
