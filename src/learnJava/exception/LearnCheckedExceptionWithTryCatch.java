package learnJava.exception;

import java.io.*;

public class LearnCheckedExceptionWithTryCatch {

    public static void main(String[] args) {

        try {
            FileInputStream theFile = new FileInputStream("src/test");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } finally {
            // Exception 발생 관계없이 수행되는 코드
        }

    }

}
