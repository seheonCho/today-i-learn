package learnJava.컬렉션.맵;

import java.util.HashMap;
import java.util.Map;

public class LearnHash {

    public static void main(String[] args) {
        Human human1 = new Human("홍길동", 27);
        Human human2 = new Human("홍길동", 27);

        System.out.println(human1 == human2);
        System.out.println(human1.equals(human2));
        System.out.println(human1.hashCode());
        System.out.println(human2.hashCode());

        System.out.println("--------------");

        Animal animal1 = new Animal("낙타", 27);
        Animal animal2 = new Animal("낙타", 27);

        System.out.println(animal1 == animal2);
        System.out.println(animal1.equals(animal2));
        System.out.println(animal1.hashCode());
        System.out.println(animal2.hashCode());

        System.out.println("--------------");

        Map<Human, Integer> humanMap = new HashMap<>();
        humanMap.put(human1, 1);
        humanMap.put(human2, 2);
        Map<Animal, Integer> animalMap = new HashMap<>();
        animalMap.put(animal1, 1);
        animalMap.put(animal2, 2);

        System.out.println(humanMap.size());
        System.out.println(animalMap.size());
    }

}
