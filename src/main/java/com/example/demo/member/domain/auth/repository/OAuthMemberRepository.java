package com.example.demo.member.domain.auth.repository;

import com.example.demo.member.domain.auth.entity.OAuthMember;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OAuthMemberRepository extends JpaRepository<OAuthMember, Long> {
    boolean existsByOauthId(String oauthId);

    Optional<OAuthMember> findByOauthId(String oauthId);

    Optional<OAuthMember> findById(Long id);
}
