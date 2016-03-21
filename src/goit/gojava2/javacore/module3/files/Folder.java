package goit.gojava2.javacore.module3.files;

import java.util.List;

public class Folder {
    private List<File> files;


    private static void throwExc() {
        try{
            throw new Exception();
        } catch(Exception e){
            e.getMessage();
        }

    }
}
