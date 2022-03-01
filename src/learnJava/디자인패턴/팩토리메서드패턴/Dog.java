package learnJava.디자인패턴.팩토리메서드패턴;

public class Dog extends Animal {

    // 추상 팩토리 메서드 오버라이딩
    @Override
    AnimalToy getToy() {
        return new DogToy();
    }

}
