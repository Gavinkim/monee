package com.example.jpademo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter
@Accessors(chain = true)
@MappedSuperclass
@JsonIgnoreProperties(value = {"createdAt","updatedAt"}, allowGetters = true)
@EntityListeners({AuditingEntityListener.class})
public class BaseEntity {
  @CreationTimestamp
  @Column(nullable = false,name = "created_at")
  private LocalDateTime createdAt;

  @UpdateTimestamp
  @Column(name = "updated_at")
  private LocalDateTime updatedAt;
}
