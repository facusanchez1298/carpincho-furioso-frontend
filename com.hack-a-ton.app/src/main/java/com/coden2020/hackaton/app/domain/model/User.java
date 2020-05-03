package com.coden2020.hackaton.app.domain.model;

public class User {

  private String name;
  private String LastName;
  private String email;
  private String dni;

  public User(String name, String lastName, String email, String dni) {
    this.name = name;
    LastName = lastName;
    this.email = email;
    this.dni = dni;
  }

  public User() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return LastName;
  }

  public void setLastName(String lastName) {
    LastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDni() {
    return dni;
  }

  public void setDni(String dni) {
    this.dni = dni;
  }
}
