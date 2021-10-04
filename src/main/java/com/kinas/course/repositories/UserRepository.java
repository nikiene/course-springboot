package com.kinas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kinas.course.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
