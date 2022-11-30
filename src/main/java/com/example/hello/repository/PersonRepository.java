package com.example.hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hello.models.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
  
}
