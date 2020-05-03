package com.coden2020.hackaton.app.infrastructure.mappers;

import com.coden2020.hackaton.app.domain.model.User;
import com.coden2020.hackaton.app.domain.usecases.ProvideAllCategoriesUseCase;
import com.coden2020.hackaton.app.domain.usecases.ProvideUserForCategoriesUseCase;
import com.coden2020.hackaton.app.infrastructure.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/services")
public class CategoriesController {

  private transient ProvideAllCategoriesUseCase provideAllCategoriesUseCase;
  private transient ProvideUserForCategoriesUseCase provideUserForCategoriesUseCase;

  @GetMapping("/")
  public ResponseEntity<List<Category>>  getServices(){
    return ResponseEntity.ok().body(provideAllCategoriesUseCase.execute());
  }

  @GetMapping("/{idCategory}")
  public ResponseEntity<List<User>> getAllUserByCategory(@PathVariable(value = "idCategory") String idCategory){
    return ResponseEntity.ok().body(provideUserForCategoriesUseCase.execute(idCategory));
  }
}
