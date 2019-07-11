package practice03;

import practice03.Person;

public class Student extends Person {
    private int klass;

    public Student() {
    }

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return "I am a Student. I am at Class "+klass+".";
    }
}
