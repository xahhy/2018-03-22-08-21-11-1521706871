package practice10;

public class Student extends Person {
    private Klass klass;

    Student(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (this.equals(this.klass.getLeader())) {
            return String.format("%s I am Leader of %s.", basicIntroduce(), klass.getDisplayName());
        } else {
            return String.format("%s I am at %s.", basicIntroduce(), klass.getDisplayName());
        }
    }

    public String basicIntroduce() {
        return String.format("%s I am a Student.", super.introduce());
    }
}
