package practice07;

public class Teacher extends Person {
    private Klass klass = null;

    Teacher(String name, Integer age) {
        super(name, age);
    }

    public Teacher(String name, Integer age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String basicIntroduce(){
        return String.format("%s I am a Teacher.", super.introduce());
    }

    @Override
    public String introduce() {
        if (klass == null){
            return String.format("%s I teach No Class.", basicIntroduce());
        }
        return String.format("%s I teach %s.", basicIntroduce(), klass.getDisplayName());
    }

    public String introduceWith(Student student) {
        if (!student.getKlass().getNumber().equals(this.klass.getNumber())) {
            return String.format("%s I don't teach %s.", this.basicIntroduce(), student.getName());
        }else {
            return String.format("%s I teach %s.", this.basicIntroduce(), student.getName());
        }
    }
}
