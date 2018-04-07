package practice11;

public class Person {
    private Integer id;
    private final String name;
    private final Integer age;

    Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String introduce() {
        return String.format("My name is %s. I am %s years old.", name, age);
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false; //能调用这个方法，this肯定不为null，所以不判断this
        if(this.getClass() != obj.getClass()) return false; //如果不死同一个类，则必然false
        Person that = (Person)obj;
        return that.getId().equals(this.id);
    }
}
