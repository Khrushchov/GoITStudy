package goit.gojava2.javacore.module8;

import goit.gojava2.javacore.module3.files.*;

import java.util.ArrayList;
import java.util.List;

public class ListToTable {
    private List<File> files = new ArrayList<File>();

    public static void main(String[] args) {
        ListToTable list = new ListToTable();
        list.addFilesToList();
        list.listToTable();
    }

    void addFilesToList() {
        files.add(new AudioFile("audio1"));
        files.add(new ImageFile("image1"));
        files.add(new TextFile("text2"));
        files.add(new TextFile("text1"));
        files.add(new AudioFile("audio3"));
        files.add(new AudioFile("audio2"));
        files.add(new ImageFile("image2"));
        files.add(new TextFile("text3"));
        files.add(new ImageFile("image3"));
        }
    void listToTable(){
        System.out.println("============= TABLE =================");
        System.out.println("|\t№\t|" + "\t name \t|" + " type of file \t|" );
        System.out.println("=====================================");
        for (int i = 0; i < files.size() ; i++) {
            System.out.println("|\t" + i + "\t|\t" + files.get(i).getName() + "\t|\t" + files
                    .get(i)
                    .getClass().getSimpleName() + "\t|");
        }
        System.out.println("=====================================");

    }

}
