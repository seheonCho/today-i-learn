package learnJava.직렬화_역직렬화;

import java.io.*;

public class LearnSerialize {

    public static void main(String[] args) throws FileNotFoundException {

        UserDto userDto = new UserDto("test", "1234", "홍길동", 27);
        File theFile = new File("/Users/choseheon/Documents/test.txt");
        String path = theFile.getAbsolutePath();

        System.out.println("userDto ==> " + userDto);
        LearnSerialize learnSerialize = new LearnSerialize();

        if (theFile.exists()) {
            Object deSerializeObj = learnSerialize.loadSerializedClass(path);
            UserDto deSerializeUserDto = (UserDto) deSerializeObj;
            System.out.println("deSerialized userDto ==> " + deSerializeUserDto);
        } else {
            learnSerialize.saveSerializedClass(path, userDto);
        }


        System.out.println("========================================");

        File theFileTwo = new File("/Users/choseheon/Documents/test2.txt");
        ObjectSerializeTest objectSerializeTest = new ObjectSerializeTest();
        learnSerialize.saveSerializedClass(path, objectSerializeTest);

    }

    public void saveSerializedClass(String path, UserDto userDto) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(userDto);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Object loadSerializedClass(String path) {

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        UserDto userDto = null;

        try {
            fis = new FileInputStream(path);
            ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            userDto = (UserDto) obj;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return userDto;
    }

    public void saveSerializedClass(String path, ObjectSerializeTest userDto) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(path);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(userDto);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
