package learnJava.동등성과동일성;

public class LearnEqualsAndHashCode {

    public static void main(String[] args) {

        Member member1 = new Member("hello", "이순신", 27);
        Member member2 = new Member("hello", "이순신", 27);

        System.out.println(member1.equals(member2));
        System.out.println("1 ==> " + member1.hashCode());
        System.out.println("2 ==> " + member2.hashCode());

        MemberWithEquals memberWithEquals1 = new MemberWithEquals("hello", "이순신", 27);
        MemberWithEquals memberWithEquals2 = new MemberWithEquals("hello", "이순신", 27);

        System.out.println("====================");
        System.out.println(memberWithEquals1.equals(memberWithEquals2));
        System.out.println("1 ==> " + memberWithEquals1.hashCode());
        System.out.println("2 ==> " + memberWithEquals2.hashCode());

        MemberWithEqualsAndHashCode memberWithEqualsAndHashCode1 = new MemberWithEqualsAndHashCode("hello", "이순신", 27);
        MemberWithEqualsAndHashCode memberWithEqualsAndHashCode2 = new MemberWithEqualsAndHashCode("hello", "이순신", 27);

        System.out.println("====================");
        System.out.println(memberWithEqualsAndHashCode1.equals(memberWithEqualsAndHashCode2));
        System.out.println("1 ==> " + memberWithEqualsAndHashCode1.hashCode());
        System.out.println("2 ==> " + memberWithEqualsAndHashCode2.hashCode());

    }

}
