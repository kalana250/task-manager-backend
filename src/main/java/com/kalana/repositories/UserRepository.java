package com.kalana.repositories;

import com.kalana.entities.User;
import com.kalana.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findFirstByEmail(String username);


    Optional<User> findByUserRole(UserRole userRole);
}

