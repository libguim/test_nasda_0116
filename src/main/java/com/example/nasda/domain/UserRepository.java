package com.example.nasda.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    // 아이디로 중복 여부 확인
    boolean existsByLoginId(String loginId);

    // 이메일로 중복 여부 확인
    boolean existsByEmail(String email);

    // 닉네임으로 중복 여부 확인
    boolean existsByNickname(String nickname);

    // 로그인 시 아이디로 사용자 찾기
    Optional<UserEntity> findByLoginId(String loginId);
}