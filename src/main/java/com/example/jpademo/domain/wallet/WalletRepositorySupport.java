package com.example.jpademo.domain.wallet;

public interface WalletRepositorySupport {
  WalletDto findByMemberId(String memberId);
}
