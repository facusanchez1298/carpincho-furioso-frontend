package com.coden2020.hackaton.app.infrastructure.controller;

import com.coden2020.hackaton.app.domain.model.User;
import com.coden2020.hackaton.app.domain.usecases.ProvideAllCategoriesUseCase;
import com.coden2020.hackaton.app.domain.usecases.ProvideAllServicesUseCase;
import com.coden2020.hackaton.app.domain.usecases.ProvideUserForCategoriesUseCase;
import com.coden2020.hackaton.app.infrastructure.entities.Category;
import com.coden2020.hackaton.app.infrastructure.entities.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriesController {

  private ProvideAllCategoriesUseCase provideAllCategoriesUseCase;
  private ProvideUserForCategoriesUseCase provideUserForCategoriesUseCase;
  private ProvideAllServicesUseCase provideAllServicesUseCase;
  @Autowired
  public CategoriesController(
      ProvideAllCategoriesUseCase provideAllCategoriesUseCase,
      ProvideUserForCategoriesUseCase provideUserForCategoriesUseCase,
      ProvideAllServicesUseCase provideAllServicesUseCase) {
    this.provideAllCategoriesUseCase = provideAllCategoriesUseCase;
    this.provideUserForCategoriesUseCase = provideUserForCategoriesUseCase;
    this.provideAllServicesUseCase = provideAllServicesUseCase;
  }

  @GetMapping("/services/categories")
  public ResponseEntity<List<Category>>  getCategories(){
    return ResponseEntity.ok().body(provideAllCategoriesUseCase.execute());
  }

  @GetMapping("/services/{idCategory}")
  public ResponseEntity<List<User>> getAllUserByCategory(@PathVariable(value = "idCategory") String idCategory){
    return ResponseEntity.ok().body(provideUserForCategoriesUseCase.execute(idCategory));
  }

  @GetMapping("/services")
  public ResponseEntity<List<Service>> getAllServices() {
    return ResponseEntity.ok().body(provideAllServicesUseCase.execute());
  }
}
