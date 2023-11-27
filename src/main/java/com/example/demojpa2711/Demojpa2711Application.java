package com.example.demojpa2711;

import com.example.demojpa2711.data.Student;
import com.example.demojpa2711.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demojpa2711Application {

    public static void main(String[] args) {
        SpringApplication.run(Demojpa2711Application.class, args);
    }

    @Bean
    public CommandLineRunner run(StudentRepository repository) {
        return args -> {
          //addStudents(repository);

            //repository.findAll().forEach(System.out::println);

            //repository.findByFirstName("Kate").forEach(System.out::println);

            //repository.findByFirstNameStartsWith("Ja").forEach(System.out::println);

            repository.findByFirstNameStartsWithAndAgeGreaterThan("Ja", 21).forEach(System.out::println);
        };
    }

    private void addStudents(StudentRepository repository) {
        repository.save(new Student("John", "Dow", 20));
        repository.save(new Student("Kate", "Bird", 21));
        repository.save(new Student("Jane", "Wing", 22));
        repository.save(new Student("Jack", "Small", 20));
    }

}
