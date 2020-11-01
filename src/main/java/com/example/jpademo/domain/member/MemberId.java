package com.example.jpademo.domain.member;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class MemberId implements Serializable {
  private static final long serialVersionUID = 1L;

  private String memberId;
  private String authId;
}
