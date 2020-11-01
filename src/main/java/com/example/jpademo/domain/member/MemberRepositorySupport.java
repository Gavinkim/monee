package com.example.jpademo.domain.member;

import java.util.List;

public interface MemberRepositorySupport {
  List<MemberDto> findByMemberId(String memberId);
}
