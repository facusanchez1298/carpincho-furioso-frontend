package com.coden2020.hackaton.app.domain.model.usecases;

import com.coden2020.hackaton.app.domain.model.User;
import com.coden2020.hackaton.app.infrastructure.entities.UserProviderExtraData;

public class FullUserData {
  private User user;
  private UserProviderExtraData userProviderExtraData;

  public FullUserData(User user, UserProviderExtraData userProviderExtraData) {
    this.user = user;
    this.userProviderExtraData = userProviderExtraData;
  }

  public FullUserData() {
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public UserProviderExtraData getUserProviderExtraData() {
    return userProviderExtraData;
  }

  public void setUserProviderExtraData(UserProviderExtraData userProviderExtraData) {
    this.userProviderExtraData = userProviderExtraData;
  }
}
