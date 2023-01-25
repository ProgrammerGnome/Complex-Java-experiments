package com.bezkoder.spring.thymeleaf.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "tutorials")
public class Tutorial {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column(length = 128, nullable = false)
  private String name;

  @Column(length = 256)
  private String email;

  @Column(nullable = false)
  private int date;

  @Column(nullable = false)
  private int tabel;

  @Column(nullable = false)
  private int status;

  public Tutorial() {

  }

  public Tutorial(String name, String email, int date, int tabel, int status) {
    this.name = name;
    this.email = email;
    this.date = date;
    this.tabel = tabel;
    this.status = status;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getDate() {
    return date;
  }

  public void getDate(int date) {
    this.date = date;
  }

  public int getTabel() {
    return tabel;
  }

  public void setTabel(int tabel) {
    this.tabel = tabel;
  }

  public int getStatus(){
    return status;
  }
  public void setStatus(int status){this.status = status;}

  @Override
  public String toString() {
    return "Tutorial [id=" + id + ", name=" + name + ", email=" + email + ", date=" + date +", tabel=" + tabel +", status=" + status +"]";
  }

}
