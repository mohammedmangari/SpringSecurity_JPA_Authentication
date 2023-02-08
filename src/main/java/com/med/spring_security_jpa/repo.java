package com.med.spring_security_jpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.med.spring_security_jpa.moduls.user;

public interface repo extends JpaRepository<user,Integer> {

	Optional<user> findByUsername(String username);
}
