package com.coden2020.hackaton.app.infrastructure.repository;

import com.coden2020.hackaton.app.infrastructure.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
  Optional<User> findById(Long id);
  Optional<User> findByUserName(String name);
  List<User> findAll();
  User findByUserDni(String dni);
}
