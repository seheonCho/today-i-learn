package learnJava.callByValue_callByReference;

public class CallByExam {

    public static void main(String[] args) {
        Cat firstCat = new Cat("Nero");
        Cat secondCat = new Cat("Nabi");

        System.out.println(firstCat.name + " / " + firstCat);
        System.out.println(secondCat.name + " / " + secondCat);

        swapCat(firstCat, secondCat);

        System.out.println(firstCat.name + " / " + firstCat);
        System.out.println(secondCat.name + " / " + secondCat);

    }

    static void swapCat(Cat firstCat, Cat secondCat) {
        System.out.println("==== swapCat(Cat firstCat, Cat secondCat) start ====");

        System.out.println(firstCat.name + " / " + firstCat);
        System.out.println(secondCat.name + " / " + secondCat);

        Cat tempCat = firstCat;
        firstCat = secondCat;
        secondCat = tempCat;

        System.out.println(firstCat.name + " / " + firstCat);
        System.out.println(secondCat.name + " / " + secondCat);

        System.out.println("==== swapCat(Cat firstCat, Cat secondCat) start ====");

    }

}
