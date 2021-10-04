package com.kinas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kinas.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
