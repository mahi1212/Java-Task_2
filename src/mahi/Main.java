package mahi;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student.universityName = "Leading University";
        Student student2 = new Student("Mahinur Rahman");
        Student student3 = new Student(2012020160);
        student1.display();
    }
}

/*
    Name : Mahinur Rahman
    ID :2012020160
    Sec: 53(D)
    Email : mahi121.mr@gmail.com / cse_2012020160@lus.ac.bd
    Date : 08.06.2021
 */