package com.example.applemarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Member extends JpaRepository<Member, Long> {

    Optional<Member> findByEmail(String email);
    Optional<Member> findByNickname(String nickname);
}
