package goit.gojava2.javacore.module3.files;

public class TextFile extends File {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
