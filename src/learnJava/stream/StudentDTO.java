package learnJava.stream;

public class StudentDTO {

    private String name;
    private int age;
    private int scoreAverage;
    private float gradePointAverage;

    public StudentDTO(String name, int age, int scoreAverage, float gradePointAverage) {
        this.name = name;
        this.age = age;
        this.scoreAverage = scoreAverage;
        this.gradePointAverage = gradePointAverage;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScoreAverage() {
        return scoreAverage;
    }

    public float getGradePointAverage() {
        return gradePointAverage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentDTO that = (StudentDTO) o;

        if (age != that.age) return false;
        if (scoreAverage != that.scoreAverage) return false;
        if (Float.compare(that.gradePointAverage, gradePointAverage) != 0) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + scoreAverage;
        result = 31 * result + (gradePointAverage != +0.0f ? Float.floatToIntBits(gradePointAverage) : 0);
        return result;
    }
}
