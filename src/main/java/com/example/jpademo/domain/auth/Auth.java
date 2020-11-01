package com.example.jpademo.domain.auth;

import com.example.jpademo.domain.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table
public class Auth  extends BaseEntity {

  @Id
  private String authId;
  @Enumerated(value = EnumType.STRING)
  private AuthRole authRole;

  @Builder
  public Auth(String authId, AuthRole authRole) {
    this.authId = authId;
    this.authRole = authRole;
  }
}
