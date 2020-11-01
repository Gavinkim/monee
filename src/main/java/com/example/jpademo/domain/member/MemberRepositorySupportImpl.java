package com.example.jpademo.domain.member;


import com.example.jpademo.domain.auth.QAuth;
import com.example.jpademo.domain.wallet.QWallet;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MemberRepositorySupportImpl implements MemberRepositorySupport {

  private static final QMember member = QMember.member;
  private static final QWallet wallet = QWallet.wallet;
  private static final QAuth auth = QAuth.auth;

  private final JPAQueryFactory jpaQueryFactory;

  @Override
  public List<MemberDto> findByMemberId(String memberId) {
    return jpaQueryFactory.select(Projections.bean(
        MemberDto.class,
        member.memberName,
        member.memberLevel,
        member.createdAt
    )).where(MemberPredicate.eqMemberId(memberId)).fetch();
  }

  public static class MemberPredicate {

    public static Predicate eqMemberId(String memberId) {
      BooleanBuilder booleanBuilder = new BooleanBuilder();
      return booleanBuilder.and(member.memberId.eq(memberId));
    }
  }
}
