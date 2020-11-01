package com.example.jpademo.domain.wallet;

import com.example.jpademo.domain.BaseEntity;
import com.example.jpademo.domain.member.Member;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table
public class Wallet extends BaseEntity {

  @Id
  private String walletId;

  @ManyToOne(fetch = FetchType.LAZY,optional = true)
  @JoinColumns(value = {
      @JoinColumn(name = "memberId",referencedColumnName = "memberId",updatable = false,insertable = false),
      @JoinColumn(name = "authId",referencedColumnName = "authId",updatable = false,insertable = false)
  },foreignKey = @ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
  private Member member;

  @Enumerated(value = EnumType.STRING)
  private WalletType walletType;
  private String walletName;

  @Builder
  public Wallet(String walletId, Member member, String walletName,WalletType walletType) {
    this.walletId = walletId;
    this.member = member;
    this.walletName = walletName;
    this.walletType = walletType;
  }
}
