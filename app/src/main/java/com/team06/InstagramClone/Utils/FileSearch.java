package com.team06.InstagramClone.Utils;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by isabellepotvin on 2018-03-14.
 */

public class FileSearch {


    /**
     * Search directory and return a list of all **directories** contained inside
     * @param directory
     * @return
     */
    public static ArrayList<String> getDirectoryPaths(String directory){
        ArrayList<String> pathArray = new ArrayList<>();
        File file = new File(directory);
        File[] listfiles = file.listFiles();

        for(int i = 0; i < listfiles.length; i++){
            if(listfiles[i].isDirectory()){
                pathArray.add(listfiles[i].getAbsolutePath());
            }
        }

        return pathArray; //returns a list of all the directories that are inside the directory
    }



    /**
     * Search directory and return a list of all **files** contained inside
     * @param directory
     * @return
     */
    public static ArrayList<String> getFilePaths(String directory){
        ArrayList<String> pathArray = new ArrayList<>();
        File file = new File(directory);
        File[] listfiles = file.listFiles();

        for(int i = 0; i < listfiles.length; i++){
            if(listfiles[i].isFile()){ //checking to see if it is a file
                pathArray.add(listfiles[i].getAbsolutePath());
            }
        }

        return pathArray; //returns a list of all the directories that are inside the directory
    }


}
