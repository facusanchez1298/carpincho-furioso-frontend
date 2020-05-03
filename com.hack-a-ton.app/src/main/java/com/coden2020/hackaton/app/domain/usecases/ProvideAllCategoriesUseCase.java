package com.coden2020.hackaton.app.domain.usecases;

import com.coden2020.hackaton.app.domain.model.CategoriesService;
import com.coden2020.hackaton.app.infrastructure.entities.Category;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProvideAllCategoriesUseCase {
  private transient CategoriesService categoriesService;

  public ProvideAllCategoriesUseCase(CategoriesService categoriesService) {
    this.categoriesService = categoriesService;
  }

  public List<Category> execute(){
    return categoriesService.execute();
  }
}
