package com.coden2020.hackaton.app.domain.usecases;

import com.coden2020.hackaton.app.domain.model.ProvideUserForCategoryService;
import com.coden2020.hackaton.app.domain.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProvideUserForCategoriesUseCase {
  private transient ProvideUserForCategoryService provideUserForCategoriesUseCase;

  public ProvideUserForCategoriesUseCase(ProvideUserForCategoryService provideUserForCategoriesUseCase) {
    this.provideUserForCategoriesUseCase = provideUserForCategoriesUseCase;
  }

  public List<User> execute(String idCategory){
    return provideUserForCategoriesUseCase.getAllUserFromCategory(idCategory);
  }
}
