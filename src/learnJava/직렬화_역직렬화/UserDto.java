package learnJava.직렬화_역직렬화;

import java.io.Serializable;

public class UserDto implements Serializable {

    private static final long serialVersionUID = 20220429200900L;

    private String id;
    transient private String password;
    private String name;
    private int age;

    public UserDto(String id, String password, String name, int age) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
