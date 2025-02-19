package com.unibague.accesscontrol.repository;

import com.unibague.accesscontrol.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
