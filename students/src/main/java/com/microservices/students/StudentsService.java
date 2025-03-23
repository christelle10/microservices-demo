package com.microservices.students;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentsService {
    private final com.microservices.students.StudentsRepository studentRepository;

    public void saveStudent(Students student) {
        studentRepository.save(student);
    }

    public List<Students> findAllStudents() {
        return studentRepository.findAll();
    }

    public List<Students> findAllStudentsBySchool(Integer schoolId) {
        return studentRepository.findAllBySchoolId(schoolId);
    }
}
