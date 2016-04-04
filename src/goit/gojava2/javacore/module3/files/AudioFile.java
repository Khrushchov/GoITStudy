package goit.gojava2.javacore.module3.files;

public class AudioFile extends File {
    private String name;

    public AudioFile(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }
}
