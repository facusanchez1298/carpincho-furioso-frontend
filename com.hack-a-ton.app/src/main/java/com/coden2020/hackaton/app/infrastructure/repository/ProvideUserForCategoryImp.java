package com.coden2020.hackaton.app.infrastructure.repository;

import com.coden2020.hackaton.app.domain.model.ProvideUserForCategoryService;
import com.coden2020.hackaton.app.domain.model.User;
import com.coden2020.hackaton.app.infrastructure.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProvideUserForCategoryImp implements ProvideUserForCategoryService {
  private transient UserMapper userMapper;

  @Autowired
  public ProvideUserForCategoryImp(UserMapper userMapper) {
    this.userMapper = userMapper;
  }

  @Override
  public List<User> getAllUserFromCategory(String idCategory) {
    return null;
  }
}
