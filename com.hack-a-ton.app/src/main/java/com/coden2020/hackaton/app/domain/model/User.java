package com.coden2020.hackaton.app.domain.model;

public class User {

  private String name;
  private String lastName;
  private String email;
  private String phone;
  private String dni;

  public User(String name, String lastName, String email, String phone, String dni) {
    this.name = name;
    this.lastName = lastName;
    this.email = email;
    this.phone = phone;
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
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
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

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
