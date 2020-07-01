package com.espeicher.manager.data.service;

import com.espeicher.manager.data.entity.Person;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}