package com.example.jpademo.domain.member;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,MemberId>,MemberRepositorySupport{

}
