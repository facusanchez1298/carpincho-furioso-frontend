package com.coden2020.hackaton.app.domain.model;

import java.util.List;

public interface ProvideUserForCategoryService {
  public List<User> getAllUserFromCategory(String idCategory);
}
