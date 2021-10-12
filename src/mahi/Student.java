package mahi;

public class Student {
    String name;
    int id;
    static String universityName;
    Student()
    {
        System.out.println("Default constructor");
    }
    Student (String name)
    {
        this.name = name;
        System.out.println("Name is : " + name);
    }
    Student (int id)
    {
        this.id = id;
        System.out.println("Id is : " + id);
    }
    void display()
    {
        System.out.println("University name is : "+ universityName);
    }
}

/*
    Name : Mahinur Rahman
    ID :2012020160
    Sec: 53(D)
    Email : mahi121.mr@gmail.com / cse_2012020160@lus.ac.bd
    Date : 08.06.2021
 */