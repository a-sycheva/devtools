package ru.mentee.power.student;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StudentListTest {

  @Test
  @DisplayName("Should add student when not null")
  void shouldAddStudentWhenNotNull() {
    StudentList studentList = new StudentList();
    Student student = new Student("Ivan", "Omsk");

    studentList.addStudent(student);

    assertThat(studentList.getStudentList()).contains(student);
  }

  @Test
  @DisplayName("Should not add student when null")
  void shouldNotAddStudentWhenNotNull() {
    StudentList studentList = new StudentList();
    int sizeBefore = studentList.size();
    studentList.addStudent(null);

    assertThat(sizeBefore).isEqualTo(studentList.size());
  }

  @Test
  @DisplayName("Should not throw exception when student is null")
  void shouldNotThrowExceptionWhenStudentIsNull() {
    StudentList studentList = new StudentList();
    studentList.addStudent(null);

    assertThatCode(() -> studentList.addStudent(null))
        .doesNotThrowAnyException();
  }

  @Test
  @DisplayName("Should get right city")
  void shouldGetRightCity() {
    StudentList studentList = new StudentList();

    Student fromOmsk = new Student("Ivan", "Omsk");
    Student fromKislovodsk = new Student("Olya", "Kislovodsk");

    studentList.addStudent(fromOmsk);
    studentList.addStudent(fromKislovodsk);

    List<Student> studentsFromOmsk = studentList.getStudentsFromSpecificCity("Omsk");

    assertThat(studentsFromOmsk).contains(fromOmsk).doesNotContain(fromKislovodsk);

  }

  @Test
  @DisplayName("Should return nothing when city is empty")
  void shouldReturnNothingWhenCityIsEmpty() {
    StudentList studentList = new StudentList();

    Student fromOmsk = new Student("Ivan", "Omsk");
    Student fromKislovodsk = new Student("Olya", "Kislovodsk");

    studentList.addStudent(fromOmsk);
    studentList.addStudent(fromKislovodsk);

    List<Student> studentsFromNowhere = studentList.getStudentsFromSpecificCity("");

    assertThat(studentsFromNowhere).doesNotContain(fromOmsk).doesNotContain(fromKislovodsk);

  }

  @Test
  @DisplayName("Should not throw exception when list is empty")
  void shouldThrowExceptionWhenListIsEmpty() {
    StudentList studentList = new StudentList();

    assertThatCode(() -> studentList.getStudentList()).doesNotThrowAnyException();

  }

  @Test
  @DisplayName("Main should execute correct")
  void shouldExecuteCorrect () {

    assertThatCode(StudentList::main).doesNotThrowAnyException();
  }
}