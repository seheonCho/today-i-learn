package learnJava.디자인패턴.팩토리메서드패턴;

public class Driver {

    public static void main(String[] args) {

        // 팩토리 메서드르 보유한 객체 생성
        Animal theDog = new Dog();
        Animal theCat = new Cat();

        // 팩토리 메서드가 반환하는 객체
        AnimalToy theDogBall = new DogToy();
        AnimalToy theCatTower = new CatToy();

        // 팩토리 메서드가 반환한 객체 사용
        theDogBall.identify();
        theCatTower.identify();

    }

}
