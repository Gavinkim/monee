package com.example.jpademo.domain.wallet;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class WalletDto {

  private String walletName;
  private String WalletType;
  private LocalDateTime createdAt;

  @Builder
  public WalletDto(String walletName, String walletType, LocalDateTime createdAt) {
    this.walletName = walletName;
    WalletType = walletType;
    this.createdAt = createdAt;
  }
}
