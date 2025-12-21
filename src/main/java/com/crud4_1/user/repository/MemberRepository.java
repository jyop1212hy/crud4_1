package com.crud4_1.user.repository;

import com.crud4_1.user.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findAllByDeletedAtIsNull();

    Member findByDeletedAtIsNull(Long memberId);
}
