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

}
