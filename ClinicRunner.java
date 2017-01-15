package ru.lesson.lessons;
/**
 * Created by Администратор on 04.01.2017.
 */
public class ClinicRunner {

    public static void main(String[] args){
        Clinic clinic = new Clinic(10);
        clinic.insertClient("Gasan","Tom","Brown",7);
        clinic.insertClient("Murad","Murzik","White",5);
        clinic.insertClient("Ruslan","Krom","Ylow",5);
        clinic.insertClient("David","Teri","Black",5);

        clinic.showClients();
        clinic.edit(3);
        clinic.showClients(3);
    }

}
