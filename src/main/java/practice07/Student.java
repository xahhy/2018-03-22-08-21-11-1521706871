package practice07;

public class Student extends Person {
    private final Klass klass;

    Student(String name, Integer age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return String.format("%s I am a Student. I am at %s.", super.introduce(), klass.getDisplayName());
    }
}
