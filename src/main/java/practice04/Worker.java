package practice04;

public class Worker extends Person {
    Worker(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String basicIntroduce() {

        return String.format("%s I am a Worker. I have a job.", super.basicIntroduce());
    }
}
