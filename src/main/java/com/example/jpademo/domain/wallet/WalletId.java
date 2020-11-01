package com.example.jpademo.domain.wallet;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class WalletId implements Serializable {
  private static final long serialVersionUID = 1L;

  private String walletId;
  private String memberId;
}
