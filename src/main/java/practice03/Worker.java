package practice03;

public class Worker extends Person{
    Worker(String name, Integer age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return "I am a Worker. I have a job.";
    }
}
