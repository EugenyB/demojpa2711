package com.example.demojpa2711.repositories;

import com.example.demojpa2711.data.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {

    List<Student> findByFirstName(String firstName);

    List<Student> findByFirstNameStartsWith(String s);

    List<Student> findByFirstNameStartsWithAndAgeGreaterThan(String s, int a);
}
