package com.unibague.accesscontrol.repository;

import com.unibague.accesscontrol.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for managing User entity database operations.
 * Extends JpaRepository to provide CRUD functionality.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
