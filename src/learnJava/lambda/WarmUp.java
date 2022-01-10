package learnJava.lambda;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.List;

public class WarmUp {

    // setup data
    static List<String> messages = Arrays.asList("hello", "baeldung", "reader!");

    public static void main(String[] args) {

        // default lambda expression
        messages.forEach(word -> StringUtils.capitalize(word));

        // method reference
        messages.forEach(StringUtils::capitalize);
    }

}
