package practice08;

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
        Person that = (Person)obj; //将Object类型的x转换为Data型。因为上一行已经判断了x是否为Data型，所以可以直接转换
        return that.getId().equals(this.id);
    }
}
