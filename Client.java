package ru.lesson.lessons;
/**
 * Created by Администратор on 08.01.2017.
 */
public class Client {
    private String name;
    private Cat cat;
    public Client(String name,String catName,String catColor,int catAge){
        this.name = name;
        cat = new Cat(catName,catColor,catAge);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void showInfo(){
        System.out.println("*******************");
        System.out.println("Name: "+this.name);
        System.out.println("Pitomic: "+ cat.getName());
        System.out.println("Age: "+ cat.getAge());
        System.out.println("Color: "+ cat.getColor());
        System.out.println("*******************");
    }

}
