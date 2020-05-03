package com.coden2020.hackaton.app.infrastructure.controller;

import com.coden2020.hackaton.app.domain.model.User;
import com.coden2020.hackaton.app.domain.usecases.ProvideAllCategoriesUseCase;
import com.coden2020.hackaton.app.domain.usecases.ProvideAllServicesUseCase;
import com.coden2020.hackaton.app.domain.usecases.ProvideUserForCategoriesUseCase;
import com.coden2020.hackaton.app.infrastructure.entities.Category;
import com.coden2020.hackaton.app.infrastructure.entities.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/services")
public class CategoriesController {

  private transient final ProvideAllCategoriesUseCase provideAllCategoriesUseCase;
  private transient final ProvideUserForCategoriesUseCase provideUserForCategoriesUseCase;
  private transient final ProvideAllServicesUseCase provideAllServicesUseCase;

  public CategoriesController(ProvideAllCategoriesUseCase provideAllCategoriesUseCase, ProvideUserForCategoriesUseCase provideUserForCategoriesUseCase, ProvideAllServicesUseCase provideAllServicesUseCase) {
    this.provideAllCategoriesUseCase = provideAllCategoriesUseCase;
    this.provideUserForCategoriesUseCase = provideUserForCategoriesUseCase;
    this.provideAllServicesUseCase = provideAllServicesUseCase;
  }

  @GetMapping("/categories")
  public ResponseEntity<List<Category>>  getCategories(){
    return ResponseEntity.ok().body(provideAllCategoriesUseCase.execute());
  }

  @GetMapping("/{idCategory}")
  public ResponseEntity<List<User>> getAllUserByCategory(@PathVariable(value = "idCategory") String idCategory){
    return ResponseEntity.ok().body(provideUserForCategoriesUseCase.execute(idCategory));
  }

  @GetMapping("/services")
  public ResponseEntity<List<Service>> getAllServices() {
    return ResponseEntity.ok().body(provideAllServicesUseCase.execute());
  }
}
