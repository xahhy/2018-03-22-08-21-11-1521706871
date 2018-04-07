package practice11;

import java.util.Set;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private Set<Klass> classes = null;

    Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public Teacher(Integer id, String name, Integer age, Set<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        classes.stream().peek(klass -> klass.appendTeacher(this)).count();
    }

    public Set<Klass> getClasses() {
        return classes;
    }

    public String basicIntroduce() {
        return String.format("%s I am a Teacher.", super.introduce());
    }

    public String classesIntroduce() {
        return "Class " + classes.stream().map(klass -> klass.getNumber().toString()).collect(Collectors.joining(", "));
    }

    @Override
    public String introduce() {
        if (classes == null) {
            return String.format("%s I teach No Class.", basicIntroduce());
        }
        return String.format("%s I teach %s.", basicIntroduce(), classesIntroduce());
    }

    public String introduceWith(Student student) {
        if (!this.classes.contains(student.getKlass())) {
            return String.format("%s I don't teach %s.", this.basicIntroduce(), student.getName());
        } else {
            return String.format("%s I teach %s.", this.basicIntroduce(), student.getName());
        }
    }

    public boolean isTeaching(Student student) {
        return classes.stream().anyMatch(klass -> klass.isIn(student));
    }

    public void studentNotify(Student student) {
        if (student.equals(student.getClasses().getLeader())) {
            System.out.print(String.format("I am %s. I know %s become Leader of %s.\n", this.getName(), student.getName(), student.getClasses().getDisplayName()));
        } else {
            System.out.print(String.format("I am %s. I know %s has joined %s.\n", this.getName(), student.getName(), student.getClasses().getDisplayName()));
        }
    }
}
