package org.example.pets;

public class Hamster {

    private String name;
    protected int age;
    public String color;
    public boolean isSleeping;

    public Hamster() {
        this.name = "Безымянный";
        this.age = 0;
        this.color = "Без цвета";
        this.isSleeping = true;
    }

    public Hamster(String name, int age, String color, boolean isSleeping) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.isSleeping = isSleeping;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    public void eat() {
        System.out.println("Ваш хомячок " + name + " ест зернышки.");
    }

    public void ageMark() {
        if (age < 1.5) {
            System.out.println("Ваш хомячок " + name + " очень молод.");
        }
        else {
            System.out.println("Ваш хомячок " + name + " уже не в расцвете сил.");
        }
    }


    public void status() {
        if (isSleeping != true) {
            System.out.println("Ваш хомячок " + name + " проснулся!");
        } else {
            System.out.println("Ваш хомячок " + name + " заснул!");
        }
    }

    @Override
    public String toString() {
        return "Хомячок{" + "имя='" + name + '\'' + ", возраст=" + age + ", цвет='" + color + '\'' + ", спит=" + isSleeping + '}';
    }
}
