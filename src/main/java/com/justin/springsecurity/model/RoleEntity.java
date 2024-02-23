package com.justin.springsecurity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class RoleEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Enumerated(EnumType.STRING)
  private ERole name;

  public RoleEntity() {
  }

  public RoleEntity(Long id, ERole name) {
    this.name = name;
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public ERole getName() {
    return name;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(ERole name) {
    this.name = name;
  }

}
