package com.se331.nahe.service;

import com.se331.nahe.dao.StudentDao;
import com.se331.nahe.entity.Student;
import com.se331.nahe.entity.StudentDTO;
import com.se331.nahe.repository.StudentRepository;
import com.se331.nahe.security.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    final StudentDao studentDao;
    private final StudentRepository studentRepository;
    @Override
    public Integer getStudentsSize() {
        return studentDao.getStudentSize();
    }

    @Override
    public Page<Student> getStudents(Integer pageSize, Integer page) {
        return studentDao.getStudents(pageSize, page);
    }

    @Override
    public Page<Student> getStudents(String filter, Pageable pageable) {
        return studentDao.getStudents(filter,pageable);
    }

    @Override
    public Student getStudent(Long id) {
        return studentDao.getStudent(id);
    }

    @Override
    public Student save(Student student) {
        return studentDao.save(student);
    }

    @Override
    public User updateStudent(Long id, User user) {
        return studentDao.updateStudent(id, user);
    }

    @Override
    public User findUserByStudentId(Long studentId) {
        return studentRepository.findById(studentId)
                .map(Student::getUser)
                .orElseThrow(() -> new IllegalArgumentException("Student not found"));
    }



    @Override
    public Page<Student> getStudentTeacherIsNull(Integer perPage, Integer page) {
        return studentRepository.findByTeacherIsNull(PageRequest.of(page - 1, perPage));
    }
}
