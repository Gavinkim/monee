package com.example.jpademo.domain.member;

import com.example.jpademo.domain.BaseEntity;
import com.example.jpademo.domain.auth.Auth;
import com.example.jpademo.domain.wallet.Wallet;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table
@IdClass(MemberId.class)
public class Member extends BaseEntity {

  @Id
  private String memberId;

  @Id
  private String authId;

  @Enumerated(value = EnumType.STRING)
  private MemberLevel memberLevel;

  private String memberName;

  @ManyToOne
  @JoinColumn(name = "authId", referencedColumnName = "authId", updatable = false, insertable = false)
  private Auth auth;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "member")
  private List<Wallet> wallet = new ArrayList<>();

  @Builder
  public Member(String memberId, String authId,
      MemberLevel memberLevel, String memberName, Auth auth) {
    this.memberId = memberId;
    this.authId = authId;
    this.memberLevel = memberLevel;
    this.memberName = memberName;
    this.auth = auth;
  }
}
