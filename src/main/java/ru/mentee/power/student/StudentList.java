package ru.mentee.power.student;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
  private List<Student> studentList;

  public StudentList() {
    studentList = new ArrayList<>();
  }

  public List<Student> getStudentList() {
    return new ArrayList<Student>(this.studentList);
  }

  public int  size() {
    return this.studentList.size();
  }

  public void addStudent(Student student) {

    if (student != null) {
      studentList.add(student);
    }
  }

  public List<Student> getStudentsFromSpecificCity(String city) {
    return studentList.stream().filter(s -> s.city().equals(city)).toList();
  }

  static void main() {

    StudentList studentList = new StudentList();

    studentList.addStudent(new Student("Anastasiya", "Moscow"));
    studentList.addStudent(new Student("Olga", "Kirov"));
    studentList.addStudent(new Student("Kolya", "Moscow"));

  }
}