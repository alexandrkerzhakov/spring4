package ru.gb.spring4.repository;

import org.springframework.stereotype.Repository;
import ru.gb.spring4.model.Student;

import java.util.List;

@Repository
public class StudentRepository {

    private List<Student> students;

    public StudentRepository(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void add(Student student) {
        students.add(student);
    }
}
