package com.coden2020.hackaton.app.infrastructure.repository;

import com.coden2020.hackaton.app.domain.model.CategoriesService;
import com.coden2020.hackaton.app.infrastructure.entities.Category;

import java.util.List;

public class CategoriesServiceImp  implements CategoriesService {

  private transient CategoryRepository categoryRepository;

  @Override
  public List<Category> execute() {
    return categoryRepository.findAll();
  }
}
