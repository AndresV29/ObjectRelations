package villalobos.andres.bl;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthDay;
    private int age, id;
     private Address lives;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getLives() {
        return lives;
    }

    public void setLives(Address lives) {
        this.lives = lives;
    }
}
