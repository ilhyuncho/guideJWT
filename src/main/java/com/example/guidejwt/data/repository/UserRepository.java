package com.example.guidejwt.data.repository;

import com.example.guidejwt.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User getByUid(String uid);
}
