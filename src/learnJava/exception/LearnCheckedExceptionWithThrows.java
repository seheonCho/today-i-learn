package learnJava.exception;

import java.io.IOException;

public class LearnCheckedExceptionWithThrows {

    public static void main(String[] args) throws IOException {
        LearnException theTest = new LearnException();
        theTest.testCheckedExceptionWithCheckedException();
    }


}
