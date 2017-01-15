package ru.lesson.lessons;
import java.util.Scanner;

public class Clinic {
    private Client[] client;
    private int id;
    Scanner scr;


    public Clinic(int max) {
        client = new Client[max];
        this.id = 0;
    }

    public void insertClient(String clientName,String catName,String catColor,int catAge){
        client[id] = new Client(clientName,catName,catColor,catAge);
        this.id++;
    }
    public void find(String serchName){
        int j;
        for(j=0; j<id; j++)
            if(client[j].getName().equals(serchName))
                break;
        if(j == id)
            System.out.println("Такого клиента в списке нет");
        else
            client[j].showInfo();
    }
    public boolean delete(String serchName){
        int j;
        for(j=0; j<id; j++)
            if(client[j].getName().equals(serchName))
                break;
            if(j == id)
                return false;
            else{
                for(int k=j; k<id; k++)
                    client[k]=client[k+1];
                  id--;
                return true;
            }

    }
    public void showClients(){
        for(int j=0;j<id;j++)
            client[j].showInfo();
    }
    public void showClients(int id){
         if(id > this.id || id < 0) {
             System.out.println("Введите коректный id");
            return;
         }
             else client[id].showInfo();
    }
    public void edit(int id){
        System.out.println("Вы выбрали клиента для редоктирования");
        System.out.print("Введите имя клиента:");
        scr = new Scanner(System.in);
        String newNameClient = scr.next();
        System.out.print("Введите имя питомца:");
        scr = new Scanner(System.in);
        String newNameCat = scr.next();
        System.out.print("Введите Цвет питомца:");
        scr = new Scanner(System.in);
        String newColorCat = scr.next();
        System.out.print("Введите возрост питомца:");
        scr = new Scanner(System.in);
        int newAgeCat = scr.nextInt();
        client[id]= new Client(newNameClient,newNameCat,newColorCat,newAgeCat);

    }

}
