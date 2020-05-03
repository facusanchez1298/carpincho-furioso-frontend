package com.coden2020.hackaton.app.infrastructure.repository;

import com.coden2020.hackaton.app.domain.model.CategoriesService;
import com.coden2020.hackaton.app.infrastructure.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoriesServiceImp  implements CategoriesService {

  private CategoryRepository categoryRepository;

  @Autowired
  public CategoriesServiceImp(CategoryRepository categoryRepository) {
    this.categoryRepository = categoryRepository;
  }

  @Override
  public List<Category> execute() {
    return categoryRepository.findAll();
  }
}
