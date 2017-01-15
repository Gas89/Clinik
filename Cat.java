package ru.lesson.lessons;
/**
 * Created by Администратор on 04.01.2017.
 */
public class Cat {
    private String name;
    private String color;
    private int age;
   public Cat(){}
    public Cat(String name,String color,int age){
       this.name = name;
       this.color = color;
       this.age = age;
   }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;

    }
}
