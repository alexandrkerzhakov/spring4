package ru.gb.spring4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.gb.spring4.model.Student;
import ru.gb.spring4.repository.StudentRepository;

@Controller
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public String getProduct(Model model) {
        model.addAttribute("students", studentRepository.getStudents());
        return "students";
    }

    @PostMapping("/students")
    public String addProduct(Student student, Model model) {
        studentRepository.add(student);
        model.addAttribute("student", studentRepository.getStudents());
        return "redirect:students";
    }

}
