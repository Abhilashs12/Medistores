package com.medistore.repository;

import com.medistore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
