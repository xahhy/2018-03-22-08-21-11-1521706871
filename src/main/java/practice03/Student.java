package practice03;

public class Student extends Person {
    private final Integer klass;

    Student(String name, Integer age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public Integer getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return String.format("I am a Student. I am at Class %s.", klass);
    }
}
