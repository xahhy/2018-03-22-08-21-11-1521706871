package practice11;

import java.util.HashSet;
import java.util.Set;

public class Klass {
    private Integer number;
    private String displayName;
    private Student leader;
    private Set<Teacher> teachers;

    public Klass(Integer number) {
        this.number = number;
        this.displayName = "Class " + number;
        this.teachers = new HashSet<Teacher>();
    }

    public Integer getNumber() {
        return number;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void assignLeader(Student student) {
        if(this.equals(student.getKlass())) {
            this.leader = student;
            teachers.stream().peek(teacher -> teacher.studentNotify(student)).count();
        }else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        teachers.stream().peek(teacher -> teacher.studentNotify(student)).count();
    }

    public boolean isIn(Student student) {
        return student.getKlass().getNumber().equals(this.number);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false; //能调用这个方法，this肯定不为null，所以不判断this
        if(this.getClass() != obj.getClass()) return false; //如果不死同一个类，则必然false
        Klass that = (Klass) obj;
        return that.getNumber().equals(this.number);
    }

    public void appendTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }
}
