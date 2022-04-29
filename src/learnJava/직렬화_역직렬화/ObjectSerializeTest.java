package learnJava.직렬화_역직렬화;

import java.io.Serializable;

public class ObjectSerializeTest implements Serializable {

    private static final long serialVersionUID = 20220429200900L;

    Object theObject = new Object();

    @Override
    public String toString() {
        return "ObjectSerializeTest{" +
                "theObject=" + theObject +
                '}';
    }

}
