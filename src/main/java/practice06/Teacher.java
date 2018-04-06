package practice06;

public class Teacher extends Person{
    private Integer klass = null;

    Teacher(String name, Integer age) {
        super(name, age);
    }

    public Teacher(String name, Integer age, Integer klass) {
        super(name, age);
        this.klass = klass;
    }

    public Integer getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (klass == null){
            return String.format("%s I am a Teacher. I teach No Class.", super.introduce());
        }
        return String.format("%s I am a Teacher. I teach Class %s.", super.introduce(), klass);
    }
}
