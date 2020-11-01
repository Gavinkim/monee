package com.example.jpademo.domain.member;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class MemberDto {
  private String memberName;
  private MemberLevel memberLevel;
  private LocalDateTime createdAt;

  @Builder
  public MemberDto(String memberName, MemberLevel memberLevel, LocalDateTime createdAt) {
    this.memberName = memberName;
    this.memberLevel = memberLevel;
    this.createdAt = createdAt;
  }
}
