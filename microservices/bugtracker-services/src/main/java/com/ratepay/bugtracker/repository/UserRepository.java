package com.ratepay.bugtracker.repository;

import com.ratepay.client.bugtracker.entities.User;
import com.ratepay.core.repository.BaseSQLRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends BaseSQLRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<Object> findByEmail(String email);
}