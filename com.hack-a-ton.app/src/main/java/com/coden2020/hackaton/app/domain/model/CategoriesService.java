package com.coden2020.hackaton.app.domain.model;

import com.coden2020.hackaton.app.infrastructure.entities.Category;

import java.util.List;

public interface CategoriesService {
  List<Category> execute();
}
