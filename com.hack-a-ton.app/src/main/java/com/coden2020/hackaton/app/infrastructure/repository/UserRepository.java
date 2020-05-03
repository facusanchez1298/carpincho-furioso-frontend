package com.coden2020.hackaton.app.infrastructure.repository;

import com.coden2020.hackaton.app.infrastructure.entities.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
  User findByEmail(User user);
  Optional<User> findById(Long id);
  List<User> findAll();
}
