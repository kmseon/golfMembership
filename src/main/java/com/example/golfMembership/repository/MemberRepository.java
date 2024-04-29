package com.example.golfMembership.repository;

import com.example.golfMembership.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
}
