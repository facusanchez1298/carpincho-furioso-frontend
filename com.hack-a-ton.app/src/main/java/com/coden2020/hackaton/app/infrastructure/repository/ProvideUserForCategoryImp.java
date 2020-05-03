package com.coden2020.hackaton.app.infrastructure.repository;

import com.coden2020.hackaton.app.domain.model.ProvideUserForCategoryService;
import com.coden2020.hackaton.app.domain.model.User;
import com.coden2020.hackaton.app.infrastructure.mappers.UserMapper;

import java.util.List;

public class ProvideUserForCategoryImp implements ProvideUserForCategoryService {
  private transient UserMapper userMapper;

  @Override
  public List<User> getAllUserFromCategory(String idCategory) {
    return null;
  }
}
