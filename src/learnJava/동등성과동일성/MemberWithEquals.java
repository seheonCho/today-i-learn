package learnJava.동등성과동일성;

public class MemberWithEquals {

    String id;
    String name;
    int age;

    public MemberWithEquals(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MemberWithEquals that = (MemberWithEquals) o;

        if (age != that.age) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

}
