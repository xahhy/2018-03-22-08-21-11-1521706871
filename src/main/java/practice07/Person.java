package practice07;

public class Person {
    private final String name;
    private final Integer age;

    Person(String name, Integer age) {

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
}
