package com.coden2020.hackaton.app.infrastructure.repository;

import com.coden2020.hackaton.app.domain.model.AllServicesUCInterface;
import com.coden2020.hackaton.app.infrastructure.entities.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AllServicesImp implements AllServicesUCInterface {

  private ServiceRepository serviceRepository;
  @Autowired
  public AllServicesImp(
      ServiceRepository serviceRepository) {
    this.serviceRepository = serviceRepository;
  }

  @Override
  public List<Service> execute() {
    return serviceRepository.findAll();
  }
}
