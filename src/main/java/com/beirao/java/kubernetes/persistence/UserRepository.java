package com.beirao.java.kubernetes.persistence;

import org.springframework.data.repository.CrudRepository;

import com.beirao.java.kubernetes.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
