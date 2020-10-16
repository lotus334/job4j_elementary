package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Grigori NeKrasov");
        student.setGroup("the best");
        student.setDateOfAdmission("few minutes ago");
        System.out.println("Student " + student.getFullName() + " entered to " + student.getGroup() + " group " + student.getDateOfAdmission());
    }
}
