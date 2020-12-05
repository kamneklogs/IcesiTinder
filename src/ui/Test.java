package ui;

import java.io.File;

public class Test {

    public static void main(String[] args) {
        File f = new File("docs/test.txt");

        System.out.println(f.exists());

    }

}
