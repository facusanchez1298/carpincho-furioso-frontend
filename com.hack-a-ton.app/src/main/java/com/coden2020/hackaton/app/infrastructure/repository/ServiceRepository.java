package com.coden2020.hackaton.app.infrastructure.repository;

import com.coden2020.hackaton.app.infrastructure.entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends JpaRepository<Service,Long> {
}
