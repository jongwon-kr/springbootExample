package com.exampleSpringboot.example.StepB.repository;

import com.exampleSpringboot.example.StepB.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * UserRepository는 JPA를 사용하여 데이터베이스 연산을 처리합니다.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}